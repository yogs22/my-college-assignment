<?php
class Login extends CI_Controller
{
    public $model = NULL;

    public function __construct(){
        parent::__construct();
        $this->load->model('login_model');
        $this->model = $this->login_model;
    }

    public function index(){
        if (isset($_POST['btnSubmit'])){
            $this->model->username = $this->input->post('username');
            $this->model->password = $this->input->post('password');
            if ($this->model->login_check() != false) {
                $session = $this->model->login_check();
                $this->model->name = $session['name'];
                $this->model->email = $session['email'];
                $this->model->level = $session['level'];
                $this->model->username = $session['username'];

                return redirect(base_url("admin"));
            } else {
                $this->model->error = 'Maaf username / password salah';
                return $this->load->view('login_form_view',['model' => $this->model]);
            }
        } else {
            $this->load->view('login_form_view',['model' => $this->model]);
        }
    }

    public function logout(){
        if($this->session->has_userdata('username')) {
            $this->session->sess_destroy();
            return redirect(base_url("login"));
        }
    }
}
