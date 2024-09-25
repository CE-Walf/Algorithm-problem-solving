SELECT A.CAR_ID, IF(B.CAR_ID IS NULL, '대여 가능', '대여중') as AVAILABILITY
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY AS A
LEFT JOIN (
    SELECT CAR_ID
    FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
    WHERE START_DATE <= '2022-10-16' AND END_DATE >= '2022-10-16'
    GROUP BY CAR_ID
) AS B
ON A.CAR_ID = B.CAR_ID
GROUP BY A.CAR_ID
ORDER BY A.CAR_ID DESC;
