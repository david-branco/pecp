<?php
include 'conn.php';

session_start();
if(!isset($_SESSION['user_id']))
	header('Location: index.html');

$id = $_GET['id'];

$dose = $_POST['dose'];
$periodicidade = $_POST['periodicidade'];
$nome = $_POST['nome'];
$quantidade = $_POST['quantidade'];
$restantes = $_POST['restantes'];

$query ="UPDATE Medicamentos SET dose = '$dose', nome = '$nome', periodicidade = '$periodicidade', quantidade = '$quantidade', restantes = '$restantes' WHERE medicamentos_id = '$id'";
mysql_query($query);

header ('Location: listarmedicamentos.php');

?>