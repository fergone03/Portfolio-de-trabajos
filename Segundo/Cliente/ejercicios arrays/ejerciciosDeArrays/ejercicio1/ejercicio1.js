//Ejercicio 1: Crea una función que reciba un array de valores enteros 
//(positivos y negativos),  y devuelva otro array con la suma parcial de cada elemento 
//del array que se pasa como parámetro.
//Nota: La suma parcial de un elemento del array será la suma de ese elemento y 
//todos los anteriores a él.
//Ej: Para el array [1,2,3,4,5,6], el array resultante será [1,3,6,10,15,21]

//array con numeros
var nums = [1,2,3,4,5,6];
let sum = 0;
var arraySumado = [];

function suma(nums){
    alert("el array es: "+ nums );   
    for(let i=0 ; i < nums.length; i++){
        
        sum += nums[i];
        arraySumado.push(sum);
    }
    alert("el array con la suma de los anteriores es: " + arraySumado)
    return arraySumado;
}

