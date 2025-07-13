<?php
$host = "localhost";
$usuario = "root";
$senha = "";
$banco = "loginsiteteste";

$conexao = new mysqli($host, $usuario, $senha, $banco);

// Verifica a conexão
if ($conexao->connect_error) {
    die("Falha na conexão: " . $conexao->connect_error);
}

// Conexão bem-sucedida
echo "Conectado com sucesso!";
?>
