# Write your MySQL query statement below
SELECT name FROM Customer
#Here we replace all the null value to 0 and then make the comparison 
WHERE COALESCE(referee_id, 1) != 2