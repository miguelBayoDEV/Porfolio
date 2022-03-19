DROP DATABASE relacion8; /*Borrado de Base de datos.*/

CREATE DATABASE relacion8;
USE relacion8;
CREATE TABLE Employees (
employee_id INT PRIMARY KEY AUTO_INCREMENT,
first_name VARCHAR(20),
last_name VARCHAR(20),
email VARCHAR(30),
phone_number INT,
hire_date VARCHAR(20),
job_id INT,
salary INT,
commission_pct DOUBLE,
manager_id INT,
department_id INT
);

CREATE TABLE Departments (
department_id INT PRIMARY KEY AUTO_INCREMENT,
department_name VARCHAR(20),
manager_id INT,
location_id INT
);

CREATE TABLE Jobs (
job_id INT PRIMARY KEY AUTO_INCREMENT,
job_title VARCHAR(20),
min_salary INT,
max_salary INT
);

CREATE TABLE Job_History (
employee_id INT,
start_date date,
end_date date,
job_id INT,
department_id INT,
PRIMARY KEY (employee_id,start_date)
);

CREATE TABLE regions (
region_id INT PRIMARY KEY AUTO_INCREMENT,
region_name VARCHAR(20)
);

CREATE TABLE countries (
country_id INT PRIMARY KEY AUTO_INCREMENT,
country_name VARCHAR(20),
region_id INT
);

CREATE TABLE locations (
location_id INT PRIMARY KEY AUTO_INCREMENT,
street_address VARCHAR(20),
postal_code INT,
city VARCHAR(20),
state_province VARCHAR(20),
country_id INT
);

/*Modificación de clave foranea o externa.*/

ALTER TABLE countries
ADD CONSTRAINT FK_region_id FOREIGN KEY (region_id) REFERENCES regions(region_id);

ALTER TABLE locations
ADD CONSTRAINT FK_country_id FOREIGN KEY (country_id) REFERENCES countries(country_id);

ALTER TABLE departments
ADD CONSTRAINT FK_location_id FOREIGN KEY (location_id) REFERENCES locations(location_id);

ALTER TABLE departments
ADD CONSTRAINT FK_manager_id FOREIGN KEY (manager_id) REFERENCES employees(employee_id);

ALTER TABLE employees
ADD CONSTRAINT FKa_manager_id FOREIGN KEY (manager_id) REFERENCES employees(employee_id);

ALTER TABLE employees
ADD CONSTRAINT FK_job_id FOREIGN KEY (job_id) REFERENCES jobs(job_id);

ALTER TABLE employees
ADD CONSTRAINT FK_department_id FOREIGN KEY (department_id) REFERENCES departments(department_id);

ALTER TABLE job_history
ADD CONSTRAINT FK_employee_id FOREIGN KEY (employee_id) REFERENCES employees(employee_id);

ALTER TABLE job_history
ADD CONSTRAINT FKa_department_id FOREIGN KEY (department_id) REFERENCES departments(department_id);

ALTER TABLE job_history
ADD CONSTRAINT FKa_job_id FOREIGN KEY (job_id) REFERENCES jobs(job_id);

/*Inserción de datos en las tablas.*/

INSERT INTO regions VALUES
(NULL,"Europa"),
(NULL,"Asia"),
(NULL,"América"),
(NULL,"África"),
(NULL,"Oceania");

INSERT INTO countries VALUES
(NULL,"España",'1'),
(NULL,"Portugal",'1'),
(NULL,"Japón",'2'),
(NULL,"China",'2'),
(NULL,"Washigton",'3'),
(NULL,"Texas",'3'),
(NULL,"Sudáfrica",'4'),
(NULL,"Marruecos",'4'),
(NULL,"Filipinas",'5'),
(NULL,"Australia",'5');

INSERT INTO locations VALUES
(NULL,"Arial",'18455',"Granada","Andalucía",'1'),
(NULL,"Benfi",'29574',"Lisboa","Lisboa",'2'),
(NULL,"Tokio_Street",'77777',"Tokio","Tokio",'3'),
(NULL,"China_Street",'33332',"China","China",'4'),
(NULL,"Washigton_Street",'45768',"Toronto","Toronto",'5'),
(NULL,"Texas_Street",'58763',"Texas","Texas",'6'),
(NULL,"Sudáfrica_Street",'12457',"Sudáfrica","Sudáfrica",'7'),
(NULL,"Marruecos",'47984',"Marruecos","Marruecos",'8'),
(NULL,"Filipinas",'57896',"Filipinas","Filipinas",'9'),
(NULL,"Australia",'55779',"Australia","Australia",'10');

