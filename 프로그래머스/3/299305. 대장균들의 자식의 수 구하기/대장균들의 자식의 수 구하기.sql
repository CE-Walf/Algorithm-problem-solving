SELECT
    ED.ID,
    COUNT(TEMP.ID) AS CHILD_COUNT 
FROM
    ECOLI_DATA AS ED
LEFT JOIN
    (
        SELECT ID, PARENT_ID
        FROM ECOLI_DATA
        WHERE PARENT_ID IS NOT NULL
    ) AS TEMP
ON
    ED.ID = TEMP.PARENT_ID
GROUP BY 
    ED.ID
ORDER BY 
    ED.ID ASC;