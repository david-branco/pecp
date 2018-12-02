<?php
include 'conn.php';

session_start();
if(!isset($_SESSION['user_id']))
	header('Location: index.html');

$id = $_GET['id'];

$dose = $_POST['dose'];
$periodicidade = $_POST['periodicidade'];
$preco = $_POST['preco'];

$query ="UPDATE Vacinas SET dose = '$dose', preco = '$preco', periodicidade = '$periodicidade' WHERE vacinas_id = '$id'";
mysql_query($query);

header ('Location: listarvacinas.php');

?>