
-------------------------------------------------------1번

SELECT TO_CHAR(OUTBOUND_DATE, 'YYYY-MM')AS OUT_DATE
      ,COUNT(1)AS INV_CNT 
      ,SUM(SET_QTY)AS SET_QTY
  FROM LO_OUT_M
 WHERE OUTBOUND_DATE BETWEEN '2019-06-01' AND '2019-08-31'
 GROUP BY TO_CHAR(OUTBOUND_DATE, 'YYYY-MM')
 ORDER BY TO_CHAR(OUTBOUND_DATE, 'YYYY-MM')
 
--------------------------------------------------------2번

SELECT OUT_TYPE_DIV, SUM(ORDER_QTY)AS SUM_QTY
  FROM LO_OUT_M M
       JOIN LO_OUT_D D ON D.INVOICE_NO = M.INVOICE_NO
 WHERE OUTBOUND_DATE = '2019-09-03'
 GROUP BY OUT_TYPE_DIV
 HAVING   SUM(ORDER_QTY) >= 5000 
 ORDER BY CASE WHEN OUT_TYPE_DIV LIKE 'M1%' THEN SUM_QTY END
         ,SUM_QTY DESC
 
 
 
 
 
--------------------------------------------------------3번

SELECT CASE WHEN ROWNUM <= 10 THEN TO_CHAR(OUTBOUND_DATE) ELSE 'ETC' END AS OUT_DATE
      ,CASE WHEN ROWNUM <= 10 THEN ITEM_CD                ELSE '   ' END AS ITE_CD
      ,CASE WHEN ROWNUM <= 10 THEN ITEM_NM                ELSE '   ' END AS ITEM_NM
      ,SUM(SUM_QTY) AS SUM_QTY    
  FROM (
        SELECT OUTBOUND_DATE, ITEM_CD, ITEM_NM, SUM(ORDER_QTY)AS SUM_QTY
          FROM LO_OUT_M M
               JOIN LO_OUT_D D ON D.INVOICE_NO = M.INVOICE_NO
                              AND D.ITEM_NM   LIKE '%참치%'
         WHERE OUTBOUND_DATE BETWEEN '2019-06-01' AND '2019-06-30'
         GROUP BY OUTBOUND_DATE, ITEM_CD, ITEM_NM
         ORDER BY SUM_QTY DESC  
        ) 
 GROUP BY CASE WHEN ROWNUM <= 10  THEN TO_CHAR(OUTBOUND_DATE) ELSE 'ETC' END
         ,CASE WHEN ROWNUM <= 10 THEN ITEM_CD                 ELSE '   ' END
         ,CASE WHEN ROWNUM <= 10 THEN ITEM_NM                 ELSE '   ' END                           
 ORDER BY CASE WHEN OUT_DATE = 'ETC' THEN 2 ELSE 1 END, SUM_QTY DESC

 
--------------------------------------------------------------------------------4번


        SELECT C.NO ||'단' AS DANSU, C.NO ||'X'||S.NO|| '=' ||S.NO*C.NO AS CONTENTS
          FROM CS_NO C
               JOIN CS_NO S ON S.NO <= 9
                        WHERE C.NO BETWEEN 2 AND 9         

 
       















 
 
 
 
   
 