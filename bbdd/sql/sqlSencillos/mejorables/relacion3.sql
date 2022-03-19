CREATE DATABASE relacion3;
/*DROP TABLE Libros;*/

/*Crear tabla*/
CREATE TABLE Libros (
titulo VARCHAR(40),
autor VARCHAR(40),
editorial VARCHAR(20),
precio DOUBLE,
cantidad INT,
PRIMARY KEY (titulo,autor,editorial)
);

/*Insertar registros*/
INSERT INTO libros VALUES 
("El aleph","Borges","Planeta",'35',NULL),
("Martín Fierro","José Hernández","Emece",'22.20','200'),
("Martín Fierro","José Hernández","Planeta",'40','200'),
("Antología poética","J.L.Borges","Planeta",NULL,'150'),
("Aprenda PHP","Mario Molina","Emece",'18',NULL),
("Manual de PHP","J.C.Paez","Siglo XXI",'56','120'),
("Cervantes y el Quijote","Bioy Casares-J.L.Borges","Paidos",NULL,'100'),
("Harry Potter y la piedra filosofal","J.K.Rowling","Default",'45.00','90'),
("Harry Potter y la cámara secreta","J.K.Rowling","Emece",NULL,'100'),
("Alicia en el país de las maravillas","Lewis Carroll","Paidos",'42','80'),
("PHP de la A a la Z",NULL,NULL,'110','0'),
("Uno","Richard Bach","Planeta",'25',NULL);

/*Consultas*/

SELECT SUM(cantidad) as cantidad,editorial
FROM Libros
GROUP BY editorial;
SELECT COUNT(titulo) as titulo, editorial
FROM Libros
GROUP BY editorial;

SELECT SUM(cantidad) as cantidad,editorial
FROM Libros
GROUP BY editorial
HAVING SUM(cantidad)>'2';

SELECT AVG(precio) as precio, editorial
FROM Libros
GROUP BY editorial
HAVING AVG(precio)>'25';

SELECT SUM(cantidad) as cantidad, editorial
FROM Libros
WHERE precio IS NOT NULL AND editorial!="Planeta"
GROUP BY editorial;

SELECT AVG(precio) as precio, editorial
FROM Libros
GROUP BY editorial
HAVING COUNT(titulo)>'2';

SELECT MAX(precio) as precio, editorial
FROM Libros
WHERE precio<'100' AND precio>'30'
GROUP BY editorial
ORDER BY editorial ASC;