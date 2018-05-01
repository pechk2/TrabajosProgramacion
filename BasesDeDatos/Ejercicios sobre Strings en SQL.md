# Ejercicios sobre Strings en SQL

### Funciones sobre strings para recordar en SQL:

- char_length()
- concat()
- substring()
- upper()
- lower()



### -- --------------------- MySQL string exercises -------------------------------------------

-- 1. Write a query to get the job_id and related employee's id.


-- 2. Write a query to get the id employeed and the phone number. Add a column with a new phone number where the substring '124' of the number is replaced by '999'. 

-- 3. Write a query to get the details of the employees where the length of the first name is greater than or equal to 8.

select * from employees
where char_length(FIRST_NAME) >=8;

-- 4. Write a query to display leading zeros before maximum and minimum salary.

select JOB_ID, JOB_TITLE,

	   MIN_SALARY, lpad(MIN_SALARY, 6, '0') as 'New min sal',
	   MAX_SALARY, lpad(MIN_SALARY, 6, '0') as  'New max sal'
from jobs;


-- 5. Write a query to get the id employee, email and a new column appending '@example.com' to email field.
select EMPLOYEE_ID, EMAIL,
		concat(EMAIL, '@example.com')
from employees;

-- 6. Write a query to get the employee id, first name and hire month.
select EMPLOYEE_ID, FIRST_NAME, HIRE_DATE,
	substring(HIRE_DATE,6,2) as 'month'
from employees;

-- 7. Write a query to get the employee id, email id (discard the last three characters).
select EMPLOYEE_ID, EMAIL,
	left(EMAIL,char_length(EMAIL) - 3)
from employees;


-- 8. Write a query to find all employees where first names are in upper case.
select FIRST_NAME, upper(FIRST_NAME)
from employees;

select FIRST_NAME, upper(FIRST_NAME)
from employees
where FIRST_NAME = binary upper(FIRST_NAME);

-- 9. Write a query to extract the last 4 character of phone numbers.
select PHONE_NUMBER, substring(PHONE_NUMBER, char_length(PHONE_NUMBER) - 3, 4) as 'new',
right(PHONE_NUMBER,4)
from employees;

-- 10. Write a query to get the last word of the street address.
select STREET_ADDRESS,
	substring(STREET_ADDRESS,char_length(STREET_ADDRESS - locate(' ',reverse(STREET_ADDRESS))) + 2)
from locations;

-- 11. Write a query to get the locations that have minimum street length.
select LOCATION_ID, STREET_ADDRESS, char_length(STREET_ADDRESS)
from locations
order by 3
limit 5;

-- 12. Write a query to display the first word from those job titles which contains more than one words.
select JOB_TITLE, locate(' ', JOB_TITLE),
substring(JOB_TITLE, 1,locate(' ', JOB_TITLE) - 1)
from jobs
where JOB_TITLE like '% %';

-- 13. Write a query to display the length of first name for employees where last name contain character 'c' after 2nd position.
select FIRST_NAME, char_length(FIRST_NAME), LAST_NAME
from employees
where LAST_NAME like '_%c%';

-- 14. Write a query that displays the first name and the length of the first name for all employees whose name starts with the letters 'A', 'J' or 'M'. Give each column an appropriate label. Sort the results by the employees' first names.


select FIRST_NAME, SALARY, lpad(SALARY,10,'$') as salary 
from employees;

-- 16. Write a query to display the first eight characters of the employees' first names and indicates the amounts of their salaries with '$' sign. Each '$' sign signifies a thousand dollars. Sort the data in descending order of salary.

select FIRST_NAME, substr(FIRST_NAME, 1, 8), SALARY,
 concat(salary div 1000, '$') as 'thousands of $',
 repeat('$', salary div 1000)'stranger things'
from employees;

-- 17. Write a query to display the employees with their code, first name, last name and hire date who hired either on seventh day of any month or seventh month in any year.
select EMPLOYEE_ID, FIRST_NAME, LAST_NAME, HIRE_DATE
from employees
where HIRE_DATE like '%';