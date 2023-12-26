# Write your MySQL query statement below
# select distinct p1.email
# from Person p1 inner join Person p2
# on p1.email=p2.email;

select email
from Person
group by email
having count(email)>1;