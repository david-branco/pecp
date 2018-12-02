<?php
include 'conn.php';

session_start();
if(!isset($_SESSION['user_id']))
	header('Location: index.html');

$user_id = $_SESSION['user_id'];

$local = $_POST['local']; 
$tipo = $_POST['tipo'];
$data = $_POST['data'];

$queryexame = "INSERT INTO Exames (local) VALUES ('$local')";
mysql_query($queryexame);

$newid = mysql_insert_id();	
$queryexame = "INSERT INTO Episodios (exames_id_Exames, data) VALUES ('$newid', '$data')";
mysql_query($queryexame);

$newid = mysql_insert_id();	
$queryexame = "INSERT INTO User_Eps (eps_id_Episodios, user_id_Users) VALUES ('$newid','$user_id')";
mysql_query($queryexame);

header('Location: dashboard.php');

?>