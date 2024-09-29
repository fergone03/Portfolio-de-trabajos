document.getElementById("botonEnviar").addEventListener("click", function () {
  var numeroTarjetaValor = document.getElementById("numeroTarjeta").value;
  var nombreValor = document.getElementById("nombre").value;
  var cvvValor = document.getElementById("cvv").value;
  var fechaCaducidadValor = document.getElementById("fechaCaducidad").value;

  if (
      numeroTarjetaValor.trim() === "" ||
      nombreValor.trim() === "" ||
      cvvValor.trim() === "" ||
      fechaCaducidadValor.trim() === ""
  ) {
      alert("Rellena todos los campos o Luffy pal lobby");
  } else {
      document.getElementById("miFormulario").style.display = "none";
      document.getElementById("botonEnviar").style.display = "none";
      document.getElementById("miImagen").style.display = "block";
      document.getElementById("mensajeAyuda").innerHTML =
          "¡Luffy se ha salvado gracias a tí!";
  }
});
