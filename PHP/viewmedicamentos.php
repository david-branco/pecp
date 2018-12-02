<?php
include 'conn.php';

session_start();
if(!isset($_SESSION['user_id']))
	header('Location: index.html');

$user_id = $_SESSION['user_id'];
$id = $_GET['id'];

$query = "SELECT * FROM User_Medicamentos, Medicamentos WHERE user_id_Users = $user_id AND medicamentos_id_Medicamentos = $id";
$rquery = mysql_query($query);
$row = mysql_fetch_array($rquery,0);
?>
<html>
<head>
<link rel="stylesheet" type="text/css" href="view.css">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Ver detalhes de um medicamento</title>
<script type="text/javascript">
function funcEditar (id) {
	var link = 'editarmed.php?id=';
	link +=id;
	window.location = link;
}
function funcApagar (id) {
	var link = 'apagarmed.php?id=';
	link +=id;
	window.location = link;	
</script>
</head>
<body>
	<div id ="title">Medicamento</div>
	<div class ="legendas">
		Nome:<br>
		Dose:<br>
		Periodicidade:<br>
		Quantidade:<br>
		Restantes:<br>
	</div>
	<div class ="resultados">
		<?php echo $row['nome']; ?><br>
		<?php echo $row['dose']; ?><br>
		<?php echo $row['periodicidade']; ?><br>
		<?php echo $row['quantidade']; ?><br>
		<?php echo $row['restantes']; ?><br>
	</div>
	<div id = "buttons">
	<button onclick ="funcEditar(<?php echo $row['medicamentos_id'];?>)">Editar</button></td>
	<button onclick ="funcApagar(<?php echo $row['medicamentos_id'];?>)">Apagar</button>
	<button>Registar toma</button>
	</div>
</body>
</html>