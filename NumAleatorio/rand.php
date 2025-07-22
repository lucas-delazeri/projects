<?php
    $max = 100;
    $min = 0;
    $result = rand($min, $max);

    if (isset($_GET["numero"])) {
        $num = (int) $_GET["numero"];
            if ($num <= 100 && $num >= 0) {
                echo $result;
            }
    }
?>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <title>Resultado do Número</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <main>
        <h1>Resultado</h1>
        <p>O número gerado foi: <strong><?= $numero ?></strong></p>
        <form action="index.html" method="get">
            <button type="submit">Voltar</button>
        </form>
    </main>
</body>
</html>
