# 실행 순서상 GROUP BY가 먼저 실행되지만 
# GROUP BY가 참조하는 SUBSTR(PRODUCT_CODE,1,2)는 SELECT에서 정의한 표현식이기 때문에
# SQL 엔진이 이를 먼저 계산하여 GROUP BY에 활용한다.

SELECT
    SUBSTR(PRODUCT_CODE,1,2) AS CATEGORY,
    COUNT(*) AS PRODUCTS
FROM
    PRODUCT
GROUP BY
    CATEGORY
ORDER BY 
    CATEGORY;