# Write your MySQL query statement below
SELECT name AS Customers
FROM Customers AS c 
LEFT JOIN ORDERS AS o
ON c.id = o.customerId
WHERE o.customerId IS NULL