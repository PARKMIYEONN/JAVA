SELECT COUNT(*)
  FROM LO_OUT_D;
  
SELECT *
  FROM LO_OUT_M;
  
SELECT *
  FROM LO_OUT_D;
  
SELECT DISTINCT OUTBOUND_BATCH, OUT_TYPE_DIV
  FROM LO_OUT_M;
  
SELECT INVOICE_NO, OUTBOUND_DATE
  FROM LO_OUT_M;
  
SELECT *
  FROM LO_OUT_M
 WHERE OUTBOUND_DATE = '2019-06-03'     --TO_DATE('20190603', 'YYYY-MM-DD')둘 다 쓸 수 있음
   AND OUTBOUND_NO = 'D190603-897837';  --날짜가 저렇고 출고번호가 이거인 데이터를 보여줘(보통 상수값이 들어온다)
   
SELECT *
  FROM LO_OUT_M
 WHERE OUTBOUND_DATE = TO_DATE('20190603', 'YYYY-MM-DD')
    OR OUTBOUND_NO   = 'D190603-897837';     
    
SELECT INVOICE_NO, OUTBOUND_BATCH, SET_TYPE_NM, SET_QTY
  FROM LO_OUT_M
 WHERE OUTBOUND_DATE = TO_DATE('20190603', 'YYYY-MM-DD')
   AND OUT_TYPE_DIV  IN ('M11', 'M12', 'M13')
   AND WORK_SEQ      BETWEEN 1 AND 2
   AND INVOICE_NO    LIKE '3467247280' || '%';     
 ORDER BY ITEM_NM;
 
SELECT DISTINCT ITEM_CD, ITEM_NM
  FROM LO_OUT_D
 WHERE ITEM_NM        LIKE '뉴트리플랜'||'%'
   AND ORDER_QTY      > 50
   AND OUT_TYPE_DIV_D IN ('M12', 'M15')
 GROUP BY ITEM_CD, ITEM_NM
 ORDER BY ITEM_NM;
 
SELECT ITEM_CD, ITEM_NM --위에 DISTINCT가 붙었을때랑 비교해보기
  FROM LO_OUT_D
 WHERE ITEM_NM        LIKE '뉴트리플랜'||'%'
   AND ORDER_QTY      > 50
   AND OUT_TYPE_DIV_D IN ('M12', 'M15')
 GROUP BY ITEM_CD, ITEM_NM
 ORDER BY ITEM_NM;
 
SELECT OUTBOUND_BATCH, SET_TYPE_NM, SUM(SET_QTY) AS SUM_SET_QTY   --컬럼에SUM이라는 함수를 적용해서 새로운 컬럼명을 부여한 것
  FROM LO_OUT_M
 WHERE OUTBOUND_DATE = TO_DATE('20190603', 'YYYY-MM-DD')
   AND OUT_TYPE_DIV   IN ('M11', 'M12', 'M13')
   AND WORK_SEQ       BETWEEN 1 AND 2
   AND INVOICE_NO     LIKE '346724728' || '%'
 GROUP BY OUTBOUND_BATCH, SET_TYPE_NM
 ORDER BY OUTBOUND_BATCH, SET_TYPE_NM;
 
SELECT OUTBOUND_BATCH, SET_TYPE_NM, SUM(SET_QTY) AS SUM_SET_QTY
  FROM LO_OUT_M
 WHERE OUTBOUND_DATE = TO_DATE('20190603', 'YYYY-MM-DD')
   AND OUT_TYPE_DIV IN ('M11', 'M12', 'M13')
   AND WORK_SEQ BETWEEN 1 AND 2
   AND INVOICE_NO LIKE '346724728' || '%'
 GROUP BY OUTBOUND_BATCH, SET_TYPE_NM
 HAVING SUM(SET_QTY) = 1
 ORDER BY OUTBOUND_BATCH, SET_TYPE_NM; 
 
SELECT INVOICE_NO, OUTBOUND_DATE, TO_CHAR(OUTBOUND_DATE,'YYYY-MM') AS YYYYMM, OUTBOUND_NO, OUTBOUND_BATCH, SET_TYPE_NM
  FROM LO_OUT_M
 WHERE OUTBOUND_DATE BETWEEN '2019-06-01' AND '2019-06-30';
 
SELECT TO_CHAR(OUTBOUND_DATE,'YYYY-MM') AS YYYYMM, SUM(SET_QTY)
  FROM LO_OUT_M
 WHERE OUTBOUND_DATE BETWEEN '2019-06-01' AND '2019-07-30'
 GROUP BY TO_CHAR(OUTBOUND_DATE, 'YYYY-MM')
 
SELECT TO_CHAR(OUTBOUND_DATE,'YYYY-MM') AS YYYYMM, SUM(SET_QTY)
  FROM LO_OUT_M
 WHERE OUTBOUND_DATE BETWEEN '2019-06-01' AND '2019-07-30'
 GROUP BY OUTBOUND_DATE
 ORDER BY OUTBOUND_DATE;
 
