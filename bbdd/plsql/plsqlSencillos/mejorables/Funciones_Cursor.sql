/*Funcion que diga si un animal es perro o gato
Un cursor que diga el nº de perro o gato*/
DROP FUNCTION N_ANIMAL;
DROP PROCEDURE CANTIDAD_ANIMAL;

DELIMITER //

CREATE FUNCTION queEs (
	letra VARCHAR(1)
)

RETURNS VARCHAR(5)
DETERMINISTIC
BEGIN

	DECLARE resultado VARCHAR(5) DEFAULT '';

	IF letra = 'G' THEN
		SET resultado = "Gato";
	ELSEIF letra = 'P' THEN
		SET resultado = "Perro";
	END IF;

	RETURN resultado;

END //

DELIMITER ;

DELIMITER //

CREATE PROCEDURE numAnimales(
	IN tipo VARCHAR(1),
	OUT total INT
)

BEGIN
	
	DECLARE finished INT DEFAULT 0;
	DECLARE especietemp VARCHAR(1) DEFAULT '';


	

	DECLARE puntero
		CURSOR FOR
			SELECT ESPECIE FROM mascotas WHERE ESPECIE=tipo;

	DECLARE CONTINUE HANDLER
		FOR NOT FOUND SET finished = 1;

	OPEN puntero;
	SET total = 0;
	bucle: LOOP
		FETCH puntero INTO especietemp;
		IF finished = 1 THEN 
			LEAVE bucle;
		END IF;
		SET total = total + 1;


	END LOOP bucle;
	CLOSE puntero;

	SELECT TOTAL;

END //


DELIMITER ;


SET @total=0;
CALL numAnimales('G', @total);
SELECT @total;

SET @total=0;
CALL numAnimales('P', @total);
SELECT @total;

/*Crear un Trigger.*/

CREATE TRIGGER nuevoAnimal AFTER INSERT ON mascotas
	FOR EACH ROW CALL numAnimales(NEW.ESPECIE, @total);

/*Para comprobar un Trigger internamente.*/
INSERT INTO mascotas VALUES 
(null, 'juan','P', 'M','e022', 'A'),
(null,'pepa', 'P', 'H', 'e234', 'A');

SELECT @total;