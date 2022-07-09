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
						<a href="<?php echo site_url('report/') ?>"><i class="fas fa-arrow-left"></i> Back</a>
					</div>
					<div class="card-body">

						<form action="<?php echo site_url('report/add') ?>" method="post" enctype="multipart/form-data" >
							<div class="form-group">
								<label for="name">Hotel*</label>
								<select class="form-control" name="hotel_id" required>
                                    <?php foreach ($hotels as $hotel): ?>
                                        <option value="<?= $hotel->id_hotel ?>"><?= $hotel->name ?></option>
                                    <?php endforeach; ?>
                                </select>
								<div class="invalid-feedback">
									<?php echo form_error('name') ?>
								</div>
							</div>

                            <div class="form-group">
                                <label for="description">Keterangan*</label>
                                <textarea class="form-control <?php echo form_error('description') ? 'is-invalid':'' ?>"
                                 type="text" name="description" placeholder="Deskripsi Kerusakan" required /></textarea>
                                <div class="invalid-feedback">
                                    <?php echo form_error('description') ?>
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
