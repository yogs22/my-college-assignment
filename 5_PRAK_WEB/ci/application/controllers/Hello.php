<?php
class Hello extends CI_Controller
{
    public function index() {
        $this->load->model('Hello_model');

        $model = $this->Hello_model;

        return $this->load->view('hello_view', [
            'name' => $model->name,
            'nim' => $model->nim
        ]);
    }
}
