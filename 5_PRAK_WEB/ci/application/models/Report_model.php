<?php defined('BASEPATH') OR exit('No direct script access allowed');

class report_model extends CI_Model
{
    private $_table = "report";

    public $hotel_id;
    public $description;
    public $created_at;

    public function rules()
    {
        return [
            ['field' => 'hotel_id',
            'label' => 'Name',
            'rules' => 'required'],

            ['field' => 'description',
            'label' => 'Keterangan',
            'rules' => 'required'],
        ];
    }

    public function getAll()
    {
        $this->db->order_by('created_at', 'DESC');
        $this->db->join('hotel', 'hotel.id_hotel = report.hotel_id');
        return $this->db->get($this->_table)->result();
    }

    public function getById($id)
    {
        return $this->db->get_where($this->_table, ["id" => $id])->row();
    }

    public function save()
    {
        $post = $this->input->post();
        $this->hotel_id = $post["hotel_id"];
        $this->description = $post["description"];
        $this->created_at = date("Y-m-d H:i:s");

        return $this->db->insert($this->_table, $this);
    }

    public function update()
    {
        $post = $this->input->post();
        $this->hotel_id = $post["hotel_id"];
        $this->description = $post["description"];
        $this->status = $post['status'];
        $this->created_at = $post['created_at'];

        return $this->db->update($this->_table, $this, array('id' => $post['id']));
    }

    public function delete($id)
    {
        return $this->db->delete($this->_table, array("id" => $id));
    }
}
