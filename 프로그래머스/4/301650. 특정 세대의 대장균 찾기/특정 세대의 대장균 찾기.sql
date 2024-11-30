WITH RECURSIVE GenerationCTE 
AS (
    SELECT
        ID,
        PARENT_ID,
        1 AS Generation
    FROM
        ECOLI_DATA
    WHERE
        PARENT_ID IS NULL
    
    UNION ALL
    
    SELECT 
        E.ID,
        E.PARENT_ID,
        G.Generation + 1
    FROM 
        ECOLI_DATA AS E
    INNER JOIN
        GenerationCTE AS G
    ON 
        E.PARENT_ID = G.ID
)

SELECT 
    ID
FROM 
    GenerationCTE
WHERE
    Generation = 3
ORDER BY
    ID ASC;