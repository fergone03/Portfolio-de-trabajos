USE WORLD;                                      -- Selecciona la base de datos llamada "WORLD".

-- Selecciona todas las columnas de la tabla "CITY".
SELECT * FROM CITY;

-- Selecciona las columnas NAME y DISTRICT de la tabla "CITY".
SELECT NAME, DISTRICT FROM CITY;

-- Selecciona todas las columnas de la tabla "CITY" donde COUNTRYCODE es "ARG".
SELECT * FROM CITY WHERE COUNTRYCODE="ARG";

-- Selecciona el nombre de la ciudad "MOTRIL" de la tabla "CITY".
SELECT NAME FROM CITY WHERE NAME="MOTRIL";

-- Selecciona todas las columnas de la tabla "CITY" donde la población es mayor a 500,000.
SELECT * FROM CITY WHERE POPULATION>500000;

-- Selecciona el nombre de las ciudades en España (COUNTRYCODE="ESP").
SELECT NAME FROM CITY WHERE COUNTRYCODE="ESP";

-- Selecciona el nombre de las ciudades en España con una población mayor a 500,000.
SELECT NAME FROM CITY WHERE COUNTRYCODE="ESP" AND POPULATION>500000;

-- Selecciona todas las columnas de la tabla "CITY" donde el país es Alemania (DEU) o España (ESP) y la población está entre 100,000 y 500,000.
SELECT * FROM CITY WHERE COUNTRYCODE="DEU" OR COUNTRYCODE="ESP" AND POPULATION BETWEEN 100000 AND 500000;

-- Selecciona las primeras 10 filas de la tabla "CITY" donde el país es España (ESP).
SELECT * FROM CITY WHERE COUNTRYCODE="ESP" LIMIT 10;

-- Selecciona las primeras 10 filas de la tabla "CITY" donde el país es España, ordenadas por población de forma descendente.
SELECT * FROM CITY WHERE COUNTRYCODE="ESP" ORDER BY POPULATION DESC LIMIT 10;

-- Selecciona las primeras 5 ciudades de la tabla "CITY" cuyos nombres empiezan con "A", ordenadas por población de forma descendente.
SELECT * FROM CITY WHERE NAME LIKE "A%" ORDER BY POPULATION DESC LIMIT 5;

-- Selecciona las primeras 5 ciudades de la tabla "CITY" en España cuyos nombres empiezan con "A", ordenadas por población de forma ascendente.
SELECT * FROM CITY WHERE COUNTRYCODE="ESP" AND NAME LIKE "A%" ORDER BY POPULATION ASC LIMIT 5;

-- Selecciona todas las columnas de la tabla "CITY" donde el nombre tiene una letra "B" en la segunda posición y la población es un número par.
SELECT * FROM CITY WHERE NAME LIKE '_B_' AND POPULATION % 2 = 0;

-- Selecciona todas las columnas y la multiplicación de la población por el ID de la tabla "CITY" donde el país es Japón (JPN).
SELECT *, POPULATION * ID AS POPULATIONXID FROM CITY WHERE COUNTRYCODE = 'JPN';

-- Selecciona el nombre y el resto de la población dividido por 7 de las ciudades en Japón, ordenadas por el resto de forma descendente.
SELECT NAME, POPULATION % 7 AS RESTO FROM CITY WHERE COUNTRYCODE="JPN" ORDER BY RESTO DESC;

-- Calcula la suma de la población de todas las ciudades en la tabla "CITY".
SELECT SUM(POPULATION) FROM CITY;

-- Calcula el promedio de la población de las ciudades en España.
SELECT AVG(POPULATION) FROM CITY WHERE COUNTRYCODE="ESP";

-- Encuentra la población máxima de las ciudades en España.
SELECT MAX(POPULATION) FROM CITY WHERE COUNTRYCODE="ESP";

-- Encuentra la población mínima de todas las ciudades en la tabla "CITY".
SELECT MIN(POPULATION) FROM CITY;

