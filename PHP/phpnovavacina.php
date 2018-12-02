<?php
include 'conn.php';

session_start();
if(!isset($_SESSION['user_id']))
	header('Location: index.html');

$user_id = $_SESSION['user_id'];

$data = $_POST['data'];
$dose = $_POST['dose']; 
$preco = $_POST['preco'];
$periodicidade = $_POST['periodicidade'];

$queryvacina = "INSERT INTO Vacinas (dose, periodicidade, preco) VALUES ('$dose', '$periodicidade', '$prec')";
mysql_query($queryvacina);

$newid = mysql_insert_id();	
$queryvacina = "INSERT INTO Episodios (vacinas_id_Vacinas, data) VALUES ('$newid', '$data')";
mysql_query($queryvacina);

$newid = mysql_insert_id();	
$queryvacina = "INSERT INTO User_Eps (eps_id_Episodios, user_id_Users) VALUES ('$newid','$user_id')";
mysql_query($queryvacina);

header('Location: dashboard.php');

?>