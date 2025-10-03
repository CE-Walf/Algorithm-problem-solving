-- 조인한 테이블에서 두 테이블에 중복으로 존재하지 않는 필드명일 경우 Alias를 작성하지 않아도 된다.
-- ORACLE의 경우에는 문자열 입력시 큰따옴표가 아닌 작은따옴표로 감싸야한다. (MYSQL은 둘다 가능)

SELECT A.FLAVOR
FROM FIRST_HALF A
INNER JOIN ICECREAM_INFO B 
ON A.FLAVOR = B.FLAVOR
WHERE TOTAL_ORDER >= 3000
AND INGREDIENT_TYPE = 'fruit_based'
ORDER BY TOTAL_ORDER DESC;