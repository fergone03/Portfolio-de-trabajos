const mover = document.getElementById("movimiento");
const x = document.getElementById("x");
const y = document.getElementById("y");
var clickBoton = document.getElementById("clickBoton");
var divClick = document.getElementsByClassName("elclick");
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
      divClick[0].style.display = "block";
      clickBoton.innerText = "botón izquierdo";
      setTimeout(() => {
        divClick[0].style.display = "none";
      }, "500");
      break;
    case 1:
      divClick[0].style.display = "block";
      clickBoton.innerText = "botón medio";
      setTimeout(() => {
        divClick[0].style.display = "none";
      }, "500");
      break;
    case 2:
      divClick[0].style.display = "block";
      clickBoton.innerText = "botón derecho";
      setTimeout(() => {
        divClick[0].style.display = "none";
      }, "500");
      break;
  }
});
