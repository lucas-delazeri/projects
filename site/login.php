<?php
include("config.php");

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $usuario = $_POST['inputUser'];
    $senha = $_POST['inputPass'];

    $usuario = $conexao->real_escape_string($usuario);
    $senha = $conexao->real_escape_string($senha);

    $sql = "SELECT * FROM usuarios WHERE nome = '$usuario' AND senha = '$senha'";
    $resultado = $conexao->query($sql);

    if ($resultado->num_rows == 1) {
        echo "Login bem-sucedido!";
    } else {
        echo "Usuário ou senha incorretos.";
    }
}
?>
