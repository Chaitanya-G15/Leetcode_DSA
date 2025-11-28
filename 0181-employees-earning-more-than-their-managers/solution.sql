# Write your MySQL query statement below
SELECT e.name AS Employee
FROM Employee e
JOIN Employee M ON e.ManagerId = M.id
WHERE e.salary > M.salary;
