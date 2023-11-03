@echo off 
cls
echo Este es mi primer ejemplo
Rem me gusta la barbacoa
Set mivar=Luis
Set /p mivar1=Dime tu apellido 
pause > null
dir
echo Hola > archivo.txt
echo Adios >> archivo.txt
dir >>archivo.txt
echo tu nombre es %mivar% %mivar1% > prueba.txt
set /a miresultado = %mivar% + %mivar1%
 esto no serviria para hacer calculos solo para almacenar datos

 para poder hacer un calculo deberias de hacer "Set mivar= 1	Set mivar1= 2" y poner "Set /amiresultado=%mivar%+%mivar1%"(los"" solo los pongo para distinguir lo que es el codigo del comentario)

 para poder llamar una variable que pones al poner en el cmd "ejemplo.cmd" + "5"(por ejemplo) pones "%1" y si por ejemplo quieres tener en cuenta el segundo numero como por ejemplo "ejemplo.cmd 5 7" tendrias que poner "%2"  

Goto fin->etiqueta
:fin -> definición etiqueta

if condición (
				goto fin
				)else (
						goto inicio
Color 09
eqv => =
neq => /=
lss => <
leq => <=
gtr => >
geq => >=


				