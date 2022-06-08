<?php
class Hello extends CI_Controller
{
    public function index() {
        $this->load->model('Hello_model');

        $model = $this->Hello_model;
        $strNim = '191110236';
        $strName = 'YOGI PRASETYAWAN HADI';

        return $this->load->view('hello_view', [
            'text' => $model->string,
            'nim' => $strNim,
            'name' => $strName
        ]);
    }
}
