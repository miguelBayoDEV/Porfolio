DROP DATABASE biblioteca;
CREATE DATABASE biblioteca;

CREATE TABLE usuarios(
	id INT PRIMARY KEY AUTO_INCREMENT,
	nombre VARCHAR(30)
)

CREATE TABLE autor(
	id INT PRIMARY KEY AUTO_INCREMENT,
	nombre VARCHAR(30),
	nlibros INT
)

CREATE TABLE libros(
	id INT PRIMARY KEY AUTO_INCREMENT,
	nombre VARCHAR(30),
	idAutor INT,
	veces_prestado INT
)

CREATE TABLE prestamos(
	idUser INT,
	idBook INT,
	PRIMARY KEY(idUser,idBook)
)

/*
ALTER TABLE libros
ADD CONSTRAINS FK_LIBROS FOREIGN KEY (idAutor) REFERENCES autor(id);
*/
ALTER TABLE libros
ADD FOREIGN KEY (idAutor) REFERENCES autor(id);

ALTER TABLE prestamos
ADD FOREIGN KEY (idUser) REFERENCES usuarios(id);

ALTER TABLE prestamos
ADD FOREIGN KEY (idBook) REFERENCES libros(id);

INSERT INTO usuarios VALUES
(NULL,'MIGUEL'),
(NULL,'BRYANT'),
(NULL,'DANI');

INSERT INTO autor VALUES
(NULL,'CERVANTES','3'),
(NULL,'VEGA','6'),
(NULL,'FAUSTINO','5');

INSERT INTO libros VALUES
(NULL,"DON QUIJOTE",'1','4'),
(NULL,"POESÍAS",'2','1'),
(NULL,'ZETA, SEÑOR DE LOS ZOMBIES','3','7');

INSERT INTO prestamos VALUES
('1','3'),
('2','1'),
('3','2');

/*1)LIBRO ESTÁ PRESTADO: FUNCIÓN-PROCEDIMIENTO*/
DELIMITER //

CREATE FUNCTION prestado (
	libro INT
)

RETURNS BOOLEAN
DETERMINISTIC
BEGIN

	DECLARE resultado BOOLEAN DEFAULT 0;
	DECLARE R INT DEFAULT NULL;

	SELECT idUser INTO R FROM prestamos WHERE idBook = libro;

	IF R != NULL THEN
		SET resultado = 1;
	ELSEIF R=NULL THEN
		SET resultado = 0;
	END IF;

	RETURN resultado;

END //

DELIMITER ;

DELIMITER //

CREATE PROCEDURE prestamo(
	IN nlibro INT,
	OUT prestado BOOLEAN
)

BEGIN
	
	DECLARE R INT DEFAULT NULL;
	DECLARE prestado BOOLEAN DEFAULT 0;

	SELECT idUser INTO R FROM prestamos WHERE idBook = nlibro;

	IF R != NULL THEN
		SET prestado = 1;
	ELSEIF R = NULL THEN
		SET prestado = 0;
	END IF;

END //


DELIMITER ;

SET @prestado=0;
CALL prestamo('1', @prestado);
SELECT @prestado;

/*2)Incrementar veces_prestado de un libro*/
CREATE TRIGGER sumarLibroPrestado AFTER INSERT ON prestamos
FOR EACH ROW 
	UPDATE libros SET veces_prestado = veces_prestado + 1
	WHERE idBook = NEW.idBook;

/*3)Nº veces que ha sacado un libro el usuario*/
DELIMITER //
CREATE FUNCTION vecesLibroPrestado(
	idLibro INT,
	idUsuario INT
)
RETURNS INT
BEGIN
	DECLARE total INT DEFAULT '0';
	SELECT COUNT(idBook) INTO total FROM libros
	WHERE idBook = idLibro AND idUser = idUsuario;
RETURN total;
END //
DELIMITER ;

SELECT vecesPrestado(1,3);

/*4)Recibe el orden de los libros*/
DELIMITER //
CREATE PROCEDURE ordenLibros(
	IN campoOrden VARCHAR(20),
	OUT salida VARCHAR(30)
)
BEGIN	
	SELECT * INTO salida FROM libros ORDER BY campoOrden;
END //
DELIMITER ;

SET @salida='';
CALL prestamo('nombre', @salida);
SELECT @salida;

/*5)Devuelve nombre libros que ha cogido prestado un usuario*/
DELIMITER //
CREATE PROCEDURE getBooksOrderedByUser(
	IN idUSUARIO INT,
	IN idLibro INT,
	OUT salida VARCHAR(30)
)
BEGIN	
	SELECT nombre INTO salida FROM libros l,prestamos p
	WHERE l.idBook = idLibro AND p.idUser = idUsuario;
END //
DELIMITER ;

SET @salida='';
CALL prestamo('1', @salida);
SELECT @salida;

/*6)Insertar y aumento de nlibros de su autor*/
CREATE TRIGGER sumaLibroAutor AFTER INSERT ON libros 
FOR EACH ROW 
	UPDATE autor SET sumaLibro = sumaLibro + 1 WHERE idAuthor = NEW.idAut;

/*7)Antes de insertar libro asegurarse de que veces_prestado es 0*/
CREATE TRIGGER asegurarse BEFORE INSERT ON libros FOR EACH ROW
	SET NEW.veces_prestado = 0;