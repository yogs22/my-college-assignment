<?php

defined('BASEPATH') OR exit('No direct script access allowed');

class Report extends CI_Controller
{
    public function __construct()
    {
        parent::__construct();
        $this->load->model("report_model");
        $this->load->model("hotel_model");
        $this->load->library('form_validation');

        $this->load->model('auth_model');
        if(!$this->auth_model->current_user()){
            redirect('auth/login');
        }
    }

    public function index()
    {
        $data["reports"] = $this->report_model->getAll();
        $this->load->view("admin/report/list", $data);
    }

    public function add()
    {
        $report = $this->report_model;
        $validation = $this->form_validation;
        $validation->set_rules($report->rules());

        if ($validation->run()) {
            $report->save();
            $this->session->set_flashdata('success', 'Berhasil disimpan');
        }

        $data["hotels"] = $this->hotel_model->getAll();

        $this->load->view("admin/report/add", $data);
    }

    public function edit($id = null)
    {
        if (!isset($id)) redirect('report');

        $report = $this->report_model;
        $validation = $this->form_validation;
        $validation->set_rules($report->rules());

        if ($validation->run()) {
            $report->update();
            $this->session->set_flashdata('success', 'Berhasil disimpan');
        }

        $data["report"] = $report->getById($id);
        $data["hotels"] = $this->hotel_model->getAll();

        if (!$data["report"]) show_404();

        $this->load->view("admin/report/edit", $data);
    }

    public function delete($id=null)
    {
        if (!isset($id)) show_404();

        if ($this->report_model->delete($id)) {
            $this->session->set_flashdata('success', 'Berhasil menghapus');
            redirect(site_url('report'));
        }
    }
}
