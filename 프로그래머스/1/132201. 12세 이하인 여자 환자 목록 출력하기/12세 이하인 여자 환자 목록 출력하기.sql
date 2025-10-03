-- https://velog.io/@vgo_dongv/Oracle-SQL-NULL-%EC%B2%98%EB%A6%AC-%ED%95%A8%EC%88%98
-- NVL(col, val) = col이 NULL이면 val을 반환하고, 아니면 col를 반환한다.

SELECT 
    PT_NAME, PT_NO, GEND_CD, AGE, NVL(TLNO, 'NONE') TLNO
FROM
    PATIENT
WHERE 
    AGE <= 12
AND
    GEND_CD = 'W'
ORDER BY
    AGE DESC, PT_NAME;