<?php
    require 'function.php';
    $customer = query("SELECT * FROM customer")
 ?>
 <!DOCTYPE html>
 <html>
     <head>
         <meta charset="utf-8">
         <meta name="viewport" content="width=device-width, initial-scale=1">
         <title>Halaman CRUD</title>
         <style media="screen">
             body {
                 font-family: 'arial';
             }
         </style>
    </head>
    <body>
        <h1>Daftar Customer</h1 >
        <table border="1" cellpadding="10" cellspacing="0">
            <tr>
                <th>No</th>
                <th>Kode</th>
                <th>Nama</th>
                <th>Stok</th>
                <th>Aksi</th>
            </tr>
            <?php $i =1; ?>
            <?php foreach( $customer as $row) : ?>
            <tr>
                <td><?php echo $i; ?></td>
                <td><?php echo $row["kd_customer"]; ?></td>
                <td><?php echo $row["nm_customer"]; ?></td>
                <td><?php echo $row["kota"]; ?></td>
                <td>
                    <a href="">Ubah</a> |
                    <a href="">Hapus</a>
                </td>
            </tr>
            <?php $i++; ?>
            <?php endforeach; ?>
        </table>
    </body>
</html>
