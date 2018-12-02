<?php
include 'conn.php';

session_start();
if(!isset($_SESSION['user_id']))
	header('Location: index.html');

$user_id = $_SESSION['user_id'];
?>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<link rel="stylesheet" type="text/css" href="novaanalise.css" />
	<link rel="stylesheet" href="http://code.jquery.com/ui/1.9.2/themes/base/jquery-ui.css" />
    <script src="http://code.jquery.com/jquery-1.8.3.js"></script>
    <script src="http://code.jquery.com/ui/1.9.2/jquery-ui.js"></script>
	<title>Nova análise</title>
	<script>
    $(function() {
        $( "#data" ).datepicker({ dateFormat: "yy-mm-dd" });
    });
    </script>
</head>
<body>
	<div id="stylized" class="myform">
		<form id="form" name="form" method="post" action="phpnovaanalise.php">
		<h1>Nova Análise</h1>
		<p>Formulário para inserir nova análise</p>

		<label>Local
		<span class="small">Local da análise</span>
		</label>
		<input type="text" name="local" id="local" />
		
		<label>Data
		<span class="small">Data da análise</span>
		</label>
		<input type="text" name="data" id="data" />

		<label>Tipo
		<span class="small">Tipo de análise</span>
		</label>
		<select size="1" name="tipo">
		<option value="sangue">Sangue</option>
		<option value="urina">Urina</option>
		</select>

		<label>Preço
		<span class="small">Preço da análise</span>
		</label>
		<input type="text" name="preco" id="preco" value ="0"/>

		<button type="submit">Inserir</button>
		<div class="spacer"></div>
		</form>
	</div>
</body>
</html>