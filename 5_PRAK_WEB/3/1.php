<!DOCTYPE html>
<html>
<head>
    <style media="screen">
        body {
            font-family: 'Arial';
            background: lightblue;
        }
    </style>
</head>
<body>
    <h2>Yogi Prasetyawan Hadi / 19111026</h2>
<?php
    echo "<h5>Looping statement : While </h5>";
    $x = 1;

    while($x <= 5) {
        echo "<p>The number is: $x</p>";
        $x++;
    }

    echo "<h5>Looping statement : For</h5>";

    for ($x = 0; $x <= 10; $x++) {
        echo "<p>The number is: $x</p>";
    }

    echo "<h5>Looping statement : For-Each</h5>";
    $colors = array("red", "green", "blue", "yellow");

    foreach ($colors as $value) {
        echo "<p>$value</p>";
    }
?>
</body>
</html>
