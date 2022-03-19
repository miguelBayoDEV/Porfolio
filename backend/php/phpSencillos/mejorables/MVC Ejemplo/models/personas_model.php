<?php
class personas_model{
    private $db;
    private $personas;
 
    public function __construct(){
        $this->db=Conectar::conexion();
        $this->personas=array();
    }
    public function get_personas(){
        $result=$this->db->query("select * from productos;");
        while($row=$result->fetch_assoc()){
            $this->personas[]=$row;
        }
        return $this->personas;
    }
}
?>