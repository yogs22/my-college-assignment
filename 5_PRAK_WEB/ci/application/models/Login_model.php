<?php
class Login_model extends CI_Model {
    public $username;
    public $password;
    public $name;
    public $email;
    public $level;

    public function __construct() {
        parent::__construct();
        $this->load->database();
    }

    public function login_check(){
        $sql= "SELECT * FROM user WHERE username='". $this->username ."' AND password='". $this->password ."'";
        $query = $this->db->query($sql);
        $row = $query->row_array();

        if ($row == null) {
            return false;
        }

        return $row;
    }
}
