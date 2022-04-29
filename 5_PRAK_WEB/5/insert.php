<?php
include "function.php";

$sql = "INSERT INTO customer VALUES ('P003', 'Marita', 'Solo')";

if ($conn->query($sql) === TRUE) {
    echo "New record created successfully";
} else {
    echo "Error: " . $sql . "<br>" . $conn->error;
}
$conn->close();
?>
