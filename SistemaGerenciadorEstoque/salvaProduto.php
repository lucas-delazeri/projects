<?php
$host = "localhost";
$user = "root";
$pass = "";
$db = "testebancopi";

$conn = new mysqli($host, $user, $pass, $db);
if ($conn->connect_error) {
    die("Falha na conexão: " . $conn->connect_error);
}

$nome = $_POST['nomeProd'];
$descricao = $_POST['descricaoProd'];
$categoria = $_POST['categoriaProd'];
$tamanho = $_POST['tamanhoProd'];
$cor = $_POST['corProd'];
$preco = $_POST['precoVenda'];
$preco_compra = $_POST['precoCompra'];
$data_compra = $_POST['dataCompra'];

$stmt = $conn->prepare("INSERT INTO produtos (nomeProd, descricaoProd, categoriaProd, tamanhoProd, corProd, precoVenda, precoCompra, dataCompra)
                        VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
$stmt->bind_param("ssssddss", $nome, $descricao, $categoria, $tamanho, $cor, $preco, $preco_compra, $data_compra);


if ($stmt->execute()) {
    echo "Produto inserido com sucesso!";
} else {
    echo "Erro ao inserir: " . $stmt->error;
}

$stmt->close();
$conn->close();
?>
