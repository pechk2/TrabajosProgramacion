use hr;

-- 1. Write a SQL statement to insert a record with your own value into the table countries against each columns.
insert into countries values ('ES', 'Spain', 1);
-- 2. Write a SQL statement to insert one row into the table countries against the column country_id and country_name.
insert into countries values('NI', 'Nigeria', null);
insert into countries (COUNTRY_ID, COUNTRY_NAME)
values ('NI', 'Nigeria');
-- 3. Write a SQL statement to create duplicate of countries table named country_new with all structure and data.
create table country_new like countries;
insert into country_new select * from countries;
-- 4. Write a SQL statement to insert NULL values against region_id column for a row of countries table. 
update countries
set REGION_ID = null
where COUNTRY_ID = 'ES';
-- 5. Write a SQL statement to insert 3 rows by a single insert statement. 
insert into countries values('NO', 'Nogeria', null), 
							('SI', 'Sigeria', null),
	                        ('LI', 'Ligeria', null);
-- 6. Write a SQL statement to insert rows from country_new table to countries table(only rows inserted in previous exercise).
insert into country_new
select * from countries
where COUNTRY_ID in ('AL', 'PO', 'SP');
-- 7. Write a SQL statement to change the email column of employees table with 'not available' for all employees. 
select EMAIL, concat('not available', EMPLOYEE_ID) from employees;

update employees
set EMAIL = concat('not available', EMPLOYEE_ID);
-- 8. Write a SQL statement to change the email and commission_pct column of employees table with 'not available' and 0.10 for all employees.
update employees
set EMAIL = concat('unknown', EMPLOYEE_ID),
	COMMISSION_PCT = 0.1;

-- 9. Write a SQL statement to change the email and commission_pct column of employees table with 'not available' and 0.10 for those employees whose department_id is 110. 
update employees
set EMAIL = concat('unknown', EMPLOYEE_ID),
	COMMISSION_PCT = 0.1
where DEPARTMENT_ID = 110;
-- 10. Write a SQL statement to change the email column of employees table with 'not available' for those employees whose department_id is 80 and gets a commission is less than .20% 
update employees
set EMAIL = concat('unknown', EMPLOYEE_ID)
where DEPARTMENT_ID = 80
and COMMISSION_PCT < 0.2;
-- 11. Write a SQL statement to change salary of employee to 8000 whose ID is 105, if the existing salary is less than 5000.
update employees
set SALARY = 8000
where EMPLOYEE_ID = 105
and SALARY < 5000;
-- 12. Write a SQL statement to change job ID of employee which ID is 118, to SH_CLERK if the employee belongs to department, which ID is 30 and the existing job ID does not start with SH.
update employees
set JOB_ID = 'SH_CLERK'
where EMPLOYEE_ID = 118
and DEPARTMENT_ID = 30
and JOB_ID not like 'SH%';