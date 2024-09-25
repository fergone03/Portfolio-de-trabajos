document.getElementById("submitBtn").addEventListener("click", function () {
    var cardValue = document.getElementById("card").value;
    var nameValue = document.getElementById("name").value;
    var yearsValue = document.getElementById("years").value;
    var fechaValue = document.getElementById("fecha").value;
  
 
    if (
      cardValue.trim() === "" ||
      nameValue.trim() === "" ||
      yearsValue.trim() === "" ||
      fechaValue.trim() === ""
    ) {
      alert("Rellena todos los campos o Luffy pal lobby");
    } else {
      document.getElementById("myForm").style.display = "none";
      document.getElementById("submitBtn").style.display = "none";
      document.getElementById("myImage").style.display = "block";
      document.getElementById("Bomboclat").innerHTML =
        "¡Luffy se ha salvado gracias a tí!";
    }
  });
  