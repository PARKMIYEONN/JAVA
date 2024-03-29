SELECT BRAND_CD, INVOICE_NO, ITEM_CD, ORDER_QTY
  FROM A_OUT_D
 WHERE ORDER_QTY >= 3
   AND INVOICE_NO LIKE '#0' || '%'
 ORDER BY ORDER_QTY DESC;
  
SELECT BRAND_CD, INVOICE_NO, ITEM_CD, ORDER_QTY
  FROM A_OUT_D
 WHERE ORDER_QTY >= 3
   AND INVOICE_NO LIKE '#0' || '%'
 ORDER BY ORDER_QTY DESC, ITEM_CD ASC;   ----> ASC(오름차순)은 디폴트값이라서 안써도 됨. 안 쓰는 게 좋아..
                                        ----> 언제나 WHERE조건이 먼저 적용이 되고 ORDER BY가 실행이 된다. 잊지마!!!!

SELECT ROWNUM, BRAND_CD, INVOICE_NO, ITEM_CD, ORDER_QTY  --> ORDER BY로 정렬을 하기 전에 ROWNUM이 먼저 정해져 버렸다.
  FROM A_OUT_D
 WHERE ORDER_QTY >= 3
   AND INVOICE_NO LIKE '#0' || '%'
 ORDER BY ORDER_QTY DESC, ITEM_CD;
 
SELECT ROWNUM AS RNUM                          ----> 여기서 ROWNUM을 쓰면ORDER BY 된 뒤에 정해줄 수 있다.
      ,BRAND_CD, INVOICE_NO, ITEM_CD, ORDER_QTY     
  FROM(
      SELECT BRAND_CD, INVOICE_NO, ITEM_CD, ORDER_QTY
        FROM A_OUT_D
       WHERE ORDER_QTY >= 3
         AND INVOICE_NO LIKE '#0' || '%'
       ORDER BY ORDER_QTY DESC
      )
  WHERE ROWNUM <= 3                          ----> ROWNUM은 여기서도 정해지기 때문에 표시되지 않아도 되면 굳이 처음에 지정해줄 필요 없다.
  
SELECT COUNT(*) AS INVOICE_NO
  FROM A_OUT_M
 WHERE OUTBOUND_DATE BETWEEN :OUTBOUND_DATE1 AND :OUTBOUND_DATE2
 
SELECT COUNT(*) AS INVOICE_NO
  FROM A_OUT_M
 WHERE OUTBOUND_DATE BETWEEN :OUTBOUND_DATE1 AND :OUTBOUND_DATE2
   AND BRAND_CD = '1001'

SELECT SUM(ORDER_QTY) AS SUM_QTY
  FROM A_OUT_D
 WHERE BRAND_CD = '1001'
 
SELECT BRAND_CD, COUNT(1) AS INVOICE_NO
  FROM A_OUT_M
 GROUP BY BRAND_CD;
 
SELECT BRAND_CD, OUTBOUND_DATE, COUNT(*) AS INVOICE_NO
  FROM A_OUT_M
 GROUP BY BRAND_CD, OUTBOUND_DATE
 ORDER BY BRAND_CD;
 
SELECT BRAND_CD, SUM(ORDER_QTY)
  FROM A_OUT_D
 GROUP BY BRAND_CD;
 
SELECT BRAND_CD, ITEM_CD, SUM(ORDER_QTY)
  FROM A_OUT_D
 GROUP BY BRAND_CD, ITEM_CD
 ORDER BY BRAND_CD;


SELECT BRAND_CD, MIN(ORDER_QTY) AS MIN_QTY, MAX(ORDER_QTY) AS MAX_QTY
  FROM A_OUT_D
 GROUP BY BRAND_CD
 
SELECT COUNT(INVOICE_NO)
  FROM A_OUT_D;
  
SELECT COUNT(DISTINCT INVOICE_NO)   --->위와 아래의 결과와  차이점 잘 알아두기
  FROM A_OUT_D;
  
