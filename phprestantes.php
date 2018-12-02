<?php
include 'conn.php';

session_start();
if(!isset($_SESSION['user_id']))
	header('Location: index.html');

$id = $_GET['id'];

echo "call PROC_RESTANTES('$id')";

$func = "CALL proc_restantes('$id')";
$res = $conn->prepare($func);
$res->execute();

print_r ($res->errorInfo());
//header ('Location: viewmedicamentos.php?id=' . $id);

?>