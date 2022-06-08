<?php
class Login extends CI_Controller{
    public $model = NULL;
    public function construct(){
        parent::_construct();
        $this->load->model('login_model');
        $this->model = $this->login_model;
    }

    public function index(){
        if (isset($_POST['btnSubmit'])){
            $this->model->username = $this->input->post('username');
            $this->model->password = $this->input->post('password');
            if ($this->model->login_check() == TRUE) {
                $this->session->set_userdata('username', $this->model->username);
                $this->load->view('login_success_view',['model' => $this->model]);
            } else {
                redirect('login');
            }
        } else {
            $this->load->view('login_form_view',['model' => $this->model]);
        }
    }

    public function logout(){
        if($this->session->has_userdata('username')) {
            $this->session->sess_destroy();
            $this->load->view('login_form_view',['model' => $this->model]);
        }
    }
}
