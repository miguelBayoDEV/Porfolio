DROP DATABASE relacion2; /*Borrado de Base de datos.*/

CREATE DATABASE relacion2; /*Crear BD.*/

/*Creaer tablas.*/

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
name VARCHAR(20),
manager_id INT,
location_id INT
);

CREATE TABLE Jobs (
job_id INT PRIMARY KEY AUTO_INCREMENT,
title VARCHAR(20),
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
('',"Europa"),
('',"Asia"),
('',"América"),
('',"África"),
('',"Oceania");

INSERT INTO countries VALUES
('',"España",'1'),
('',"Portugal",'1'),
('',"Japón",'2'),
('',"China",'2'),
('',"Washigton",'3'),
('',"Texas",'3'),
('',"Sudáfrica",'4'),
('',"Marruecos",'4'),
('',"Filipinas",'5'),
('',"Australia",'5');

INSERT INTO locations VALUES
('',"Arial",'18455',"Granada","Andalucía",'1'),
('',"Benfi",'29574',"Lisboa","Lisboa",'2'),
('',"Tokio_Street",'77777',"Tokio","Tokio",'3'),
('',"China_Street",'33332',"China","China",'4'),
('',"Washigton_Street",'45768',"Washigton","Washigton",'5'),
('',"Texas_Street",'58763',"Texas","Texas",'6'),
('',"Sudáfrica_Street",'12457',"Sudáfrica","Sudáfrica",'7'),
('',"Marruecos",'47984',"Marruecos","Marruecos",'8'),
('',"Filipinas",'57896',"Filipinas","Filipinas",'9'),
('',"Australia",'55779',"Australia","Australia",'10');

INSERT INTO departments VALUES
('',"Desarrollo",NULL,'1'),
('',"Contabilidad",NULL,'2'),
('',"Suministro",NULL,'3'),
('',"Reparto",NULL,'4'),
('',"Marketing",NULL,'5'),
('',"Atención al cliente",NULL,'6'),
('',"Pruebas",NULL,'7'),
('',"Diseño",NULL,'8'),
('',"Producción",NULL,'9'),
('',"Calidad",NULL,'10');

INSERT INTO jobs VALUES
('',"Juego1",'2000','7000'),
('',"Juego2",'1000','3000'),
('',"Juego3",'2000','4000'),
('',"Juego4",'2000','9000'),
('',"Juego5",'3000','6000'),
('',"Juego6",'4000','6000'),
('',"Juego7",'1000','7000');

INSERT INTO employees VALUES
('',"Niel","Apunto","a@gmail.com",'445345334','1','1','1500','0.25','1','1'),
('',"Marco","Antonso","an@gmail.com",'456347834','2','2','1200','0.45','2','2'),
('',"Nicolas","Dontto","d@gmail.com",'098765334','3','3','1000','0.15','3','3'),
('',"Marlo","Murillo","m@gmail.com",'775345355','4','4','1100','0.35','4','4'),
('',"Samu","Mingo","mi@gmail.com",'444687934','5','5','1300','0.45','5','5'),
('',"Nico","Nimmm","n@gmail.com",'987545334','6','6','1800','0.85','6','6'),
('',"Fury","Nuunto","f@gmail.com",'445878334','7','7','2000','0.77','7','7'),
('',"Felix","Junco","fj@gmail.com",'455345884','8','7','1100','0.28','8','8'),
('',"Dani","Mejin","dm@gmail.com",'449995337','9','7','1600','0.55','9','9'),
('',"Jesus","Antin","ja@gmail.com",'666786677','10','7','1000','0.65','10','10');

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
SET manager_id='4' WHERE name="Desarrollo";

UPDATE departments
SET manager_id='8' WHERE name="Contabilidad";

UPDATE departments
SET manager_id='1' WHERE name="Suministro";

UPDATE departments
SET manager_id='9' WHERE name="Reparto";

UPDATE departments
SET manager_id='6' WHERE name="Marketing";

UPDATE departments
SET manager_id='5' WHERE name="Atención al cliente";

UPDATE departments
SET manager_id='3' WHERE name="Pruebas";

UPDATE departments
SET manager_id='2' WHERE name="Diseño";

UPDATE departments
SET manager_id='10' WHERE name="Producción";

UPDATE departments
SET manager_id='7' WHERE name="Calidad";