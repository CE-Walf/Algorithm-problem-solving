SELECT HOUR, COUNT(*) AS COUNT
FROM 
    ANIMAL_OUTS AS A
INNER JOIN (
    SELECT ANIMAL_ID, HOUR(DATETIME) AS HOUR
    FROM ANIMAL_OUTS
) AS B
ON
    A.ANIMAL_ID = B.ANIMAL_ID
WHERE 
    HOUR BETWEEN 9 AND 19
GROUP BY 
    HOUR
ORDER BY 
    HOUR ASC;