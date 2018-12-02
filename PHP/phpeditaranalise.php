<?php
include 'conn.php';

session_start();
if(!isset($_SESSION['user_id']))
	header('Location: index.html');

$id = $_GET['id'];

$local = $_POST['local'];
$preco = $_POST['preco'];

$query ="UPDATE Analises SET local = '$local', preco = '$preco' WHERE analises_id = '$id'";
mysql_query($query);

header ('Location: listaranalises.php');

?>