var promptNombre = prompt("¿Cuál es tu nombre?");
if (promptNombre === null || promptNombre === "") {
  alert("¡Escribe tu nombre!");
} else {
  console.log("Bienvenid@ a mi página " + promptNombre);
}
