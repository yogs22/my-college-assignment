<?php defined('BASEPATH') OR exit('No direct script access allowed');

class Hotel_model extends CI_Model
{
    private $_table = "hotel";

    public $name;
    public $address;

    public function rules()
    {
        return [
            ['field' => 'name',
            'label' => 'Nama',
            'rules' => 'required'],

            ['field' => 'address',
            'label' => 'Alamat',
            'rules' => 'required'],
        ];
    }

    public function getAll()
    {
        $this->db->order_by('name', 'DESC');
        return $this->db->get($this->_table)->result();
    }

    public function getById($id)
    {
        return $this->db->get_where($this->_table, ["id_hotel" => $id])->row();
    }

    public function save()
    {
        $post = $this->input->post();
        $this->name = $post["name"];
        $this->address = $post["address"];
        return $this->db->insert($this->_table, $this);
    }

    public function update()
    {
        $post = $this->input->post();
        $this->name = $post["name"];
        $this->address = $post["address"];
        return $this->db->update($this->_table, $this, array('id_hotel' => $post['id']));
    }

    public function delete($id)
    {
        return $this->db->delete($this->_table, array("id_hotel" => $id));
    }
}
