@echo off

cls
Rem esto sirve para limpiar el cmd

echo este es mi primer ejemplo
Rem esto sirve para poder mostrar en pantalla

pause > null
Rem esto hace que haya una pausa en el codigo (ha añadido >null para que mande lo que salga a null habria que poner un echo de pulse en pantalla para que se pudiese ver algo)

Rem esto sirve para poner comentarios en el codigo

%cd%
Rem Se ponen los % delante y detras de lo que pongas para hacer que sea una variable

dir
Rem esto sirve para que cuando se ejecute haga un dir(que sirve para poderver que documentos hay en un directorio)

Set mivar= 5
Rem esto puede servir por ejemplo para poder poner una conversion de una moneda a otra (ej.dolares a euros poner lo que valen los dolares) 

Set /p mivar=Dime tu nombre 
Rem esto se hace para que el valor sea lo que escribes cuando te lo pregunte // edit para que pueda guardarse en un txt

echo hola >archivo.txt
Rem esto es para crear un archivo y poner lo que pongas en el echo

echo adios>>archivo.txt
Rem Pones dos > para poder añadir algo al documento que ya has creado

dir>>archivo.txt
Rem esto hace que mande lo que salga en el dir al txt que crea

echo tu nombre es %mivar% %mivar1%>>archivo.txt
Rem esto no serviria para hacer calculos solo para almacenar datos

Rem para poder hacer un calculo deberias de hacer "Set mivar= 1	Set mivar1= 2" y poner "Set /amiresultado=%mivar%+%mivar1%"(los"" solo los pongo para distinguir lo que es el codigo del comentario)

Rem para poder llamar una variable que pones al poner en el cmd "ejemplo.cmd" + "5"(por ejemplo) pones "%1" y si por ejemplo quieres tener en cuenta el segundo numero como por ejemplo "ejemplo.cmd 5 7" tendrias que poner "%2"  

Go to fin
Rem Esto va a buscar :fin (el fin es la etiqueta, lo que hace es llevarte a la parte del codigo que tiene esa etiqueta y le pones el :fin a la variable para que vaya eso sirve para hacer bucles o que se ejecute una parte del codigo cuando tu quiera )

Rem if condition goto fin else goto inicio
Rem :inicio 							(Los rem los pongo para ponerlo como comentario)
Rem if a==b goto echo a=b es igual a b 
Rem else echo a no es igual a b

Rem para ponerlo bonito se pondria:
Rem if conficion (
Rem         goto fin
Rem        )else (
Rem               goto inicio
Rem        )

Rem Color 
Rem sirve para cambiar el color de la letra y del fondo 
Rem Un ejemplo es 09 el 0 es el color del fondo y el nueve la letra
Rem con color/? te sale todos los colores que hay para cambiar

Rem para las comparaciones se pone:
Rem eqv => es el equivalente =
Rem nvq => es el equivalente a /=
Rem Lss => es el equivalente a <
Rem leq => es el equivalente a <=
Rem gtr => es el equivalente a >
Rem geq => es el equivalente a >=

Rem si quieres parar a la mitad de estar ejecutandolo haz CNTRL + C