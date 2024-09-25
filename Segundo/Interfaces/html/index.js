document.getElementById("submitBtn").addEventListener("click", function () {
  document.getElementById("myForm").style.display = "none";
  document.getElementById("submitBtn").style.display = "none";
  document.getElementById("myImage").style.display = "block";
  document.getElementById("Bomboclat").innerHTML =
    "¡Luffy se ha salvado gracias a tí!";
});
