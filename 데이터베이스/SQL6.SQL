
SELECT RNUM, ITEM_CD, ITEM_NM, ORDER_QTY
  FROM(
       SELECT CASE WHEN ROWNUM <= 5 THEN ROWNUM  ELSE 0               END AS RNUM
             ,CASE WHEN ROWNUM <= 5 THEN ITEM_CD ELSE '99999'         END AS ITEM_CD 
             ,CASE WHEN ROWNUM <= 5 THEN ITEM_NM ELSE 'TOP5제외 합계' END AS ITEM_NM
             ,SUM(ORDER_QTY) AS ORDER_QTY
         FROM(
              SELECT --+ ORDERED USE_NL(D) INDEX(D LO_OUT_D_INXPK)
                     D.ITEM_CD, D.ITEM_NM, SUM(D.ORDER_QTY) AS ORDER_QTY
                FROM LO_OUT_M M
                     JOIN LO_OUT_D D ON D.INVOICE_NO = M.INVOICE_NO
                                    AND D.ITEM_NM    LIKE '%참치%'
               WHERE OUTBOUND_DATE BETWEEN '2019-06-01' AND '2019-06-30'
               GROUP BY ITEM_CD, ITEM_NM
               ORDER BY ORDER_QTY DESC
              )
              GROUP BY CASE WHEN ROWNUM <= 5 THEN ROWNUM  ELSE 0               END
                      ,CASE WHEN ROWNUM <= 5 THEN ITEM_CD ELSE '99999'         END
                      ,CASE WHEN ROWNUM <= 5 THEN ITEM_NM ELSE 'TOP5제외 합계' END
      )
 ORDER BY CASE WHEN RNUM = 0 THEN 2 ELSE 1 END, RNUM
 
 
----------------------------------------------------------------------------------------------이 위에 혼자 풀어본 거 

SELECT DAYY
      ,TO_DATE(SUBSTR(ORDER_QTY,11,8),'YYYY-MM-DD') AS OUTBOUND_DATE   --> 어차피 결과가 요일이 하나밖에 안나오니까 이렇게 사용해도 되는데
      ,TO_NUMBER(SUBSTR(ORDER_QTY,1,10))             AS ORDER_QTY 
  FROM(
       SELECT DAYY,MAX(HAP)AS ORDER_QTY
         FROM(                                                                    
               SELECT --+ ORDERED USE_NL(D) INDEX(D LO_OUT_D_INXPK)    --> 결과에 날짜가 없는 경우에는 안에서부터 차례차례 D를 만들어서 마지막에 사용해 주어야 한다!
                      TO_CHAR(OUTBOUND_DATE, 'DY')AS DAYY, OUTBOUND_DATE, SUM(ORDER_QTY) AS ORDER_QTY
                     ,TO_CHAR(LPAD(SUM(ORDER_QTY),10,'0')||TO_CHAR(OUTBOUND_DATE,'YYYYMMDD'))AS HAP
                 FROM LO_OUT_M M
                      JOIN LO_OUT_D D ON D.INVOICE_NO = M.INVOICE_NO
                WHERE OUTBOUND_DATE BETWEEN '2019-09-01' AND '2019-09-30'
                GROUP BY TO_CHAR(OUTBOUND_DATE, 'DY'), OUTBOUND_DATE
                ORDER BY TO_CHAR(OUTBOUND_DATE, 'D'), HAP
              )
         GROUP BY DAYY
       )
 ORDER BY TO_CHAR(OUTBOUND_DATE,'D');

---------------   


SELECT --+ ORDERED USE_NL(D) INDEX(D LO_OUT_D_INXPK)
       OUTBOUND_DATE,SUM(ORDER_QTY)AS SUM_QTY
  FROM LO_OUT_M M
       JOIN LO_OUT_D D ON D.INVOICE_NO = M.INVOICE_NO  
       JOIN CS_NO    C ON NO <= 20  
 GROUP BY OUTBOUND_DATE, NO  
  




