<?php

class NewsRepository{

    public static function getNews(){
        $db=Conectar::conexion();
        if($result=$db->query("SELECT * FROM news WHERE visible=1"))
            while ($row=$result->fetch_assoc())
                $news[]=new News($row);
        return $news;
    } 
    public static function addNews($datos){
        $db=Conectar::conexion();
        if($result=$db->query("INSERT INTO news VALUES (NULL, '".$datos['title']."', '".$datos['url']."', '".$_SESSION['user']->getName()."', 1)"))
            return true;
        else return false;
    }
    public static function hideNews($id){
        $db=Conectar::conexion();
        if($result=$db->query("UPDATE news SET visible=0 WHERE id=".$id)){
            return true;
        } else return false;
    }
}

?>