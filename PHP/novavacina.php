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
	<title>Nova vacina</title>
	<script>
    $(function() {
        $( "#data" ).datepicker({ dateFormat: "yy-mm-dd" });
    });
    </script>
</head>
<body>
	<div id="stylized" class="myform">
		<form id="form" name="form" method="post" action="phpnovavacina.php">
		<h1>Nova vacina</h1>
		<p>Formulário para inserir nova vacina</p>

		<label>Dosagem
		<span class="small">Dosagem da vacina</span>
		</label>
		<input type="text" name="dose" id="dose" />

		<label>Periodicidade
		<span class="small">Periodicidade da vacina</span>
		</label>
		<input type="text" name="periodicidade" id="periodicidade" />

		<label>Preço
		<span class="small">Preço da vacina</span>
		</label>
		<input type="text" name="preco" id="preco" />

		<label>Data
		<span class="small">Data do exame</span>
		</label>
		<input type="text" name="data" id="data" />

		<button type="submit">Inserir</button>
		<div class="spacer"></div>
		</form>
	</div>
</body>
</html>