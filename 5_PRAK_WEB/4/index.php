<!DOCTYPE html>
<head>
    <title>Contoh Form</title>
    <style media="screen">
        body {
            font-family: 'Arial';
        }
        td {
            padding: 10px;
        }
        input, textarea, select {
            padding: 10px 12px;
            border-radius: 5px;
            border: 1px solid lightblue;
            font-family: 'arial'
        }
        .btn {
            background: yellow;
            color: black;
            padding: 12px 20px;
            border: none;
            border-radius: 5px;
            font-size: 15px;
            cursor: pointer;
        }
    </style>
</head>
<body style="background: #fff">
    <h2 align="center"><font color="#9966FF">Free Comment</font></h2>
    <h3 align="center"><font color="red">YOGI PRASETYAWAN HADI / 191110236</font></h3>
    <form method="post" enctype="multipart/form-data">
        <table width="68%" border="0" align="center" cellpadding="0">
            <tr>
                <td width="15%">Name</td>
                <td width="2%">:</td>
                <td width="83%"><input name="name" type="text" id="name" required></td>
            </tr>
            <tr>
                <td width="15%">NIM</td>
                <td width="2%">:</td>
                <td width="83%"><input name="nim" type="number" id="nim" required></td>
            </tr>
            <tr>
                <td>Prodi</td>
                <td>:</td>
                <td>
                    <select name="prodi" required>
                        <option value="Informatika">Informatika</option>
                        <option value="Sistem Informasi">Sistem Informasi</option>
                        <option value="Manajemen">Manajemen</option>
                        <option value="Bisnis">Bisnis</option>
                        <option value="Ekonomi">Ekonomi</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td width="15%">Email</td>
                <td width="2%">:</td>
                <td width="83%"><input name="email" type="email" id="email" required></td>
            </tr>
            <tr>
                <td width="15%">Website</td>
                <td width="2%">:</td>
                <td width="83%"><input name="website" type="url" id="website" required></td>
            </tr>
            <tr>
                <td>Comment</td>
                <td>&nbsp;</td>
                <td><textarea name="comment" cols="40" rows="2" id="comment" required></textarea></td>
            </tr>
            <tr>
                <td>Gender</td>
                <td>:</td>
                <td><input name="gender" type="radio" value="Male" checked>Male
                    <input type="radio" name="gender" value="Female">Female
                </td>
            </tr>
            <tr>
                <td>Religion</td>
                <td>:</td>
                <td>
                    <input name="religion" type="radio" value="Islam" checked>Islam
                    <input type="radio" name="religion" value="Kristen">Kristen
                    <input type="radio" name="religion" value="Katolik">Katolik
                    <input type="radio" name="religion" value="Hindu">Hindu
                    <input type="radio" name="religion" value="Budha">Budha
                </td>
            </tr>
            <tr>
                <td>File Upload</td>
                <td>:</td>
                <td><input type="file" name="file" accept="image/*" required></td>
            </tr>
            <tr>
                <td></td>
                <td></td>
                <td><button type="submit" class="btn">Upload</button></td>
            </tr>
        </table>
    </form>

    <?php if (count($_POST) > 0) {

    $target_dir = "uploads/";
    $target_file = $target_dir . basename($_FILES["file"]["name"]);

    if (move_uploaded_file($_FILES["file"]["tmp_name"], $target_file)) {
        
    } else {
        echo "Sorry, there was an error uploading your file.";
    }

    $actual_link = "http://$_SERVER[HTTP_HOST]$_SERVER[REQUEST_URI]";

    ?>

        <table width="68%" border="0" align="center" cellpadding="0">
            <tr>
                <td colspan="3"><h2 color="red">Hasil Submit</h2></td>
            </tr>
            <tr>
                <td width="15%">Nama</td>
                <td width="2%">:</td>
                <td><?= $_POST['name'] ?></td>
            </tr>
            <tr>
                <td>NIM</td>
                <td>:</td>
                <td><?= $_POST['nim'] ?></td>
            </tr>
            <tr>
                <td>Prodi</td>
                <td>:</td>
                <td><?= $_POST['prodi'] ?></td>
            </tr>
            <tr>
                <td>Email</td>
                <td>:</td>
                <td><?= $_POST['email'] ?></td>
            </tr>
            <tr>
                <td>Website</td>
                <td>:</td>
                <td><?= $_POST['website'] ?></td>
            </tr>
            <tr>
                <td>Comment</td>
                <td>:</td>
                <td><?= $_POST['comment'] ?></td>
            </tr>
            <tr>
                <td>Gender</td>
                <td>:</td>
                <td><?= $_POST['gender'] ?></td>
            </tr>
            <tr>
                <td>Religion</td>
                <td>:</td>
                <td><?= $_POST['religion'] ?></td>
            </tr>
            <tr>
                <td>File</td>
                <td>:</td>
                <td>
                    <img src="<?= $actual_link?>/uploads/<?= basename( $_FILES["file"]["name"]) ?>" width="50%">
                </td>
            </tr>
        </table>

    <?php } ?>
</body>
