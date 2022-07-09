<?php

defined('BASEPATH') OR exit('No direct script access allowed');

class Hotel extends CI_Controller
{
    public function __construct()
    {
        parent::__construct();
        $this->load->model("hotel_model");
        $this->load->library('form_validation');

        $this->load->model('auth_model');
        if(!$this->auth_model->current_user()){
            redirect('auth/login');
        }
    }

    public function index()
    {
        $data["hotels"] = $this->hotel_model->getAll();
        $this->load->view("admin/hotel/list", $data);
    }

    public function add()
    {
        $hotel = $this->hotel_model;
        $validation = $this->form_validation;
        $validation->set_rules($hotel->rules());

        if ($validation->run()) {
            $hotel->save();
            $this->session->set_flashdata('success', 'Berhasil disimpan');
        }

        $this->load->view("admin/hotel/add");
    }

    public function edit($id = null)
    {
        if (!isset($id)) redirect('hotel');

        $hotel = $this->hotel_model;
        $validation = $this->form_validation;
        $validation->set_rules($hotel->rules());

        if ($validation->run()) {
            $hotel->update();
            $this->session->set_flashdata('success', 'Berhasil disimpan');
        }

        $data["hotel"] = $hotel->getById($id);
        if (!$data["hotel"]) show_404();

        $this->load->view("admin/hotel/edit", $data);
    }

    public function delete($id=null)
    {
        if (!isset($id)) show_404();

        if ($this->hotel_model->delete($id)) {
            $this->session->set_flashdata('success', 'Berhasil menghapus');
            redirect(site_url('hotel'));
        }
    }
}
