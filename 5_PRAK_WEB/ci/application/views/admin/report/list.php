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
						<a href="<?php echo site_url('/report/add') ?>"><i class="fas fa-plus"></i> Tambah Data</a>
					</div>
					<div class="card-body">

						<div class="table-responsive">
							<table class="table table-hover" id="dataTable" width="100%" cellspacing="0">
								<thead>
									<tr>
                                        <td>No</td>
                                        <td>Properti</td>
                                        <th>Keterangan</th>
                                        <th>Status</th>
                                        <th>Tanggal</th>
                                        <th>Aksi</th>
									</tr>
								</thead>
								<tbody>
									<?php foreach ($reports as $key => $report): ?>
									<tr>
                                        <td><?= ++$key ?></td>
                                        <td><?= $report->name ?></td>
                                        <td><?= $report->description ?> </td>
                                        <td><?= $report->status ?></td>
                                        <td><?= $report->created_at ?></td>
										<td width="250">
											<a href="<?= site_url('report/edit/'.$report->id) ?>"
											 class="btn btn-small btn-warning"><i class="fas fa-edit"></i> Edit</a>
											<a onclick="deleteConfirm('<?= site_url('report/delete/'.$report->id) ?>')"
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
