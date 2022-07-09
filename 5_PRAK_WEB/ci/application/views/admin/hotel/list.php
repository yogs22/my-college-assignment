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
                <div class="card mb-3">
					<div class="card-header">
						<a href="<?php echo site_url('/hotel/add') ?>"><i class="fas fa-plus"></i> Tambah Data</a>
					</div>
					<div class="card-body">

						<div class="table-responsive">
							<table class="table table-hover" id="dataTable" width="100%" cellspacing="0">
								<thead>
									<tr>
                                        <td>No</td>
										<th>Name</th>
                                        <th>Alamat</th>
                                        <th>Aksi</th>
									</tr>
								</thead>
								<tbody>
									<?php foreach ($hotels as $key => $hotel): ?>
									<tr>
                                        <td><?= ++$key ?></td>
										<td><?= $hotel->name ?></td>
                                        <td><?= $hotel->address ?></td>
										<td width="250">
											<a href="<?= site_url('hotel/edit/'.$hotel->id_hotel) ?>"
											 class="btn btn-small btn-warning"><i class="fas fa-edit"></i> Edit</a>
											<a onclick="deleteConfirm('<?= site_url('hotel/delete/'.$hotel->id_hotel) ?>')"
											 href="#!" class="btn btn-small btn-danger"><i class="fas fa-trash"></i> Hapus</a>
										</td>
									</tr>
									<?php endforeach; ?>

								</tbody>
							</table>
						</div>
					</div>
				</div>
            </div>
        </div>
    </div>
    <!-- /.container-fluid -->
</div>
<!-- /.content-wrapper -->

<!-- Main Footer -->

<script>
function deleteConfirm(url){
	$('#btn-delete').attr('href', url);
	$('#deleteModal').modal();
}
</script>

<?php $this->load->view("admin/layout/footer.php") ?>
