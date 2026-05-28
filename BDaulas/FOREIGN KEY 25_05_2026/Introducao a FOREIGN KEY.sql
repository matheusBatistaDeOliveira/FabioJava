CREATE DATABASE FOREIGNKEY;
USE FOREIGNKEY;

CREATE TABLE usuarios(
usuarioID INT PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(100)
);

CREATE TABLE entregas(
sendlyID INT PRIMARY KEY AUTO_INCREMENT,
sendly VARCHAR(50),
usuarioID INT NOT NULL,

FOREIGN KEY (usuarioID) 
REFERENCES usuarios(usuarioID)
);

INSERT INTO usuarios(nome) VALUES('Jamanta'),('Jessica'),('Gabriela');

INSERT INTO entregas(usuarioID, sendly) VALUES(1, 'computador'),(1, 'mouse');




SELECT * FROM usuarios a, entregas b WHERE a.usuarioID = b.usuarioid;
SELECT * FROM entregas;


ALTER TABLE entregas MODIFY usuarioID INT NOT NULL;

DROP TABLE usuarios;
DROP TABLE entregas;
DROP DATABASE FOREIGNKEY;
