<?php

$datos = array (
    "User1" => array("User1", "Pass1", "admin"),
    "User2" => array("User2", "Pass2", "user"),
    "User3" => array("User3", "Pass3", "admin")
);

echo "El usuario 1 tiene perfil: " . $datos["User1"][2] . "</br>";
echo "El usuario 2 tiene perfil: " . $datos["User2"][2] . "</br>";
echo "El usuario 3 tiene perfil: " . $datos["User3"][2] . "</br>";

unset($datos["User3"]);

echo "El usuario 1 tiene perfil: " . $datos["User1"][2] . "</br>";
echo "El usuario 2 tiene perfil: " . $datos["User2"][2] . "</br>";

?>