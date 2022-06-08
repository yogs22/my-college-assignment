<?php
class Login_model extends CI_Model {
    public $username;
    public $password;
    public $nama;
    public function construct() {
        parent::_construct();
        $this->load->database();
    }

    public function login_check(){
        $sql=sprintf("SELECT COUNT(*) AS cnt FROM user WHERE username='%s' AND password=PASSWORD('%s')", $this->username, $this->password);
        $query = $this->db->query($sql);
        $row = $query->row_array();
        return $row['cnt'] == 0;
    }
}
