<?php
include 'conn.php';

session_start();
if(!isset($_SESSION['user_id']))
	header('Location: index.html');

$id = $_GET['id'];

$motivo = $_POST['motivo'];
$resumo = $_POST['resumo'];
$preco = $_POST['preco'];
$local = $_POST['local'];

$query ="UPDATE Consultas SET motivo = '$motivo', resumo = '$resumo', preco = '$preco', local = '$local' WHERE consultas_id = '$id'";
mysql_query($query);

header ('Location: listarconsultas.php');

?>