SELECT MAX(SUM_QTY)AS MAX_QTY
     , MIN(SUM_QTY)AS MIN_QTY
     , ROUND(AVG(SUM_QTY))AS AVG_QTY
  FROM (
        SELECT --+ ORDERED USE_NL(D) INDEX(D LO_OUT_D_INXPK)
               OUTBOUND_DATE, SUM(ORDER_QTY)AS SUM_QTY
          FROM LO_OUT_M M
               JOIN LO_OUT_D D ON D.INVOICE_NO = M.INVOICE_NO
         WHERE OUTBOUND_DATE IN (
                                SELECT OUT_DATE
                                  FROM (
                                         SELECT NO, TO_DATE('20190903', 'YYYY-MM-DD')+ NO - 1 AS OUT_DATE
                                           FROM CS_NO
                                          WHERE NO <= 10
                                        ) M1 
                                 WHERE EXISTS(
                                              SELECT 1
                                                FROM LO_OUT_M S1
                                               WHERE S1.OUTBOUND_DATE = M1.OUT_DATE 
                                             )
                                   AND ROWNUM <= 7  
                                 )
         GROUP BY OUTBOUND_DATE
        )

 
------------------------------------------------------------------------------------------> 인라인 뷰 줄여라....


SELECT ITEM_CD
       ,MAX_DATE
       ,CASE MAX_BATCH WHEN 'ZZZ' THEN '001' ELSE MAX_BATCH END AS MAX_BATCH
  FROM(
       SELECT ITEM_CD
             ,TO_CHAR(TO_DATE(SUBSTR(HAP,5,8)),'YYYY/MM/DD')AS MAX_DATE
             ,SUBSTR(HAP,1,3)AS MAX_BATCH
         FROM(
              SELECT ITEM_CD
                    ,MAX(HAP)AS HAP
                FROM(
                     SELECT --+ ORDERED USE_NL(D) INDEX(D LO_OUT_D_INXPK)
                            D.ITEM_CD, M.OUTBOUND_DATE, M.OUTBOUND_BATCH
                           ,DECODE(M.OUTBOUND_BATCH,'001','ZZZ',M.OUTBOUND_BATCH)||'-'||TO_CHAR(OUTBOUND_DATE,'YYYYMMDD')AS HAP
                       FROM LO_OUT_M M
                            JOIN LO_OUT_D D ON D.INVOICE_NO = M.INVOICE_NO
                                           AND D.ITEM_CD    IN('30500', '73510')
                       WHERE M.OUTBOUND_DATE BETWEEN '2019-09-01' AND '2019-09-19'            
                    ) 
              GROUP BY ITEM_CD
              )
       )
     


SELECT WEEK_OF_YEAR, ORDER_QTY
      ,CASE WHEN ORDER_QTY >= 900000 THEN 'A'
            WHEN ORDER_QTY >= 800000 THEN 'B'
            WHEN ORDER_QTY >= 700000 THEN 'C'
            WHEN ORDER_QTY >= 600000 THEN 'D'
                                     ELSE 'F'
        END AS GRADE
 FROM (
       SELECT --+ ORDERED USE_NL(D) INDEX(D LO_OUT_D_INXPK)
             TO_CHAR(M.OUTBOUND_DATE, 'IW') AS WEEK_OF_YEAR
            ,SUM(D.ORDER_QTY) AS ORDER_QTY
        FROM LO_OUT_M M
             JOIN LO_OUT_D D ON D.INVOICE_NO = M.INVOICE_NO
       WHERE M.OUTBOUND_DATE BETWEEN '2019-01-01' AND '2019-12-31'
       GROUP BY TO_CHAR(M.OUTBOUND_DATE, 'IW') 
       ORDER BY WEEK_OF_YEAR
       )                
      
 
 
 
 
 
 
 
 
 
 
 
 


 