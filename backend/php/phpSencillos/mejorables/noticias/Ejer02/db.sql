CREATE DATABASE valoracion;

CREATE TABLE usuarios (
	id INT PRIMARY KEY AUTO_INCREMENT,
	username VARCHAR(30) NOT NULL,
	password VARCHAR(30) NOT NULL,
	rol VARCHAR(10) NOT NULL,
	email VARCHAR(10) NOT NULL
);

CREATE TABLE noticias (
	id INT PRIMARY KEY AUTO_INCREMENT,
	titulo VARCHAR(100) NOT NULL,
	enlace VARCHAR(1000) NOT NULL,
	username_user VARCHAR(30) NOT NULL,
	visible Bool
);

CREATE TABLE valoracion (
	id_noticia INT,
	username_user VARCHAR(30) NOT NULL,
	valoracion INT,
	PRIMARY KEY(id_noticia, username_user)
);
