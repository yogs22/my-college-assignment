<?php
class auth_model extends CI_Model {
    public $username;
    public $password;
    public $name;
    public $email;
    public $level;

    private $_table = "user";
    const SESSION_KEY = 'user_id';
    const SESSION_NAME = 'user_name';

    public function __construct() {
        parent::__construct();
        $this->load->database();
    }

    public function rules()
    {
        return [
            [
                'field' => 'username',
                'label' => 'Username',
                'rules' => 'required'
            ],
            [
                'field' => 'password',
                'label' => 'Password',
                'rules' => 'required|max_length[255]'
            ]
        ];
    }

    public function login($username, $password)
    {
        $this->db->where('username', $username);
        $query = $this->db->get($this->_table);
        $user = $query->row();

        // cek apakah user sudah terdaftar?
        if (!$user) {
            return FALSE;
        }

        // cek apakah passwordnya benar?
        if (!password_verify($password, $user->password)) {
            return FALSE;
        }

        // bikin session
        $this->session->set_userdata([self::SESSION_KEY => $user->id]);
        $this->session->set_userdata([self::SESSION_NAME => $user->name]);
        $this->_update_last_login($user->id);

        return $this->session->has_userdata(self::SESSION_KEY);
    }

    public function current_user()
    {
        if (!$this->session->has_userdata(self::SESSION_KEY)) {
            return null;
        }

        $user_id = $this->session->userdata(self::SESSION_KEY);
        $query = $this->db->get_where($this->_table, ['id' => $user_id]);
        return $query->row();
    }

    public function logout()
    {
        $this->session->unset_userdata(self::SESSION_KEY);
        $this->session->unset_userdata(self::SESSION_NAME);
        $this->session->sess_destroy();
        return !$this->session->has_userdata(self::SESSION_KEY);
    }

    private function _update_last_login($id)
    {
        $data = [
            'last_login' => date("Y-m-d H:i:s"),
        ];

        return $this->db->update($this->_table, $data, ['id' => $id]);
    }
}
