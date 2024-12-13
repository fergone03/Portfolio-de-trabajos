const mover = document.getElementById("movimiento");
const x = document.getElementById("x");
const y = document.getElementById("y");
const clickBoton = document.getElementById("clickBoton");
const divClick = document.getElementById("elclick");
const teclaPulsada = document.getElementById("teclaPulsada");
const mondongo = document.getElementById("mondongo");
const containerMondongo = document.getElementById("containerMondongo");

function calcularPosicion(event) {
  x.innerText = event.x;
  y.innerText = event.y;
}

mover.addEventListener("mousemove", calcularPosicion);


mover.addEventListener("contextmenu", (event) => {
  event.preventDefault(); // Pa que no se abra el menu con click derecho
});
mover.addEventListener("mouseup", (event) => {
  switch (event.button) {
    case 0:
      divClick.style.display = "block";
      clickBoton.innerText = "botón izquierdo";
      setTimeout(() => {
        divClick.style.display = "none";
      }, "500");
      break;
    case 1:
      divClick.style.display = "block";
      clickBoton.innerText = "botón medio";
      setTimeout(() => {
        divClick.style.display = "none";
      }, "500");
      break;
    case 2:
      divClick.style.display = "block";
      clickBoton.innerText = "botón derecho";
      setTimeout(() => {
        divClick.style.display = "none";
      }, "500");
      break;
  }
});

function tecla(event) {
  containerMondongo.style.display = "block";
  document.innerText = "Pulsada la tecla " + event.key;
  mondongo.innerText = event.key;
  setTimeout(() => {
    containerMondongo.style.display = "none";
  }, "1000");
}
document.addEventListener("keydown", tecla);
//EJERCICIOS EXPRESIONES REGULARES
/*1.-¿Qué validan las siguientes expresiones regulares?
a)ho*a 
habilitan strings que tengan una “h” con de 0 a n “o” y seguido de una “a”
b) ([B-D]|[F-H]|[J-N]|[P-T]|[V-Z])
Validan todas las Letras mayúsculas que no sean vocales
c)^[0-9]{5}$
Valida cadenas de 5 números del 0 al nueve
d)[0-4][0-9][0-2][0-9]{3}
Valida el primer número del 0 al 4 el segundo numero del 0 al 9 el tercero del 0 al 2 y 3 numeros del 0 al 9
e)([0-4][0-9]|5[0-2])[0-9]{3}
Cadena de 5 digitos en el que los primeros dos números son del 00 al 49 o 50 al 52 y tres números del 0 al nueve
f)(^.+[a-z])(.*[A-Z])(.*\d)[a-zA-Z]{8,12}$
Cadena de 8 a 12 caracteres los cuales tienen que tener al menos una mayúscula una minúscula y un dígito.


2.- ¿Qué validan las siguientes expresiones regulares?
a)\d{6}$
Cadena de seis dígitos del 0 al 9 
b)^[a-z0-9-]+$
Cadena que solo puede tener letras minúsculas de la a a la z, números del 0 al nueve y guiones
c)^95[0-9]\s*(\d{6}$)
Cadena que empieza con el 95, numero del 0 al nueve, un espacio en blanco opcional y seis dígitos
d)(\d{2}\s){2}
cadenas con dos pares de dígitos seguidos de espacios
e)(\d{2}\s){2}\d{2}$ 
cadenas con dos pares de dígitos seguidos de espacios terminando con dos dígitos
f)^95[0-9]\s*(\d{2}\s){2}\d{2}$
Cadena que inicia en 95 mas un dígito del 0 al 9, con espacio opcional y tienen dos pares de dígitos seguidos de espacios terminando con dos dígitos.
g)(\d{3}\s){2}
Dos cadenas de tres dígitos con espacio entre ellas
h)^95[0-9]\s*(\d{3}\s){2}
Cadena que inicia con el 95, un digito del 0 al 9, espacio opcional y dos cadenas tres dígitos con un espacio final
i)95[0-9]\s* ((\d{6}$)|((\d{2}\s){2}\d{2}$)) 
Cadena que inicia con el 95 y sigue un digito del 0 al 9 después del 95, un espacio opcional seguido, y , o una cadena de 6 dígitos que acabe la cadena o 2 cadenas de 2 dígitos más espacio y dos dígitos que terminan la cadena.
j)95[0-9]\s* ((\d{6}$)|((\d{2}\s){2}\d{2}$)|((\d{3}\s){2}))

*/