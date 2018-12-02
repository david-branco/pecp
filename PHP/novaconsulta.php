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
	<title>Nova consulta</title>
	<script>
    $(function() {
        $( "#data" ).datepicker({ dateFormat: "yy-mm-dd" });
    });
    </script>
</head>
<body>
	<div id="stylized" class="myform">
		<form id="form" name="form" method="post" action="phpnovaconsulta.php">
		<h1>Nova consulta</h1>
		<p>Formulário para inserir nova consulta</p>

		<label>Motivo
		<span class="small">Motivo da consulta</span>
		</label>
		<input type="text" name="motivo" id="motivo" />

		<label>Resumo
		<span class="small">Resumo da consulta</span>
		</label>
		<input type="text" name="resumo" id="resumo" />

		<label>Preço
		<span class="small">Preço da consulta</span>
		</label>
		<input type="text" name="preco" id="preco" />

		<label>Urgência
		<span class="small">Consulta de urgência</span>
		</label>
		<select size="1" name="urgencia">
		<option value="sim">Sim</option>
		<option value="nao">Não</option>
		</select>

		<label>Data
		<span class="small">Data do exame</span>
		</label>
		<input type="text" name="data" id="data" />
		
		<label>Local
		<span class="small">Local do exame</span>
		</label>
		<input type="text" name="local" id="local" />

		<button type="submit">Inserir</button>
		<div class="spacer"></div>
		</form>
	</div>
</body>
</html>