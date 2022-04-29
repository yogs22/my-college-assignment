<?php
include "function.php";

$sql = "UPDATE customer SET nm_customer = 'Budi' WHERE kd_customer = 'P001'";

if ($conn->query($sql) === TRUE) {
    echo "Record updated successfully";
} else {
    echo "Error updating record: " . $conn->error;
}

$conn->close();
?>
