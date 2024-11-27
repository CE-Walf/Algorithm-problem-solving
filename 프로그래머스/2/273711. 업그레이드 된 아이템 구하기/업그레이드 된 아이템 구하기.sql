SELECT 
    ITEM_ID, 
    ITEM_NAME, 
    RARITY
FROM 
    ITEM_INFO
WHERE 
    ITEM_ID IN (
        SELECT DISTINCT 
            B.ITEM_ID
        FROM 
            ITEM_INFO A
        INNER JOIN 
            ITEM_TREE B
        ON 
            A.ITEM_ID = B.PARENT_ITEM_ID
        WHERE 
            A.RARITY = 'RARE'
    )
ORDER BY 
    ITEM_ID DESC;
