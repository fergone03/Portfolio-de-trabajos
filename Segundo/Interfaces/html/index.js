document.getElementById("submitBtn").addEventListener("click", function () {
  var inputValue = document.getElementById("card").value;

  if (inputValue.trim() === "") {
    alert("Please fill out the input field.");
  } else {
    document.getElementById("submitBtn").addEventListener("click", function () {
      document.getElementById("myForm").style.display = "none";
      document.getElementById("submitBtn").style.display = "none";
      document.getElementById("myImage").style.display = "block";
      document.getElementById("Bomboclat").innerHTML =
        "¡Luffy se ha salvado gracias a tí!";
    });
  }
});