INSERT INTO departments VALUES
(NULL,"Desarrollo",NULL,'1'),
(NULL,"Contabilidad",NULL,'2'),
(NULL,"Suministro",NULL,'3'),
(NULL,"Reparto",NULL,'4'),
(NULL,"Marketing",NULL,'5'),
(NULL,"Atención al cliente",NULL,'6'),
(NULL,"Pruebas",NULL,'7'),
(NULL,"Diseño",NULL,'8'),
(NULL,"Producción",NULL,'9'),
(NULL,"Calidad",NULL,'10');

INSERT INTO jobs VALUES
(NULL,"Juego1",'2000','7000'),
(NULL,"Juego2",'1000','3000'),
(NULL,"Juego3",'2000','4000'),
(NULL,"Juego4",'2000','9000'),
(NULL,"Juego5",'3000','6000'),
(NULL,"Juego6",'4000','6000'),
(NULL,"Juego7",'1000','7000');

INSERT INTO employees VALUES
(NULL,"Niel","Apunto","a@gmail.com",'445345334','1','1','1500','0.25','1','1'),
(NULL,"Marco","Antonso","an@gmail.com",'456347834','2','2','1200','0.45','2','2'),
(NULL,"Nicolas","Dontto","d@gmail.com",'098765334','3','3','1000','0.15','3','3'),
(NULL,"Marlo","Marillo","m@gmail.com",'775345355','4','4','1100','0.35','4','4'),
(NULL,"Samu","Mingo","mi@gmail.com",'444687934','5','5','1300','0.45','5','5'),
(NULL,"Nico","Nimmm","n@gmail.com",'987545334','6','6','1800','0.85','6','6'),
(NULL,"Davies","Nunto","f@gmail.com",'445878334','7','7','2000','0.77','7','7'),
(NULL,"Felix","Jinco","fj@gmail.com",'455345884','8','7','1100','0.28','8','8'),
(NULL,"Dani","Mejin","dm@gmail.com",'449995337','9','7','1600','0.55','9','9'),
(NULL,"Jesus","Antin","ja@gmail.com",'666786677','10','7','1000','0.65','10','10');

INSERT INTO job_history VALUES
('1',"1994-03-27","1996-05-02",'1','1'),
('2',"2004-03-04","2006-07-07",'2','2'),
('3',"1995-04-14","1995-12-15",'3','3'),
('4',"1998-01-07","1998-11-22",'4','4'),
('5',"2007-07-07","2016-05-05",'5','5'),
('6',"2008-10-17","2010-05-20",'6','6'),
('7',"1991-07-21","2019-05-07",'7','7'),
('8',"1994-06-23","2015-09-29",'7','8'),
('9',"1995-03-25","2018-05-20",'7','9'),
('10',"2012-02-16","2012-08-03",'7','10');

/*Esto se debe realizar uno por uno.*/

UPDATE departments
SET manager_id='4' WHERE department_name="Desarrollo";

UPDATE departments
SET manager_id='8' WHERE department_name="Contabilidad";

UPDATE departments
SET manager_id='1' WHERE department_name="Suministro";

UPDATE departments
SET manager_id='9' WHERE department_name="Reparto";

UPDATE departments
SET manager_id='6' WHERE department_name="Marketing";

UPDATE departments
SET manager_id='5' WHERE department_name="Atención al cliente";

UPDATE departments
SET manager_id='3' WHERE department_name="Pruebas";

UPDATE departments
SET manager_id='2' WHERE department_name="Diseño";

UPDATE departments
SET manager_id='10' WHERE department_name="Producción";

UPDATE departments
SET manager_id='7' WHERE department_name="Calidad";

/*Consultas.*/

SELECT *
FROM departments;

SELECT employee_id, start_date, end_date
FROM job_history;

SELECT first_name AS Nombre, last_name AS Apellidos, phone_number AS 'Número de teléfono'
FROM employees;

SELECT *
FROM departments
WHERE department_id=70;

SELECT *
FROM departments
WHERE department_id=70 OR department_id=230;
SELECT *
FROM departments
WHERE department_id IN(70,230);

SELECT *
FROM regions;

SELECT employee_id, first_name, last_name
FROM employees
ORDER BY salary DESC;

SELECT department_id, last_name, salary
FROM employees
WHERE salary BETWEEN 2300 AND 4000;

SELECT employee_id, first_name, last_name, salary, salary + 700
FROM employees;

SELECT CONCAT(first_name,' ', last_name,' - ', salary) AS "Nombre, Apellidos y Salario del Empleado"
FROM employees;

SELECT *
FROM regions
WHERE region_name="Europa" OR region_name="Asia";
SELECT *
FROM regions
WHERE region_name IN('Europa','Asia');

