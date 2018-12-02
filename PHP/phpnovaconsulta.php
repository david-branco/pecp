<?php
include 'conn.php';

session_start();
if(!isset($_SESSION['user_id']))
	header('Location: index.html');

$user_id = $_SESSION['user_id'];

$local = $_POST['local']; 
$urgencia = $_POST['urgencia'];
$data = $_POST['data'];
$motivo = $_POST['motivo']; 
$preco = $_POST['preco'];
$resumo = $_POST['resumo'];

$queryconsulta = "INSERT INTO Consultas (local, motivo, urgencia, resumo, preco) VALUES ('$local', '$motivo', '$urgencia', '$resumo', '$preco')";
mysql_query($queryconsulta);

$newid = mysql_insert_id();	
$queryconsulta = "INSERT INTO Episodios (consultas_id_Consultas, data) VALUES ('$newid', '$data')";
mysql_query($queryconsulta);

$newid = mysql_insert_id();	
$queryconsulta = "INSERT INTO User_Eps (eps_id_Episodios, user_id_Users) VALUES ('$newid','$user_id')";
mysql_query($queryconsulta);

header('Location: dashboard.php');

?>