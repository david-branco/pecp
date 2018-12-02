<?php
include 'conn.php';
error_reporting(E_ERROR);

session_start();
if(!isset($_SESSION['user_id']))
	header('Location: index.html');

$user_id = $_SESSION['user_id'];

$query = "SELECT * FROM User_Medicamentos, Medicamentos  WHERE user_id_Users = $user_id AND medicamentos_id_Medicamentos = medicamentos_id ORDER BY medicamentos_id DESC";
$rquery = $conn->prepare($query);
$rquery->execute();
$row = $rquery->fetch();
?>
<html>
<head>
<link rel="stylesheet" type="text/css" href="list.css">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Listar medicamentos</title>
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
	<div id ="title">Medicamentos</div>
	<div id ="btn"><a href="dashboard.php"><button>Back Dashboard</button></a></div>
	<div id ="table">
	<table id ="tb">
	<tr>
	<td class ="topo" id ="nome">Nome</td>
	<td class ="topo" id ="dose">Dose</td>
	<td class ="topo" id ="periodicidade">Periodicidade</td>
	<td class ="topo" id ="quantidade">Quantidade</td>
	<td class ="topo" id ="restantes">Restantes</td>
	</tr>
	<?php
	$i =0;
	while ( $row) {
	?>
	<tr>
	<td class ="res" id ="nome"><?php echo $row['NOME'];?></td>
	<td class ="res" id ="dose"><?php echo $row['DOSE'];?></td>
	<td class ="res" id ="periodicidade"><?php echo $row['PERIODICIDADE'];?></td>
	<td class ="res" id ="quantidade"><?php echo $row['QUANTIDADE'];?></td>
	<td class ="res" id ="restantes"><?php echo $row['RESTANTES'];?></td>
	<td class ="res" id ="btnEditar"><button onclick ="funcEditar(<?php echo $row['MEDICAMENTOS_ID'];?>)">Editar</button></td>
	<td class ="res" id ="btnApagar"><button onclick ="funcApagar(<?php echo $row['MEDICAMENTOS_ID'];?>)">Apagar</button></td>
	<td class ="res" id ="btnToma"><button onclick ="funcTomar(<?php echo $row['MEDICAMENTOS_ID'];?>)">Registar toma</button></td>
	</tr>
	<?php
	$row = $rquery->fetch();
	}
	?>
	</table>
	</div>
</body>
</html>