SELECT INVOICE_NO, OUTBOUND_DATE, OUT_TYPE_DIV, OUT_BOX_DIV, OUT_BOX_NM
  FROM LO_OUT_M
 WHERE OUTBOUND_DATE BETWEEN :OUTBOUND_DATE1 AND :OUTBOUND_DATE2
   AND OUT_TYPE_DIV IN('M15', 'M22')
   AND OUT_BOX_DIV LIKE 'F%'
   AND ORDER_PLACE = '52685'
 ORDER BY OUTBOUND_DATE, INVOICE_NO;
   
SELECT OUTBOUND_DATE
      , COUNT(*)                    AS TOT_CNT           ---> COUNT(1)로 써도 맞는 값이 나온다
      , COUNT(DISTINCT OUT_BOX_DIV) AS OUT_BOX_CNT
      , MIN(OUT_BOX_DIV)            AS OUT_BOX_MIN                        
      , MAX(OUT_BOX_DIV)            AS OUT_BOX_MAX
  FROM LO_OUT_M
 WHERE OUTBOUND_DATE BETWEEN :OUTBOUND_DATE1 AND :OUTBOUND_DATE2
   AND OUT_TYPE_DIV  IN('M15', 'M22')
   AND OUT_BOX_DIV   LIKE 'F%'
   AND ORDER_PLACE   = '52685'
 GROUP BY OUTBOUND_DATE
 ORDER BY OUTBOUND_DATE;
 
 
SELECT BRAND_CD, MAX(SUM_QTY), MIN(SUM_QTY)
  FROM(
       SELECT BRAND_CD, ITEM_CD, SUM(ORDER_QTY) AS SUM_QTY
         FROM A_OUT_D
        GROUP BY BRAND_CD, ITEM_CD
        ORDER BY BRAND_CD, ITEM_CD
       )
 GROUP BY BRAND_CD
 ORDER BY BRAND_CD;
 
  SELECT BRAND_CD, ITEM_CD, SUM(ORDER_QTY) AS SUM_QTY
         FROM A_OUT_D
        GROUP BY BRAND_CD, ITEM_CD
        ORDER BY BRAND_CD, ITEM_CD;

SELECT COUNT(*)           AS CNT1
      ,COUNT(CD)          AS CNT2
      ,COUNT(DISTINCT CD) AS CNT3
      ,COUNT(QTY)         AS CNT4
      ,COUNT(1)           AS CNT5   -->
      ,COUNT(CONST)       AS CNT6   --> 위아래 둘 다 저 값들로 컬럼을 채워주니까 NULL값이 생길 수 없다. 즉 컬럼의 길이를 알 수 있음!
FROM (      
      SELECT CD, QTY, '폴리텍'AS CONST
        FROM(
             SELECT 'A' AS CD, 1    AS QTY FROM DUAL UNION ALL
             SELECT 'B' AS CD, 2    AS QTY FROM DUAL UNION ALL
             SELECT 'C' AS CD, NULL AS QTY FROM DUAL UNION ALL
             SELECT 'C' AS CD, 4    AS QTY FROM DUAL UNION ALL
             SELECT 'E' AS CD, 5    AS QTY FROM DUAL  
             )
       )
       
SELECT OUTBOUND_DATE
      ,INVOICE_NO
      ,OUT_TYPE_DIV
  FROM LO_OUT_M M1
 WHERE M1.OUTBOUND_DATE = '2019-09-03'
   AND M1.INVOICE_NO BETWEEN '352613619120' AND '352613619150'
   AND EXISTS (
               SELECT 1
               FROM LO_OUT_D S1
              WHERE S1.INVOICE_NO = M1.INVOICE_NO
                AND S1.ORDER_QTY > 100
              )



              