SELECT street_address, city, state_province
FROM locations
WHERE city="Roma" OR city="Munich";
SELECT street_address, city, state_province
FROM locations
WHERE city IN("Roma","Munich");

SELECT *
FROM jobs
WHERE min_salary<2000 AND max_salary>8000;

SELECT max_salary, min_salary
FROM jobs
WHERE job_title="Programmer";

SELECT employee_id, last_name, job_id, hire_date AS STARTDATE
FROM employees;

SELECT DISTINCT job_id
FROM employees;
SELECT job_id
FROM employees
GROUP BY job_id
HAVING COUNT(job_id)=1;

SELECT CONCAT(last_name,", ", job_id) AS 'Employee and Title'
FROM employees;

SELECT last_name, salary
FROM employees
WHERE salary>12000;

SELECT last_name, department_id
FROM employees
WHERE employee_id=176;

SELECT last_name, salary
FROM employees
WHERE salary NOT BETWEEN 5000 AND 12000;
SELECT last_name AS Apellidos, salary
FROM employees
WHERE salary<5000 AND salary>12000;

SELECT last_name, job_id, hire_date
FROM employees
WHERE last_name IN("Matos", "Taylor")
ORDER BY hire_date ASC;

SELECT last_name, department_id
FROM employees
WHERE department_id=20 OR department_id=50
ORDER BY first_name ASC;
SELECT last_name, department_id
FROM employees
WHERE department_id IN(20,50)
ORDER BY first_name ASC;

SELECT AVG(salary) AS Salario_medio
FROM employees;

SELECT MAX(salary) AS Máximo
FROM employees;

SELECT MIN(salary) AS Mínimo
FROM employees;

SELECT AVG(salary) AS Salario_Medio, department_id
FROM employees
GROUP BY department_id;

SELECT MAX(salary) AS Salario_Máximo, department_id
FROM employees
GROUP BY department_id
HAVING Salario_Máximo>10000;

SELECT manager_id, MIN(salary) AS Salario_Mínimo
FROM employees
WHERE manager_id IS NOT NULL
GROUP BY manager_id
HAVING Salario_Mínimo>6000
ORDER BY salary DESC;

SELECT COUNT(first_name) AS TotalEMpleados, 
(SELECT COUNT(first_name) FROM employees WHERE YEAR(hire_date)=1995) AS '1995', 
(SELECT COUNT(first_name) FROM employees WHERE YEAR(hire_date)=1996) AS '1996', 
(SELECT COUNT(first_name) FROM employees WHERE YEAR(hire_date)=1997) AS '1997', 
(SELECT COUNT(first_name) FROM employees WHERE YEAR(hire_date)=1998) AS '1998' 
FROM employees;

SELECT CONCAT(last_name," gana", salary," mensual pero desea", salary*3) AS Informe
FROM employees;

SELECT last_name, hire_date, DAYNAME(hire_date) AS DíaSemana
FROM employees
ORDER BY DíaSemana ASC;

SELECT D.department_id AS "Department", L.location_id AS "Location", street_address, city, state_province, country_name AS "Country"
FROM departments D, locations L, countries C
WHERE L.country_id=C.country_id AND L.location_id=D.location_id;

SELECT last_name AS "Apellido", department_id AS "Número", department_name AS "Departamento"
FROM employees NATURAL JOIN departments;

SELECT CONCAT(Empleado.employee_id ,"-", Empleado.last_name) AS "Empleado", CONCAT(Jefe.manager_id, "-", Jefe.last_name) AS "Jefe"
FROM employees Empleado INNER JOIN employees Jefe
ON Empleado.manager_id=Jefe.employee_id;

SELECT E.last_name, J.job_title, D.department_id, D.department_name
FROM employees E, departments D, locations L, jobs J
WHERE E.department_id=D.department_id AND L.location_id=D.location_id AND J.job_id=E.job_id AND L.city="Toronto";

SELECT first_name, hire_date
FROM employees E
WHERE hire_date > (SELECT hire_date FROM employees E WHERE first_name="Davies");

SELECT E.first_name, E.hire_date, J.first_name, J.hire_date
FROM employees E, employees J
WHERE E.manager_id=J.employee_id AND E.hire_date < J.hire_date;

SELECT employee_id, last_name, salary
FROM employees
WHERE salary > (SELECT AVG(salary) FROM employees)
ORDER BY salary ASC;

SELECT employee_id, last_name
FROM employees
WHERE department_id = (SELECT department_id FROM employees WHERE last_name LIKE "%V%");

SELECT last_name, E.department_id, employee_id, job_id
FROM employees E, departments D
WHERE E.department_id=D.department_id AND D.location_id=1700;