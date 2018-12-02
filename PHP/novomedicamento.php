<?php
include 'conn.php';

session_start();
if(!isset($_SESSION['user_id']))
	header('Location: index.html');

?>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<link rel="stylesheet" type="text/css" href="novaanalise.css" />
	<link rel="stylesheet" href="http://code.jquery.com/ui/1.9.2/themes/base/jquery-ui.css" />
    <script src="http://code.jquery.com/jquery-1.8.3.js"></script>
    <script src="http://code.jquery.com/ui/1.9.2/jquery-ui.js"></script>
	<title>Novo medicamento</title>
</head>
<body>
	<div id="stylized" class="myform">
		<form id="form" name="form" method="post" action="phpnovomedicamento.php">
		<h1>Novo medicamento</h1>
		<p>Formulário para inserir novo medicamento</p>

		<label>Nome
		<span class="small">Nome do medicamento</span>
		</label>
		<input type="text" name="nome" id="nome" />
		
		<label>Dose
		<span class="small">Dosagem</span>
		</label>
		<input type="text" name="dose" id="dose" />

		<label>Periodicidade
		<span class="small">Periodicidade</span>
		</label>
		<input type="text" name="periodicidade" id="periodicidade" />

		<label>Quantidade
		<span class="small">Quantidade a tomar</span>
		</label>
		<input type="text" name="quantidade" id="quantidade" value ="0"/>

		<button type="submit">Inserir</button>
		<div class="spacer"></div>
		</form>
	</div>
</body>
</html>