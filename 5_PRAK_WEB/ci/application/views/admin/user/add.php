<!-- Main Header -->
<?php $this->load->view("admin/layout/header.php") ?>

<!-- Main Sidebar -->
<?php $this->load->view("admin/layout/sidebar.php") ?>

<!-- Content Wrapper. Contains page content -->
<div class="content-wrapper">
    <div class="container">

        <?php $this->load->view("admin/layout/breadcrumb.php") ?>

        <?php if ($this->session->flashdata('success')): ?>
            <div class="alert alert-success" role="alert">
                <?= $this->session->flashdata('success'); ?>
            </div>
        <?php endif; ?>

        <div class="card mb-3">
            <div class="card-body">
                <div class="card-header">
						<a href="<?php echo site_url('user/') ?>"><i class="fas fa-arrow-left"></i> Back</a>
					</div>
					<div class="card-body">

						<form action="<?php echo site_url('user/add') ?>" method="post" enctype="multipart/form-data" >
							<div class="form-group">
								<label for="name">Nama*</label>
								<input class="form-control <?php echo form_error('name') ? 'is-invalid':'' ?>"
								 type="text" name="name" placeholder="Nama user" required />
								<div class="invalid-feedback">
									<?php echo form_error('name') ?>
								</div>
							</div>

                            <div class="form-group">
                                <label for="username">Username*</label>
                                <input class="form-control <?php echo form_error('username') ? 'is-invalid':'' ?>"
                                 type="text" name="username" placeholder="Username user" required />
                                <div class="invalid-feedback">
                                    <?php echo form_error('username') ?>
                                </div>
                            </div>

                            <div class="form-group">
                                <label for="email">Email*</label>
                                <input class="form-control <?php echo form_error('email') ? 'is-invalid':'' ?>"
                                 type="email" name="email" placeholder="Email user" required />
                                <div class="invalid-feedback">
                                    <?php echo form_error('email') ?>
                                </div>
                            </div>

                            <div class="form-group">
                                <label for="password">Password*</label>
                                <input class="form-control <?php echo form_error('password') ? 'is-invalid':'' ?>"
                                 type="password" name="password" placeholder="Password user" required />
                                <div class="invalid-feedback">
                                    <?php echo form_error('password') ?>
                                </div>
                            </div>

                            <div class="form-group">
                                <label for="level">Level*</label>
                                <select class="form-control <?php echo form_error('password') ? 'is-invalid':'' ?>" name="level" required>
                                    <option value="admin">Admin</option>
                                    <option value="member">Member</option>
                                </select>
                                <div class="invalid-feedback">
                                    <?php echo form_error('level') ?>
                                </div>
                            </div>

							<input class="btn btn-success" type="submit" name="btn" value="Simpan" />
						</form>

					</div>

					<div class="card-footer small text-muted">
						* required fields
					</div>


				</div>
            </div>
        </div>
    </div>
    <!-- /.container-fluid -->
</div>
<!-- /.content-wrapper -->

<!-- Main Footer -->
<?php $this->load->view("admin/layout/footer.php") ?>
