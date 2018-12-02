<?php
include 'conn.php';
$username = $_POST['login'];
$password = $_POST['password'];
$password = md5($password);

$result = mysql_query("SELECT user_id FROM Users WHERE username ='$username' AND password ='$password'");

if (!$result) die('Invalid query: ' . mysql_error());

if(mysql_num_rows($result) > 0) {
	session_start();
	$row = mysql_fetch_array($result);
    $_SESSION['user_id'] = $row['user_id'];
	header ('Location: dashboard.php');
} else header ('Location: index.html'); 
?>