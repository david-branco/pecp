<?php
include 'conn.php';

session_start();
if(!isset($_SESSION['user_id']))
	header('Location: index.html');

$id = $_GET['id'];

$local = $_POST['local'];

$query ="UPDATE Exames SET local = '$local' WHERE exames_id = '$id'";
mysql_query($query);

header ('Location: listarexames.php');

?>