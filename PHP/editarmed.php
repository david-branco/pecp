<?php
include 'conn.php';

session_start();
if(!isset($_SESSION['user_id']))
	header('Location: index.html');

$id = $_GET['id'];
$query ="SELECT * FROM Medicamentos WHERE medicamentos_id = '$id'";
$rquery = mysql_query($query);
$row = mysql_fetch_array($rquery,0);

?>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<link rel="stylesheet" type="text/css" href="novaanalise.css" />
	<link rel="stylesheet" href="http://code.jquery.com/ui/1.9.2/themes/base/jquery-ui.css" />
    <script src="http://code.jquery.com/jquery-1.8.3.js"></script>
    <script src="http://code.jquery.com/ui/1.9.2/jquery-ui.js"></script>
	<title>Editar medicamento</title>
	<script>
    $(function() {
        $( "#data" ).datepicker({ dateFormat: "yy-mm-dd" });
    });
    </script>
</head>
<body>
	<div id="stylized" class="myform">
		<form id="form" name="form" method="post" action="phpeditarmedicamento.php?id=<?php echo $id;?>">
		<h1>Editar medicamento</h1>
		<p>Formulário para editar medicamento</p>
		
		<label>Nome
		<span class="small">Nome do medicamento</span>
		</label>
		<input type="text" name="nome" id="nome" value ="<?php echo $row['nome'];?>"/>

		<label>Dosagem
		<span class="small">Dosagem da vacina</span>
		</label>
		<input type="text" name="dose" id="dose" value ="<?php echo $row['dose'];?>"/>

		<label>Periodicidade
		<span class="small">Periodicidade da vacina</span>
		</label>
		<input type="text" name="periodicidade" id="periodicidade" value ="<?php echo $row['periodicidade'];?>"/>

		<label>Quantidade
		<span class="small">Quantidade a tomar</span>
		</label>
		<input type="text" name="quantidade" id="quantidade" value ="<?php echo $row['quantidade'];?>"/>

		<label>Restantes
		<span class="small">Restantes</span>
		</label>
		<input type="text" name="restantes" id="restantes" value ="<?php echo $row['restantes'];?>"/>

		<button type="submit">Guardar</button>
		<div class="spacer"></div>
		</form>
	</div>
</body>
</html>