-- Selecciona el nombre de la ciudad con la población más alta en la tabla "CITY".
SELECT NAME FROM CITY ORDER BY POPULATION DESC LIMIT 1;

-- Selecciona el nombre del país con el código "PCN" en la tabla "COUNTRY".
SELECT NAME FROM COUNTRY WHERE CODE="PCN";

-- Selecciona el nombre y la esperanza de vida de los países en Europa.
SELECT NAME, LifeExpectancy FROM COUNTRY WHERE CONTINENT="Europe";

-- Selecciona el nombre y la esperanza de vida de los países donde la esperanza de vida no es nula, ordenados por esperanza de vida de forma ascendente.
SELECT NAME, LifeExpectancy FROM COUNTRY WHERE LifeExpectancy IS NOT NULL ORDER BY LifeExpectancy ASC LIMIT 5;

-- Calcula el promedio de la esperanza de vida de los países en América del Sur.
SELECT AVG(LifeExpectancy) FROM COUNTRY WHERE CONTINENT="South America";

-- Selecciona los continentes únicos de la tabla "COUNTRY".
SELECT DISTINCT CONTINENT FROM COUNTRY;

-- Cuenta el número de países cuyo continente contiene la cadena "AMERICA".
SELECT COUNT(*) FROM COUNTRY WHERE continent LIKE '%AMERICA%';

-- Selecciona todos los campos de los países que tienen el sistema de gobierno "REPUBLIC".
SELECT * FROM COUNTRY WHERE GovernmentForm="REPUBLIC";

-- Calcula la suma de la población de todos los países en Europa.
SELECT SUM(POPULATION) AS SUMATOTAL FROM COUNTRY WHERE CONTINENT ="EUROPE";

-- Cuenta el número de regiones en los países de Asia.
SELECT COUNT(REGION) FROM COUNTRY WHERE CONTINENT="ASIA";

-- Selecciona los primeros 3 países ordenados por población de forma descendente.
SELECT * FROM COUNTRY ORDER BY POPULATION DESC LIMIT 3;

-- Calcula el porcentaje de la población de Andorra en el año 2000.
SELECT NAME, 2000 * 100 / POPULATION AS PORCENTAJEYT FROM COUNTRY WHERE NAME ="ANDORRA";

-- Calcula el promedio de la población de los países en África.
SELECT AVG(POPULATION) FROM COUNTRY WHERE CONTINENT="AFRICA";

-- Selecciona los países que se independizaron en el año 1945.
SELECT * FROM COUNTRY WHERE INDEPYEAR ="1945";

-- Selecciona los nombres de los primeros 5 países de Europa ordenados por población de forma ascendente.
SELECT NAME FROM COUNTRY WHERE CONTINENT="EUROPE" ORDER BY POPULATION ASC LIMIT 5;

-- Cuenta el número de países cuyo jefe de estado es "ELISABETH II".
SELECT COUNT(NAME) FROM COUNTRY WHERE HEADOFSTATE= "ELISABETH II";

-- Calcula el promedio de la esperanza de vida agrupado por continente.
SELECT AVG(LIFEEXPECTANCY) FROM COUNTRY GROUP BY CONTINENT;

-- Cuenta el número de países agrupado por continente.
SELECT COUNT(NAME) FROM COUNTRY GROUP BY CONTINENT;

-- Encuentra el distrito de las ciudades en España.
SELECT DISTRICT FROM CITY WHERE COUNTRYCODE="ESP";

-- Cuenta la cantidad de distritos distintos por país en la tabla "CITY".
SELECT COUNTRYCODE, COUNT(DISTINCT DISTRICT) AS DISTRICT_COUNT FROM CITY GROUP BY COUNTRYCODE;


SELECT COUNT(NAME) FROM COUNTRY GROUP BY CONTINENT;

SELECT REGION, SUM(SurfaceArea) FROM COUNTRY GROUP BY REGION ORDER BY REGION DESC;

