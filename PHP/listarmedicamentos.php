<?php
include 'conn.php';
error_reporting(E_ERROR);

session_start();
if(!isset($_SESSION['user_id']))
	header('Location: index.html');

$user_id = $_SESSION['user_id'];

$query = "SELECT * FROM User_Medicamentos, Medicamentos  WHERE user_id_Users = $user_id AND medicamentos_id_Medicamentos = medicamentos_id ORDER BY medicamentos_id DESC";
$rquery = mysql_query($query);
$nquery = mysql_num_rows($rquery);
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
	var link = 'apagarmed.php?id=';
	link +=id;
	window.location = link;	
}
</script>
</head>
<body>
	<div id ="title">Medicamentos</div>
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
	while ( $i < $nquery) {
		$row = mysql_fetch_array($rquery,$i);
	?>
	<tr>
	<td class ="res" id ="nome"><?php echo $row['nome'];?></td>
	<td class ="res" id ="dose"><?php echo $row['dose'];?></td>
	<td class ="res" id ="periodicidade"><?php echo $row['periodicidade'];?></td>
	<td class ="res" id ="quantidade"><?php echo $row['quantidade'];?></td>
	<td class ="res" id ="restantes"><?php echo $row['restantes'];?></td>
	<td class ="res" id ="btnEditar"><button onclick ="funcEditar(<?php echo $row['medicamentos_id'];?>)">Editar</button></td>
	<td class ="res" id ="btnApagar"><button onclick ="funcApagar(<?php echo $row['medicamentos_id'];?>)">Apagar</button></td>
	<td class ="res" id ="btnToma"><button>Registar Toma</button></td>
	</tr>
	<?php
	$i++;
	}
	?>
	</table>
	</div>
</body>
</html>