//Ejercicio 2: Crea una función llamada countBy la cual recibirá dos números enteros positivos: X e Y.
//Esta función debe devolver lo siguiente:
//•	Si alguno de los números es negativo devolverá un array vacío.
//•	Sino, devolverá con array con los Y primeros múltiplos de X empezando por el 1 (incluido)

//Numeros enteros positivos ✔

arrayMultis = [];
//Funcion que si alguno de los dos numeros es negativo envia un array vacio y si están bien devuelve tantos multiplos de "X" como numero
//sea "Y" "
function countBy(arrayMultis) {
  X = parseInt(prompt("Elija el numero para X por favor"));
  Y = parseInt(prompt("Elija el numero para Y por favor"));

  if (X < 0 || Y < 0 || X == null || Y == null) {
    alert("No hay nada, mira... " + arrayMultis);
  } else {
    for (let i = 0; i < Y; i++) {
      arrayMultis.push(X * (i + 1));
    }
    alert(
      "El array de los multiplos de " + X + " por " + Y + " es " + arrayMultis
    );
  }
}
