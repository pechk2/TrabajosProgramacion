-- MySQL Aggregate Functions and Group by

USE hr;

-- 1. Write a query to list the number of jobs available in the employees table.

-- 2. Write a query to get the total salaries payable to employees.

-- 3. Write a query to get the minimum salary from employees table. 

-- 4. Write a query to get the maximum salary of an employee working as a Programmer
select max(salary) as 'maxim'
from employees
where JOB_ID='IT_PROG';
-- 5. Write a query to get the average salary and number of employees working on the department 90.
select avg(SALARY) as 'Salario medio',
count(*) as 'Número de trabajadores'
from employees
where DEPARTMENT_ID=90;
-- 6. Write a query to get the highest, lowest, sum, and average salary of all employees.
select max(salary) as 'maxim' ,
min(salary) as 'min' ,
sum(salary) as 'sum' ,
avg(salary) as 'avg'
from employees;
-- 7. Write a query to get the number of employees with the same job (that is, the same job_id)
select count(*), job_id
from employees
group by job_id;
-- 8. Write a query to get the difference between the highest and lowest salaries.
select max(SALARY) - min(SALARY)
from employees;
-- 9. Write a query to find the manager ID and the salary of the lowest-paid employee for that manager.
select MANAGER_ID, min(SALARY)
from employees
group by MANAGER_ID;
-- 10. Write a query to get the department ID and the total salary payable in each department.
select DEPARTMENT_ID, sum(SALARY)
from employees
group by DEPARTMENT_ID;
-- 11. Write a query to get the average salary for each job ID excluding programmer.
select JOB_ID, avg(SALARY)
from employees
where JOB_ID != 'IT_PROG'
group by JOB_ID;
-- 12. Write a query to get the total salary, maximum, minimum, average salary of employees with the same job, for department ID 90 only.

-- 13. Write a query to get the job ID and maximum salary of the employees where maximum salary is greater than or equal to $4000.

-- 14. Write a query to get the average salary for all departments employing more than 10 employees.