SELECT M1.OUTBOUND_DATE
      ,M1.INVOICE_NO
      ,M1.OUT_TYPE_DIV
      ,(
        SELECT SUM(S1.ORDER_QTY) --AS SUM_ORDER_QTY 어차피 사용되는 건 마지막에 나오는 AS니까
        FROM LO_OUT_D S1
       WHERE S1.INVOICE_NO = M1.INVOICE_NO
      )AS SUM_QTY
  FROM LO_OUT_M M1
 WHERE M1.INVOICE_NO LIKE '3467247026%';   

SELECT *
  FROM A_OUT_D
 WHERE (INVOICE_NO, BRAND_CD) IN(
                     SELECT INVOICE_NO, BRAND_CD
                       FROM A_OUT_M
                      WHERE OUTBOUND_DATE = :OUTBOUND_DATE
                       )
 ORDER BY BRAND_CD, INVOICE_NO
            
SELECT *
  FROM A_OUT_D
 WHERE (INVOICE_NO, BRAND_CD) IN
                    (      
                    SELECT INVOICE_NO, BRAND_CD
                      FROM A_OUT_M
                     WHERE BRAND_CD     = '1001'
                       AND OUT_TYPE_DIV LIKE 'M1%'
                     )
 ORDER BY BRAND_CD, INVOICE_NO

---------------------------------------!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
                       
SELECT *
  FROM A_OUT_M
 WHERE (BRAND_CD, INVOICE_NO) IN(                  
                                SELECT BRAND_CD, INVOICE_NO
                                  FROM A_OUT_D
                                 GROUP BY BRAND_CD, INVOICE_NO             
                                 HAVING SUM(ORDER_QTY) >= 3                 
                                 )

                              
SELECT M1.BRAND_CD
      ,M1.ITEM_CD
      ,SUM(M1.ORDER_QTY) AS SUM_QTY
      ,(
        SELECT S1.ITEM_NM
          FROM A_ITEM S1
         WHERE S1.BRAND_CD = M1.BRAND_CD 
           AND S1.ITEM_CD  = M1.ITEM_CD
      ) AS ITEM_NM
  FROM A_OUT_D M1
 GROUP BY M1.BRAND_CD, M1.ITEM_CD
 
 SELECT DISTINCT OUTBOUND_DATE
   FROM LO_OUT_M
  WHERE OUTBOUND_DATE BETWEEN :OUTBOUND_DATE AND :OUTBOUND_DATE + 10
  ORDER BY OUTBOUND_DATE
  
 SELECT DISTINCT OUTBOUND_DATE
   FROM LO_OUT_M
  WHERE OUTBOUND_DATE BETWEEN :OUTBOUND_DATE AND :OUTBOUND_DATE + 10
  GROUP BY OUTBOUND_DATE
  ORDER BY OUTBOUND_DATE             -->모든 레코드를 다 읽음 약간 낭비야.....

SELECT *
  FROM(  
SELECT TO_DATE('20190615', 'YYYY-MM-DD') + NO AS OUT_DATE
  FROM CS_NO   --->만개짜리 테이블
 WHERE NO <= 10
 ) M1
 WHERE EXISTS(
              SELECT 1
                FROM LO_OUT_M S1
               WHERE S1.OUTBOUND_DATE = M1.OUT_DATE
             )    
 
SELECT M1.INVOICE_NO
      ,M1.OUT_TYPE_DIV
      ,M1.OUT_BOX_DIV
      , 
      (SELECT MAX(S1.ORDER_QTY)
         FROM LO_OUT_D S1
        WHERE S1.INVOICE_NO = M1.INVOICE_NO
      ) AS MAX_QTY
  FROM LO_OUT_M M1
 WHERE OUTBOUND_DATE = '2019-06-03'
   AND OUTBOUND_NO   BETWEEN 'D190603-897353' AND 'D190603-897360'   
   
