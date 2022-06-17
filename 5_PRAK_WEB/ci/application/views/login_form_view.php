<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>AdminLTE 3 | Log in (v2)</title>

  <!-- Google Font: Source Sans Pro -->
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback">
  <!-- Font Awesome -->
  <link rel="stylesheet" href="<?= base_url() ?>/assets/admin/plugins/fontawesome-free/css/all.min.css">
  <!-- icheck bootstrap -->
  <link rel="stylesheet" href="<?= base_url() ?>/assets/admin/plugins/icheck-bootstrap/icheck-bootstrap.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="<?= base_url() ?>/assets/admin/dist/css/adminlte.min.css">
</head>
<body class="hold-transition login-page">
<div class="login-box">
  <!-- /.login-logo -->
  <div class="card card-outline card-primary">
    <div class="card-header text-center">
      <a href="#" class="h1"><b>Admin</b> Vexa</a>
    </div>
    <div class="card-body">
      <p class="login-box-msg">Sign in to start your session</p>
      <!-- <?php if (isset($model->error) && !empty($model->error)) ?> -->
          <p style="color: red"><?= @$model->error ?></p>
      <!-- <? } ?> -->
      <form action="" method="post">
        <div class="input-group mb-3">
          <input type="text" class="form-control" placeholder="Username" name="username">
          <div class="input-group-append">
            <div class="input-group-text">
              <span class="fas fa-envelope"></span>
            </div>
          </div>
        </div>
        <div class="input-group mb-3">
          <input type="password" class="form-control" placeholder="Password" name="password">
          <div class="input-group-append">
            <div class="input-group-text">
              <span class="fas fa-lock"></span>
            </div>
          </div>
        </div>
        <div class="row">
          <div class="col-8">
            <div class="icheck-primary">
              <input type="checkbox" id="remember">
              <label for="remember">
                Remember Me
              </label>
            </div>
          </div>
          <!-- /.col -->
          <div class="col-4">
            <input type="submit" placeholder="Submit" class="btn btn-primary btn-block" name="btnSubmit" />
          </div>
          <!-- /.col -->
        </div>
      </form>
    </div>
    <!-- /.card-body -->
  </div>
  <!-- /.card -->
</div>
<!-- /.login-box -->

<!-- jQuery -->
<script src="<?= base_url() ?>/assets/admin/plugins/jquery/jquery.min.js"></script>
<!-- Bootstrap 4 -->
<script src="<?= base_url() ?>/assets/admin/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
<!-- AdminLTE App -->
<script src="<?= base_url() ?>/assets/admin/dist/js/adminlte.min.js"></script>
</body>
</html>



<!-- <html>
<head>
    <title>Admin Login</title>
    <style media="screen">
    body {
        background:#fff;
        font-family: 'roboto', sans-serif;
    }

    input {
        border: 1px solid #c9c4c4;
        padding: 6px 14px;
        background: white;
        margin: 5px;
    }

    button {
        background: yellow;
        color: #000;
        padding: 15px;
        border: none;
    }
    </style>
</head>
    <body>
    <h2>Admin Login</h2>
    <form action="" method="post">
        <?php if (isset($model->error) && !empty($model->error)) ?>
            <p style="color: red"><?= @$model->error ?></p>
        <? } ?>
        <table>
            <tr>
                <td>Username</td>
                <td><input type="text" name="username" size="10"></td>
            </tr>
            <tr>
                <td>Password</td>
                <td><input type="password" name="password" size="30"></td>
            </tr>
            <tr>
                <td></td>
                <td><button type="submit" name="btnSubmit">Login</button></td>
            </tr>
        </table>
    </form>
    </body>
</html> -->
