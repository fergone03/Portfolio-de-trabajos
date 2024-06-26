DROP SCHEMA IF EXISTS INSTITUTO;

CREATE SCHEMA INSTITUTO;

USE INSTITUTO;

CREATE TABLE PROFESOR (
	ID INT PRIMARY KEY AUTO_INCREMENT,
	DNI VARCHAR(9),
    NOMBRE VARCHAR(20),
    DIRECCIÓN VARCHAR(40),
    TELÉFONO FLOAT
);
CREATE TABLE ALUMNO (
	ID INT PRIMARY KEY AUTO_INCREMENT,
    NUMERO_EXPEDIENTE INT,
	DNI VARCHAR(9),
    NOMBRE VARCHAR(20),
    APELLIDOS VARCHAR(20),
    FECHA_NACIMIENTO DATE
);
CREATE TABLE ASIGNATURA (
    ID INT PRIMARY KEY AUTO_INCREMENT,
	CÓDIGO INT,
    NOMBRE VARCHAR(20),
    ID_PROFESOR INT,
    
    FOREIGN KEY (ID_PROFESOR) REFERENCES PROFESOR(ID),
);

CREATE TABLE GRUPO (
	ID INT,
	CURSO INT,
	LETRA CHAR,
	ID_DELEGADO INT,
	ID_TUTOR INT,
    
	FOREIGN KEY (ID_DELEGADO) REFERENCES ALUMNO(ID),
    FOREIGN KEY (ID_TUTOR) REFERENCES PROFESOR(ID)
);

CREATE TABLE ALUMNO_MATRICULA_ASIGNATURA (
	ID_ALUMNO INT,
	ID_ASIGNATURA INT,
	
    PRIMARY KEY (ID_ALUMNO, ID_ASIGNATURA),
	FOREIGN KEY (ID_ALUMNO) REFERENCES ALUMNO(ID),
	FOREIGN KEY (ID_GRUPO) REFERENCES ASIGNATURA(ID)
);

CREATE TABLE ALUMNO_PERTENECE_GRUPO (
	ID_ALUMNO INT,
	ID_GRUPO INT,
    
	PRIMARY KEY (ID_ALUMNO, ID_GRUPO),
	FOREIGN KEY (ID_ALUMNO) REFERENCES ALUMNO(ID),
	FOREIGN KEY (ID_GRUPO) REFERENCES GRUPO(ID)
);