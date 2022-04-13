<?php
$nama = "Yogi Prasetyawan Hadi";

echo "<h2>Halo nama saya ". $nama ."</h2>";

$dingin = true;

if ($dingin == true) {
    echo "<p>Hari ini cuaca sedang dingin</p>";
}

echo "Menghitung";
for ($i=0; $i < 3; $i++) {
    echo "<p>".$i."</p>";
}

$semester = 5;
switch ($semester) {
    case '5':
        echo "Saya semester 5";
        break;

    default:
        echo "Saya lupa semester berapa";
        break;
}
?>