SELECT INVOICE_NO
      ,OUT_TYPE_DIV
      ,OUT_BOX_DIV
      , 
      (SELECT MAX(ORDER_QTY)
         FROM LO_OUT_D S1
        WHERE S1.INVOICE_NO = M1.INVOICE_NO
      ) AS MAX_ORDER_QTY
  FROM LO_OUT_M M1
 WHERE OUTBOUND_DATE = '2019-06-03'
   AND OUTBOUND_NO   BETWEEN 'D190603-897353' AND 'D190603-897360'  
   
SELECT M1.INVOICE_NO
      ,M1.OUT_TYPE_DIV
      ,M1.OUT_BOX_DIV
      ,SUBSTR(OUT_TYPE_DIV, 2, 2) AS SUB_VAL
      ,1   AS VAL1
      ,'A' AS VAL2
      ,OUT_TYPE_DIV || '-' || OUT_BOX_DIV AS AAA
      ,LENGTH(INVOICE_NO) AS BBB
      ,TO_CHAR(OUTBOUND_DATE, 'YYYY-MM') AS CCC
      ,TO_CHAR(OUTBOUND_DATE, 'YY-MM') AS DDD
      ,TO_CHAR(OUTBOUND_DATE, 'WW') AS TTT  --> 그 해의 몇주차냐(분기별 주별 반기별 등 이용가능)
      ,TO_CHAR(OUTBOUND_DATE, 'Q') AS QQQ   --> 몇분기냐
      , 
      (SELECT MAX(S1.ORDER_QTY)
         FROM LO_OUT_D S1
        WHERE S1.INVOICE_NO = M1.INVOICE_NO
      ) AS MAX_QTY
  FROM LO_OUT_M M1
 WHERE OUTBOUND_DATE = '2019-06-03'
   AND OUTBOUND_NO   BETWEEN 'D190603-897353' AND 'D190603-897360'  
   
SELECT SYSDATE        AS CUR_DATETIME                    --> 현재 날짜와 시간을 알려주는 함수(?)
      ,TRUNC(SYSDATE) AS CUR_DATE                        --> 현재 날짜를 알려줌 TRUNC(시분초를 자른다!)
      ,SYSDATE + 1    AS TOMORROW                        --> 하루 더해진 날짜(날짜 연산이 가능!) 
      ,SUBSTR('ABCD1234', 1, 5) AS VAL1                  --> SUBSTR 스트링의 부분만 가져오는 함수! 여기선 첫번재부터 5번째까지 자른다!
      ,SUBSTR(LPAD(34, 5, '0'), 1, 3) AS LEFT_PADDING    --> 34라는 값을 5자리로 맞추고 왼쪽에 남는 칸은 0으로 채워라 그 값에 SUBSTR를 또 적용한 값은?
  FROM DUAL                                              --> 임시테이블 DUAL은 이런 식으로 사용하는 것! 함수를 적용하면 어떤 값이 나오는지 궁금할 때 사용해봐
 
 
SELECT MAX(LPAD(ORDER_QTY, 3, '0') || LPAD(LINE_NO, 3, '0')) AS MAX_VAL
  FROM LO_OUT_D S1
 WHERE S1.INVOICE_NO = M1.INVOICE_NO
 
 
SELECT INVOICE_NO
      ,OUT_TYPE_DIV
      ,OUT_BOX_DIV
      ,( 
     SELECT MAX(LPAD(ORDER_QTY, 10, '0') || LPAD(LINE_NO, 10, '0')) AS MAX_VAL
  FROM LO_OUT_D S1
 WHERE S1.INVOICE_NO = M1.INVOICE_NO
 ) AS VAL
  FROM LO_OUT_M M1
 WHERE OUTBOUND_DATE = '2019-06-03'
   AND OUTBOUND_NO   BETWEEN 'D190603-897353' AND 'D190603-897360'  
 
SELECT BRAND_CD
      ,ITEM_CD
      ,ITEM_NM
      ,QTY_IN_BOX
      ,(
        SELECT SUM(ORDER_QTY)
          FROM A_OUT_D S1
         WHERE S1.ITEM_CD = M1.ITEM_CD
       ) AS SUM_QTY
 FROM A_ITEM M1
 
 
