<?php
include 'conn.php';

session_start();
if(!isset($_SESSION['user_id']))
	header('Location: index.html');

$user_id = $_SESSION['user_id'];

$nome = $_POST['nome']; 
$dose = $_POST['dose'];
$periodicidade = $_POST['periodicidade'];
$quantidade = $_POST['quantidade'];

$querymedicamento = "INSERT INTO Medicamentos (nome, dose, periodicidade, quantidade, restantes) VALUES ('$nome', '$dose', '$periodicidade', '$quantidade', '$quantidade')";
mysql_query($querymedicamento);

$newid = mysql_insert_id();	
$querymedicamento = "INSERT INTO User_Medicamentos (medicamentos_id_Medicamentos, user_id_Users) VALUES ('$newid', '$user_id')";
mysql_query($querymedicamento);

header('Location: dashboard.php');

?>