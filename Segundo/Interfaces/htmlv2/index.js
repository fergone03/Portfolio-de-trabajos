document.getElementById("botonEnviar").addEventListener("click", function () {
  var valorNumeroTarjeta = document.getElementById("numeroTarjeta").value;
  var valorNombre = document.getElementById("nombre").value;
  var valorCVV = document.getElementById("cvv").value;
  var valorFechaCaducidad = document.getElementById("fechaCaducidad").value;

  if (
    valorNumeroTarjeta.trim() === "" ||
    valorNombre.trim() === "" ||
    valorCVV.trim() === "" ||
    valorFechaCaducidad.trim() === ""
  ) {
    alert("Rellena todos los campos o Luffy pal lobby");
  } else {
    document.getElementById("formulario").style.display = "none";
    document.getElementById("botonEnviar").style.display = "none";
    document.getElementById("imagenMugiwara").style.display = "block";
    document.getElementById("mensajeAyuda").innerHTML =
      "¡Luffy se ha salvado gracias a ti!";
  }
});
document.getElementById("botonNakama").addEventListener("click", function () {
  var valorNumeroTarjeta = document.getElementById("numeroTarjeta").value;
  var valorNombre = document.getElementById("nombre").value;
  var valorCVV = document.getElementById("cvv").value;
  var valorFechaCaducidad = document.getElementById("fechaCaducidad").value;

  if (
    valorNumeroTarjeta.trim() === "" ||
    valorNombre.trim() === "" ||
    valorCVV.trim() === "" ||
    valorFechaCaducidad.trim() === ""
  ) {
    alert("Rellena todos los campos o Luffy pal lobby");
  } else {
    document.getElementById("formulario").style.display = "none";
    document.getElementById("botonEnviar").style.display = "none";
    document.getElementById("imagenMugiwara").style.display = "block";
    document.getElementById("mensajeAyuda").innerHTML =
      "¡Luffy se ha salvado gracias a ti!";
  }
});
document.getElementById("botonTesoro").addEventListener("click", function () {
  var valorNumeroTarjeta = document.getElementById("numeroTarjeta").value;
  var valorNombre = document.getElementById("nombre").value;
  var valorCVV = document.getElementById("cvv").value;
  var valorFechaCaducidad = document.getElementById("fechaCaducidad").value;

  if (
    valorNumeroTarjeta.trim() === "" ||
    valorNombre.trim() === "" ||
    valorCVV.trim() === "" ||
    valorFechaCaducidad.trim() === ""
  ) {
    alert("Rellena todos los campos o Luffy pal lobby");
  } else {
    document.getElementById("formulario").style.display = "none";
    document.getElementById("botonEnviar").style.display = "none";
    document.getElementById("imagenMugiwara").style.display = "block";
    document.getElementById("mensajeAyuda").innerHTML =
      "¡Luffy se ha salvado gracias a ti!";
  }
});
document.getElementById("botonMapa").addEventListener("click", function () {
  var valorNumeroTarjeta = document.getElementById("numeroTarjeta").value;
  var valorNombre = document.getElementById("nombre").value;
  var valorCVV = document.getElementById("cvv").value;
  var valorFechaCaducidad = document.getElementById("fechaCaducidad").value;

  if (
    valorNumeroTarjeta.trim() === "" ||
    valorNombre.trim() === "" ||
    valorCVV.trim() === "" ||
    valorFechaCaducidad.trim() === ""
  ) {
    alert("Rellena todos los campos o Luffy pal lobby");
  } else {
    document.getElementById("formulario").style.display = "none";
    document.getElementById("botonEnviar").style.display = "none";
    document.getElementById("imagenMugiwara").style.display = "block";
    document.getElementById("mensajeAyuda").innerHTML =
      "¡Luffy se ha salvado gracias a ti!";
  }
});