SELECT COUNTRYCODE, COUNT(DISTRICT) FROM CITY GROUP BY COUNTRYCODE;

SELECT DISTRICT,SUMPERSONA  FROM CITY WHERE COUNTRYCODE="ESP";

SELECT CITY.NAME 
FROM CITY
JOIN COUNTRY ON CITY.COUNTRYCODE=COUNTRY.CODE WHERE CONTINENT="EUROPE";

SELECT CITY.NAME  
FROM CITY
JOIN COUNTRY ON CITY.COUNTRYCODE=COUNTRY.CODE WHERE CONTINENT LIKE '%America%' ORDER BY CITY.POPULATION DESC LIMIT 5;

SELECT 
DISTINCT COUNTRY.NAME  
FROM CITY
JOIN COUNTRY ON CITY.COUNTRYCODE=COUNTRY.CODE WHERE CITY.POPULATION >1000000;

SELECT DISTINCT COUNTRY.NAME,COUNT(DISTINCT CITY.NAME) as ciudades
FROM CITY
JOIN COUNTRY ON CITY.COUNTRYCODE=COUNTRY.CODE
GROUP BY COUNTRY.NAME;

SELECT 
DISTINCT COUNTRY.NAME,count(DISTINCT city.DISTRICT)   as distritos
FROM CITY
JOIN COUNTRY ON CITY.COUNTRYCODE=COUNTRY.CODE
GROUP BY COUNTRY.NAME;

SELECT  city.NAME,country.name   as capitales_de
FROM country
JOIN CITY ON CITY.id=COUNTRY.CAPITAL
where country.continent ="europe";	

Select 
country.name,
country.population,
city.name,
city.population/country.population*100 as habitantes_cap
from country 
JOIN CITY ON CITY.id=COUNTRY.CAPITAL
order by habitantes_cap desc;

#EJ64 MUESTRA LOS PAISES, SU POBLACION, LA POBLACION DE SU CAPITAL 
#Y EL PORCENTAJE DE CIUDADANOS QUE VIVEN EN LA CAPITAL (ORDENAR DE MAYOR A MENOR)

SELECT 
    COUNTRY.NAME,
    CITY.NAME,
    COUNTRY.POPULATION,
    CITY.POPULATION,
    CITY.POPULATION/COUNTRY.POPULATION100 AS HABITANTES_CAPITAL
    FROM COUNTRY
    JOIN CITY ON COUNTRY.CAPITAL=CITY.ID
    ORDER BY HABITANTES_CAPITAL DESC;

SELECT COUNTRY.NAME,COUNT(countrylanguage.Language) AS TOTAL_LENGUAS
FROM COUNTRY
JOIN COUNTRYLANGUAGE ON COUNTRY.CODE=COUNTRYLANGUAGE.COUNTRYCODE
GROUP BY CODE;


SELECT 
    COUNTRY.NAME, 
    COUNTRYLANGUAGE.LANGUAGE, 
    COUNTRYLANGUAGE.PERCENTAGECOUNTRY.POPULATION AS HABITANTES_PARLANTES
FROM COUNTRY
JOIN COUNTRYLANGUAGE ON COUNTRYLANGUAGE.COUNTRYCODE=COUNTRY.CODE;


SELECT
    COUNTRY.NAME, 
    COUNTRYLANGUAGE.LANGUAGE
FROM COUNTRY
JOIN COUNTRYLANGUAGE ON COUNTRYLANGUAGE.COUNTRYCODE=COUNTRY.CODE
WHERE COUNTRYLANGUAGE.LANGUAGE="SPANISH" AND ISOFFICIAL="T";


SELECT 
    COUNTRY.NAME,
    countrylanguage.LANGUAGE
FROM COUNTRY
JOIN COUNTRYLANGUAGE ON COUNTRYLANGUAGE.COUNTRYCODE=COUNTRY.CODE
WHERE COUNTRYLANGUAGE.ISOFFICIAL="T" AND CONTINENT="EUROPE";