-------------> 조인을 이용한 풀이 
SELECT M1.BRAND_CD
      ,M1.ITEM_CD
      ,C1.ITEM_NM
      ,C1.QTY_IN_BOX
      ,SUM(ORDER_QTY)
  FROM A_OUT_D M1
      JOIN A_ITEM C1 ON C1.BRAND_CD = M1.BRAND_CD
                    AND C1.ITEM_CD  = M1.ITEM_CD
 GROUP BY M1.BRAND_CD, M1.ITEM_CD, C1.ITEM_NM, C1.QTY_IN_BOX
 ORDER BY M1.BRAND_CD, M1.ITEM_CD 


SELECT L1.BRAND_CD
      ,L1.ITEM_CD
      ,L1.SUM_QTY
      ,(
        SELECT S1.ITEM_NM
          FROM A_ITEM S1
         WHERE S1.BRAND_CD = L1.BRAND_CD
           AND S1.ITEM_CD  = L1.ITEM_CD
       ) AS VAL
      ,(
        SELECT S1.QTY_IN_BOX
          FROM A_ITEM S1
         WHERE S1.BRAND_CD = L1.BRAND_CD
           AND S1.ITEM_CD  = L1.ITEM_CD 
  FROM (
        SELECT  M1.BRAND_CD
               ,M1.ITEM_CD
               ,SUM(ORDER_QTY)AS SUM_QTY
          FROM A_OUT_D M1
         GROUP BY M1.BRAND_CD, M1.ITEM_CD
         ORDER BY M1.BRAND_CD, M1.ITEM_CD
  ) L1;
  
----------------------------------------------------------------------  

--4)박스입수와 상품명을 분리
SELECT BRAND_CD, ITEM_CD, SUM_QTY,VAL
      ,TO_NUMBER(SUBSTR(VAL, 3, 1))   AS QTY_IN_BOX
      ,SUBSTR(VAL, 4, 100)            AS ITEM_NM
  FROM(--3)박스입수와 상품명을 연결하여 하나의 컬럼으로 가져옴   
       SELECT L1.BRAND_CD
             ,L1.ITEM_CD
             ,L1.SUM_QTY
             ,(--2)삼품명과 박스입수를 가져오는 스칼라쿼리
               SELECT LPAD(S1.QTY_IN_BOX, 3, '0') || S1.ITEM_NM
                 FROM A_ITEM S1
                WHERE S1.BRAND_CD = L1.BRAND_CD
                  AND S1.ITEM_CD  = L1.ITEM_CD
              ) AS VAL
         FROM (--1)브랜드/ 상품별 주문수량 합계를 구함
               SELECT  M1.BRAND_CD 
                      ,M1.ITEM_CD
                      ,SUM(ORDER_QTY)AS SUM_QTY
                 FROM A_OUT_D M1
                GROUP BY M1.BRAND_CD, M1.ITEM_CD
                ORDER BY M1.BRAND_CD, M1.ITEM_CD
         ) L1
    );
    
--------------------------------------------------------------------------  

  
SELECT BRAND_CD, ITEM_CD, ITEM_NM, SUM_QTY, QTY_IN_BOX
      ,TRUNC(SUM_QTY/QTY_IN_BOX) AS BOX_CNT
      ,MOD(SUM_QTY, QTY_IN_BOX) AS PCS_CNT
  FROM
      (  
    --4)박스입수와 상품명을 분리
