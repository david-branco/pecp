<?php
include 'conn.php';

session_start();
if(!isset($_SESSION['user_id']))
	header('Location: index.html');

$user_id = $_SESSION['user_id'];
$id = $_GET['id'];

$query = "SELECT * FROM User_Eps, Episodios, Consultas WHERE user_id_Users = $user_id AND eps_id_Episodios = eps_id AND  consultas_id_Consultas AND consultas_id AND consultas_id = $id";
$rquery = mysql_query($query);
$row = mysql_fetch_array($rquery,0);
?>
<html>
<head>
<link rel="stylesheet" type="text/css" href="view.css">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Ver detalhes de uma consulta</title>
<script type="text/javascript">
function funcEditar (id) {
	var link = 'editarcon.php?id=';
	link +=id;
	window.location = link;
}
function funcApagar (id) {
	var link = 'apagarcon.php?id=';
	link +=id;
	window.location = link;	
}
</script>
</head>
<body>
	<div id ="title">Consulta</div>
	<div class ="legendas">
		Local:<br>
		Motivo:<br>
		Urgência:<br>
		Resumo:<br>
		Preço:<br>
		Data:<br>
	</div>
	<div class ="resultados">
		<?php echo $row['local']; ?><br>
		<?php echo $row['motivo']; ?><br>
		<?php echo $row['urgencia']; ?><br>
		<?php echo $row['resumo']; ?><br>
		<?php echo $row['preco']; ?> €<br>
		<?php echo $row['data']; ?><br>
	</div>
	<div id = "buttons">
	<button onclick ="funcEditar(<?php echo $row['consultas__id'];?>)">Editar</button></td>
	<button onclick ="funcApagar(<?php echo $row['consultas_id'];?>)">Apagar</button>
	</div>
</body>
</html>