SELECT 1 AS NO
  FROM DUAL
UNION ALL
SELECT 2 AS NO
  FROM DUAL
UNION ALL
SELECT 3 AS NO
  FROM DUAL
UNION ALL
SELECT 1 AS NO
  FROM DUAL;  ---> 중복값도 모두 출력(UNION ALL)
  
SELECT 1 AS NO
FROM DUAL
UNION
SELECT 2 AS NO
FROM DUAL
UNION
SELECT 3 AS NO
FROM DUAL
UNION
SELECT 1 AS NO
FROM DUAL;  ---> 중복값은 나타내지 않음(UNION)

SELECT ROWNUM AS RNK
       ,OUTBOUND_DATE
       ,INVOICE_CNT
  FROM(
       SELECT OUTBOUND_DATE
              ,COUNT(1) AS INVOICE_CNT
         FROM LO_OUT_M
        WHERE OUTBOUND_DATE BETWEEN '2019-06-01' AND '2019-06-15'
        GROUP BY OUTBOUND_DATE
        ORDER BY INVOICE_CNT DESC
       )
 WHERE ROWNUM <= 5;
 
 SELECT ROWNUM AS RNK
       ,OUTBOUND_DATE
       ,INVOICE_CNT
  FROM(
       SELECT OUTBOUND_DATE
              ,COUNT(1) AS INVOICE_CNT
         FROM LO_OUT_M
        WHERE OUTBOUND_DATE BETWEEN '2019-06-01' AND '2019-06-15'
        GROUP BY OUTBOUND_DATE
        ORDER BY INVOICE_CNT DESC
       )
 WHERE ROWNUM <= 5;
 
SELECT BRAND_CD, COUNT(*) AS INV_CNT  -->COUNT : 레코드 수를 세줌
  FROM A_OUT_M
 GROUP BY BRAND_CD -->브랜드별로 집계를 할거다? 무조건 GROUP BY 브랜드
 ORDER BY BRAND_CD 
 
 --SELECT BRAND_CD, COUNT(*) AS INV_CNT -->브랜드 별로 하고싶으면 그룹바이 해줘
  --FROM A_OUT_M;
  
SELECT BRAND_CD, SUM(ORDER_QTY)
  FROM A_OUT_D
 WHERE BRAND_CD = '1001'
   AND ITEM_CD = 'A'
 GROUP BY BRAND_CD
   
SELECT *
  FROM A_OUT_M
  
SELECT *
  FROM A_OUT_D
  
SELECT *
  FROM A_ITEM
  
SELECT *
  FROM A_OUT_M
 WHERE OUTBOUND_DATE = '2023-01-03'
 
SELECT *
  FROM A_OUT_M
 WHERE OUTBOUND_DATE = '2023-01-04'
   AND ORDER_NM = '김민기'
   
SELECT *
  FROM A_ITEM
 WHERE ITEM_CD = 'A'
 
SELECT *
  FROM A_OUT_D
 WHERE ITEM_CD = 'C'
   AND ORDER_QTY >= 3
   
SELECT *
  FROM A_ITEM
 WHERE BRAND_CD = 1001    
 
SELECT BRAND_CD, INVOICE_NO, ORDER_NM
  FROM A_OUT_M
 WHERE OUTBOUND_DATE BETWEEN '2023-01-03' AND '2023-01-04'
 
SELECT BRAND_CD, INVOICE_NO, ITEM_CD, ORDER_QTY
  FROM A_OUT_D
 WHERE BRAND_CD = '1001'
   AND ORDER_QTY >= 3 
   AND ITEM_CD IN('A', 'B', 'C')
   

    
SELECT BRAND_CD, INVOICE_NO, OUTBOUND_DATE, ORDER_NM
  FROM A_OUT_M
 WHERE OUTBOUND_DATE BETWEEN '2023-01-03' AND '2023-01-04'
  AND ORDER_NM IN ('윤현수', '김민기')
  
SELECT BRAND_CD, INVOICE_NO, ITEM_CD, ORDER_QTY
  FROM A_OUT_D
 WHERE INVOICE_NO BETWEEN '#01' AND '#05'
   AND ITEM_CD IN ('A', 'B', 'C')
   AND ORDER_QTY >= 3
   
SELECT BRAND_CD, INVOICE_NO, OUTBOUND_DATE, ORDER_NM
  FROM A_OUT_M
 WHERE INVOICE_NO BETWEEN '#01' AND '#05'
   AND (ORDER_NM LIKE '전'|| '%' OR  ORDER_NM LIKE '권'|| '%')
    
SELECT BRAND_CD, INVOICE_NO, ITEM_CD, ORDER_QTY
  FROM A_OUT_D
 WHERE INVOICE_NO LIKE '#0' || '%'
   AND ORDER_QTY >= 3
   
    
    

    
 
 
   
   
   
   
   
   
   
   

 