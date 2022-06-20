<?php

defined('BASEPATH') OR exit('No direct script access allowed');

class User extends CI_Controller
{
    public function __construct()
    {
        parent::__construct();
        $this->load->model("user_model");
        $this->load->library('form_validation');

        $this->load->model('auth_model');
        if(!$this->auth_model->current_user()){
            redirect('auth/login');
        }
    }

    public function index()
    {
        $data["users"] = $this->user_model->getAll();
        $this->load->view("admin/user/list", $data);
    }

    public function add()
    {
        $user = $this->user_model;
        $validation = $this->form_validation;
        $validation->set_rules($user->addRules());

        if ($validation->run()) {
            $user->save();
            $this->session->set_flashdata('success', 'Berhasil disimpan');
        }

        $this->load->view("admin/user/add");
    }

    public function edit($id = null)
    {
        if (!isset($id)) redirect('user');

        $user = $this->user_model;
        $validation = $this->form_validation;
        $validation->set_rules($user->updateRules());

        if ($validation->run()) {
            $user->update();
            $this->session->set_flashdata('success', 'Berhasil disimpan');
        }

        $data["user"] = $user->getById($id);
        if (!$data["user"]) show_404();

        $this->load->view("admin/user/edit", $data);
    }

    public function delete($id=null)
    {
        if (!isset($id)) show_404();

        if ($this->user_model->delete($id)) {
            $this->session->set_flashdata('success', 'Berhasil menghapus');
            redirect(site_url('user'));
        }
    }
}
