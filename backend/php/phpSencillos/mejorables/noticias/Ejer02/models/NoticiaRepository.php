<?php
class NoticiaRepository{

    public static function getNews(){
        $db=Conectar::conexion();
        $news=array();
        if($result=$db->query("SELECT * FROM noticias WHERE visible=1"))
            while ($row=$result->fetch_assoc()) {
                $news[]= new NoticiaModel($row);
            }
        return $news;
    }

    public static function hideNews($id_new){
        $db=Conectar::conexion();
        if($result=$db->query("UPDATE noticias SET visible=0 WHERE id=".$id_new)){
            return true;
        } else {
        	return false;
        }
    }
}
?>