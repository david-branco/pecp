<?php
include 'conn.php';

session_start();
if(!isset($_SESSION['user_id']))
	header('Location: index.html');

$user_id = $_SESSION['user_id'];

$tipo = $_POST['tipo']; 
$data = $_POST['data'];
$local = $_POST['local'];
$preco = $_POST['preco'];

$queryanalise = "INSERT INTO Analises (local, preco) VALUES ('$local', '$preco')";
mysql_query($queryanalise);

$newid = mysql_insert_id();	
$queryanalise = "INSERT INTO Episodios (analises_id_Analises, data) VALUES ('$newid', '$data')";
mysql_query($queryanalise);

$newid = mysql_insert_id();	
$queryanalise = "INSERT INTO User_Eps (user_id_Users, eps_id_Episodios) VALUES ('$user_id','$newid')";
mysql_query($queryanalise);

header('Location: dashboard.php');

?>