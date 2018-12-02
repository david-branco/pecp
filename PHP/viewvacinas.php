<?php
include 'conn.php';

session_start();
if(!isset($_SESSION['user_id']))
	header('Location: index.html');

$user_id = $_SESSION['user_id'];
$id = $_GET['id'];

$query = "SELECT * FROM User_Eps, Episodios, Vacinas WHERE user_id_Users = $user_id AND eps_id_Episodios = eps_id AND  vacinas_id_Vacinas = vacinas_id AND  vacinas_id = $id";
$rquery = mysql_query($query);
$row = mysql_fetch_array($rquery,0);
?>
<html>
<head>
<link rel="stylesheet" type="text/css" href="view.css">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Ver detalhes de uma vacina</title>
<script type="text/javascript">
function funcEditar (id) {
	var link = 'editarvac.php?id=';
	link +=id;
	window.location = link;
}
function funcApagar (id) {
	var link = 'apagarvac.php?id=';
	link +=id;
	window.location = link;	
}
</script>
</head>
<body>
	<div id ="title">Vacina</div>
	<div class ="legendas">
		Periodicidade:<br>
		Dose:<br>
		Preço:<br>
		Data:<br>
	</div>
	<div class ="resultados">
		<?php echo $row['periodicidade']; ?><br>
		<?php echo $row['dose']; ?><br>
		<?php echo $row['preco']; ?> €<br>
		<?php echo $row['data']; ?><br>
	</div>
	<div id = "buttons">
	<button onclick ="funcEditar(<?php echo $row['vacinas_id'];?>)">Editar</button></td>
	<button onclick ="funcApagar(<?php echo $row['vacinas_id'];?>)">Apagar</button>
	</div>
</body>
</html>