# Write your MySQL query statement below
# Using Window Function
select max(salary) AS 'SecondHighestSalary'
from  (select * , DENSE_RANK() OVER(order by salary desc) as sal_rank
        from Employee) t
where  t.sal_rank=2;