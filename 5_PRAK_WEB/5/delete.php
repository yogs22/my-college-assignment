<?php
include "function.php";

$sql = "DELETE FROM customer WHERE kd_customer = 'P003'";

if ($conn->query($sql) === TRUE) {
    echo "Record deleted successfully";
} else {
    echo "Error deleting record: " . $conn->error;
}

$conn->close();
?>
