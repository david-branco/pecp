<?php
include 'conn.php';

session_start();
if(!isset($_SESSION['user_id']))
	header('Location: index.html');

$user_id = $_SESSION['user_id'];
$id = $_GET['id'];

$query = "SELECT * FROM User_Medicamentos, Medicamentos WHERE medicamentos_id = $id";
$rquery = $conn->prepare($query);
$rquery->execute();
$row = $rquery->fetch();
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
	var link = 'phpdeletemedicamento.php?id=';
	link +=id;
	window.location = link;
}
function funcTomar (id) {
	var link = 'phprestantes.php?id=';
	link +=id;
	window.location = link;
}	
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
		<?php echo $row['NOME']; ?><br>
		<?php echo $row['DOSE']; ?><br>
		<?php echo $row['PERIODICIDADE']; ?><br>
		<?php echo $row['QUANTIDADE']; ?><br>
		<?php echo $row['RESTANTES']; ?><br>
	</div>
	<div id = "buttons">
	<button onclick ="funcEditar(<?php echo $row['MEDICAMENTOS_ID'];?>)">Editar</button></td>
	<button onclick ="funcApagar(<?php echo $row['MEDICAMENTOS_ID'];?>)">Apagar</button>
	<button onclick ="funcTomar(<?php echo $row['MEDICAMENTOS_ID'];?>)">Registar toma</button>
	<div id ="btn"><a href="dashboard.php"><button>Back Dashboard</button></a></div>
	</div>
</body>
</html>