SELECT BRAND_CD, ITEM_CD, SUM_QTY
      ,TO_NUMBER(SUBSTR(VAL, 3, 1))   AS QTY_IN_BOX
      ,SUBSTR(VAL, 4, 100)            AS ITEM_NM
  FROM(--3)박스입수와 상품명을 연결하여 하나의 컬럼으로 가져옴   
       SELECT L1.BRAND_CD
             ,L1.ITEM_CD
             ,L1.SUM_QTY
             ,(--2)삼품명과 박스입수를 가져오는 스칼라쿼리
               SELECT LPAD(S1.QTY_IN_BOX, 3, '0') || S1.ITEM_NM
                 FROM A_ITEM S1
                WHERE S1.BRAND_CD = L1.BRAND_CD
                  AND S1.ITEM_CD  = L1.ITEM_CD
              ) AS VAL
         FROM (--1)브랜드/ 상품별 주문수량 합계를 구함
               SELECT  M1.BRAND_CD 
                      ,M1.ITEM_CD
                      ,SUM(ORDER_QTY)AS SUM_QTY
                 FROM A_OUT_D M1
                GROUP BY M1.BRAND_CD, M1.ITEM_CD
                ORDER BY M1.BRAND_CD, M1.ITEM_CD
         ) L1
    )
    );
    
-------------------------------------------------------------
    
SELECT *  
  FROM(  
       SELECT BRAND_CD, ITEM_CD, ITEM_NM, SUM_QTY, QTY_IN_BOX
             ,TRUNC(SUM_QTY/QTY_IN_BOX) AS BOX_CNT
             ,MOD(SUM_QTY, QTY_IN_BOX) AS PCS_CNT
         FROM
             (  
           --4)박스입수와 상품명을 분리
       SELECT BRAND_CD, ITEM_CD, SUM_QTY
             ,TO_NUMBER(SUBSTR(VAL, 3, 1))   AS QTY_IN_BOX
             ,SUBSTR(VAL, 4, 100)            AS ITEM_NM
         FROM(--3)박스입수와 상품명을 연결하여 하나의 컬럼으로 가져옴   
              SELECT L1.BRAND_CD
                    ,L1.ITEM_CD
                    ,L1.SUM_QTY
                    ,(--2)삼품명과 박스입수를 가져오는 스칼라쿼리
                      SELECT LPAD(S1.QTY_IN_BOX, 3, '0') || S1.ITEM_NM
                        FROM A_ITEM S1
                       WHERE S1.BRAND_CD = L1.BRAND_CD
                         AND S1.ITEM_CD  = L1.ITEM_CD
                     ) AS VAL
                FROM (--1)브랜드/ 상품별 주문수량 합계를 구함
                      SELECT  M1.BRAND_CD 
                             ,M1.ITEM_CD
                             ,SUM(ORDER_QTY)AS SUM_QTY
                        FROM A_OUT_D M1
                       GROUP BY M1.BRAND_CD, M1.ITEM_CD
                       ORDER BY M1.BRAND_CD, M1.ITEM_CD
                ) L1
              )
           )
          ORDER BY BOX_CNT DESC     -----> 안쪽 셀렉트 절에서 이미 선언된 것이라서 오더바이는 마지막에 되니까 설정해준 이름을 써도 가능하다
    )
    WHERE ROWNUM <= 3;
 
    
SELECT ROWNUM AS RNK
       ,ITEM_CD, QTY_IN_BOX, SUM_QTY
       ,TRUNC(SUM_QTY/QTY_IN_BOX) AS BOX_CNT
       ,MOD(SUM_QTY, QTY_IN_BOX)  AS PCS_CNT
       ,CEIL(SUM_QTY/QTY_IN_BOX)  AS BOX_CNT_TOT
  FROM(    
       SELECT ITEM_CD, QTY_IN_BOX, SUM(ORDER_QTY) AS SUM_QTY
       FROM LO_OUT_D
       WHERE INVOICE_NO BETWEEN '346724706262' AND '346724706762'
       GROUP BY ITEM_CD, QTY_IN_BOX   --->이렇게 그룹을 지어줘야 집계가 가능하다!!!
       ORDER BY SUM_QTY DESC
       )      
WHERE ROWNUM <= 5;










 
                                                