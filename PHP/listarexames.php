<?php
include 'conn.php';
error_reporting(E_ERROR);

session_start();
if(!isset($_SESSION['user_id']))
	header('Location: index.html');

$user_id = $_SESSION['user_id'];

$query = "SELECT * FROM User_Eps, Episodios, Exames WHERE user_id_Users = $user_id AND eps_id_Episodios = eps_id AND exames_id_Exames = exames_id AND Episodios.data > CURDATE() ORDER BY Episodios.data ASC";
$rquery = mysql_query($query);
$nquery = mysql_num_rows($rquery);
?>
<html>
<head>
<link rel="stylesheet" type="text/css" href="list.css">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Listar exames</title>
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
	<div id ="title">Exames</div>
	<div id ="table">
	<table id ="tb">
	<tr>
	<td class ="topo" id ="local">Local</td>
	<td class ="topo" id ="data">Data</td>
	</tr>
	<?php
	$i =0;
	while ( $i < $nquery) {
		$row = mysql_fetch_array($rquery,$i);
	?>
	<tr>
	<td class ="res" id ="local"><?php echo $row['local'];?></td>
	<td class ="res" id ="data"><?php echo $row['data'];?></td>
	<td class ="res" id ="btnEditar"><button onclick ="funcEditar(<?php echo $row['exames_id'];?>)">Editar</button></td>
	<td class ="res" id ="btnApagar"><button onclick ="funcApagar(<?php echo $row['exames_id'];?>)">Apagar</button></td>
	</tr>
	<?php
	$i++;
	}
	?>
	</table>
	</div>
</body>
</html>