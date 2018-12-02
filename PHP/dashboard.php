<?php
include 'conn.php';

session_start();
if(!isset($_SESSION['user_id']))
	header('Location: index.html');

$user_id = $_SESSION['user_id'];

error_reporting(E_ERROR);
?>
<html>
<head>
	<script src="http://code.jquery.com/jquery-latest.min.js"></script>
	<link rel="stylesheet" type="text/css" href="dashboard.css">
	<title>Dashboard</title>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<script>
	$(document).ready(function () {      
    $('#nav li').hover(
        function () {
            $('ul', this).stop().slideDown(100);
 
        }, 
        function () {
            $('ul', this).stop().slideUp(100);          
        }
    );     
});
	</script>
</head>
<body>
	<ul id="nav">
    <li><a href="#">Consultas</a>
        <ul>
            <li><a href="novaconsulta.php">Nova Consulta</a></li>
            <li><a href="listarconsultas.php">Listar Consultas</a></li>
        </ul>
        <div class="clear"></div>
    </li>
    <li><a href="#">Exames</a>
    <ul>
        <li><a href="novoexame.php">Novo Exame</a></li>
        <li><a href="listarexames.php">Listar Exames</a></li>
    </ul>         
        <div class="clear"></div>
    </li>
    <li><a href="#">Análises</a>
    <ul>
        <li><a href="novaanalise.php">Nova Análise</a></li>
        <li><a href="listaranalises.php">Listar Análises</a></li>
    </ul>         
        <div class="clear"></div>
    </li>
    <li><a href="#">Vacinas</a>
    <ul>
        <li><a href="novavacina.php">Nova Vacina</a></li>
        <li><a href="listarvacinas.php">Listar Vacinas</a></li>
    </ul>         
        <div class="clear"></div>
    </li>
    <li><a href="#">Medicamentos</a>
    <ul>
        <li><a href="novomedicamento.php">Novo Medicamento</a></li>
        <li><a href="listarmedicamentos.php">Listar Medicamentos</a></li>
    </ul>         
        <div class="clear"></div>
    </li>
    <li><a href="#">Notificações</a>
    <ul>
        <li><a href="#">Gerir</a></li>        
    </ul>         
        <div class="clear"></div>
    </li>
</ul>
<div class="clear"></div>
	<div id ="titulodash">Dashboard</div>
	<div class ="medicamentos">
		<div id ="medicamentosbar"><img src ="redbar.png"></div>
		<div id ="medicamentostitulo">Medicamentos</div>
		<div id ="medicametostable">
			<table id ="tmedicamentos">
			<?php 
			$k =0;
			$querymedicamentos = "SELECT * FROM User_Medicamentos, Medicamentos WHERE user_id_Users = $user_id AND medicamentos_id_Medicamentos = medicamentos_id AND restantes > 0";
			$rmedicamentos = mysql_query($querymedicamentos);
			$nmedicamentos = mysql_num_rows($rmedicamentos);
			while ($nmedicamentos >0 && $k <5) {
			$rowmed = mysql_fetch_array($rmedicamentos, $k);
			?>
			<tr>
				<td class ="data"><?php echo $rowmed['periodicidade']?></td>
				<td class ="nome"><?php echo $rowmed['nome']?></td>
				<td class ="details"><a href ="viewmedicamentos.php?id=<?php echo $rowmed['medicamentos_id']?>"><img src ="moredetails.png"></a></td>
			</tr>
			<?php
			$nmedicamentos --;
			$k ++;
			}
			?>
			</table>
		</div>
	</div>
	<div class ="consultas">
		<div id ="consultasbar"><img src ="redbar.png"></div>
		<div id ="consultastitulo">Consultas</div>
		<div id ="consultastable">
			<table id ="tconsultas">
			<?php 
			$i =0;
			$queryconsultas = "SELECT * FROM User_Eps, Episodios, Consultas WHERE user_id_Users = $user_id AND eps_id_Episodios = eps_id AND consultas_id_Consultas IS NOT NULL AND consultas_id_Consultas = consultas_id AND Episodios.data > CURDATE() ORDER BY Episodios.data ASC";
			$rconsultas = mysql_query($queryconsultas);
			$nconsultas = mysql_num_rows($rconsultas);
			while ($nconsultas >0) {
			$row = mysql_fetch_array($rconsultas, $i);
			?>
			<tr>
				<td class ="data"><?php echo $row['data']; ?></td>
				<td class ="nome"><?php echo $row['local']; ?></td>
				<td class ="details"><a href ="viewconsultas.php?id=<?php echo $row['consultas_id']?>"><img src ="moredetails.png"></a></td>
			</tr>
			<?php
			$i ++;
			$nconsultas --;
			}
			?>
			</table>
		</div>
	</div>
	<div class ="exames">
		<div id ="examesbar"><img src ="redbar.png"></div>
		<div id ="examestitulo">Exames</div>
		<div id ="examestable">
			<table id ="texames">
			<?php 
			$j =0;
			$queryexames = "SELECT * FROM User_Eps, Episodios, Exames WHERE user_id_Users = $user_id AND eps_id_Episodios = eps_id AND exames_id_Exames IS NOT NULL AND exames_id_Exames = exames_id AND Episodios.data > CURDATE() ORDER BY Episodios.data ASC";
			$rexames = mysql_query($queryexames);
			$nexames = mysql_num_rows($rexames);
			while ($nexames >0) {
			$rowexa = mysql_fetch_array($rexames, $j);
			?>
			<tr>
				<td class ="data"><?php echo $rowexa['data']; ?></td>
				<td class ="nome"><?php echo $rowexa['local']; ?></td>
				<td class ="details"><a href ="viewexames.php?id=<?php echo $rowexa['exames_id']?>"><img src ="moredetails.png"></a></td>
			</tr>
			<?php
			$j ++;
			$nexames --;
			}
			?>
			</table>
		</div>
	</div>
	<div class ="vacinas">
		<div id ="vacinasbar"><img src ="redbar.png"></div>
		<div id ="vacinastitulo">Vacinas</div>
		<div id ="vacinastable">
			<table id ="tvacinas">
			<?php 
			$l =0;
			$queryvacinas = "SELECT * FROM User_Eps, Episodios, Vacinas WHERE user_id_Users = $user_id AND eps_id_Episodios = eps_id AND vacinas_id_Vacinas IS NOT NULL AND vacinas_id_Vacinas = vacinas_id AND Episodios.data > CURDATE() ORDER BY Episodios.data ASC";
			$rvacinas = mysql_query($queryvacinas);
			$nvacinas = mysql_num_rows($rvacinas);
			while ($nvacinas >0) {
			$rowvacinas = mysql_fetch_array($rvacinas, $l);
			?>
			<tr>
				<td class ="data"><?php echo $rowvacinas['data']; ?></td>
				<td class ="nome"><?php echo $rowvacinas['dose']; ?></td>
				<td class ="details"><a href ="viewvacinas.php?id=<?php echo $rowvacinas['vacinas_id']?>"><img src ="moredetails.png"></a></td>
			</tr>
			<?php
			$l ++;
			$nvacinas --;
			}
			?>
			</table>
		</div>
	</div>
</body>
</html>