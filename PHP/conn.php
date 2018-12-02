<?php

$username ="clinicauser";
$password ="brunotiago1";
$database = "clinica";

$connection = mysql_connect("localhost",$username,$password);
mysql_select_db($database,$connection);

if (!$connection) {
    die('Não é possível conectar à base de dados: ' . mysql_error());
}

?>