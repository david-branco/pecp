<?php
include 'conn.php';

session_start();
if(!isset($_SESSION['user_id']))
	header('Location: index.html');

$user_id = $_SESSION['user_id'];
$id = $_GET['id'];

$query = "SELECT * FROM User_Eps, Episodios, Exames WHERE user_id_Users = $user_id AND eps_id_Episodios = eps_id AND  exames_id_Exames = exames_id AND  exames_id = $id";
$rquery = mysql_query($query);
$row = mysql_fetch_array($rquery,0);
?>
<html>
<head>
<link rel="stylesheet" type="text/css" href="view.css">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Ver detalhes de um exame</title>
<script type="text/javascript">
function funcEditar (id) {
	var link = 'editarexa.php?id=';
	link +=id;
	window.location = link;
}
function funcApagar (id) {
	var link = 'apagarexa.php?id=';
	link +=id;
	window.location = link;	
}
</script>
</head>
<body>
	<div id ="title">Exame</div>
	<div class ="legendas">
		Local:<br>
		Data:<br>
	</div>
	<div class ="resultados">
		<?php echo $row['local']; ?><br>
		<?php echo $row['data']; ?><br>
	</div>
	<div id = "buttons">
	<button onclick ="funcEditar(<?php echo $row['exames_id'];?>)">Editar</button></td>
	<button onclick ="funcApagar(<?php echo $row['exames_id'];?>)">Apagar</button>
	</div>
</body>
</html>