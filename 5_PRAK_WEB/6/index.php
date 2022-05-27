<html>
<head>
    <title>Form</title>
    <link rel='stylesheet' href='6/style.css'>
</head>
<body>
    <center><h2>Free Registration</h2></center>
    <form action="proses.php" method="post"name="form">
        <table width="50%" border="0" align="center"cellpadding="0">
            <tr>
                <td class='td' width="15%">Nama</td>
                <td width="2%">:</td>
                <td width="83%"><input name="txtNama" type="text" id="txtNama"></td>
            </tr>
            <tr>
                <td class='td'>Tgl Lahir</td>
                <td>:</td>
                <td><input name="txtTgl" type="text" id="txtTgl" size="4" maxlength="2">/
                    <input name="txtBulan" type="text" id="txtBulan" size="4" maxlength="2">/
                    <input name="txtTahun" type="text" id="txtTahun" size="8" maxlength="4">
                </td>
            </tr>
            <tr>
                <td class='td'>Alamat</td>
                <td>&nbsp;</td>
                <td><textarea name="txtAlamat" cols="40" rows="2" id="txtAlamat"></textarea></td>
            </tr>
            <tr>
                <td class='td'>Kota</td>
                <td>:</td>
                <td><input name="txtKota" type="text" id="txtKota"></td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
                <td><button name="btnKirim" type="submit" id="btnKirim">Submit</button>
                    <button name="btnCancel" type="reset" id="btnCancel">Clear</button>
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
