# Write your MySQL query statement below
SELECT email AS Email FROM Person group by email having count(email)>1;