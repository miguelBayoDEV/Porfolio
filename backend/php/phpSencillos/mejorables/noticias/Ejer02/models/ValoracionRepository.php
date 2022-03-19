<?php
class ValoracionRepository {

    public static function getValorationsByNews($id_new){
        $db=Conectar::conexion();
        $vals=array();
        if($result=$db->query("SELECT valoracion FROM valoracion WHERE id_noticia=".$id_new)) { 
        	while($row=$result->fetch_assoc()) {
               	$vals[]= new ValoracionModel($row);
            }
        }
        return $vals;
    }

    
    public static function getNegativesByNews($id_new){
        $db=Conectar::conexion();
        if($result=$db->query("SELECT COUNT(valoracion) as Negative FROM valoracion WHERE valoracion=-1 AND id_noticia=".$id_new)) {
        	$row=$result->fetch_assoc();
            return $row['Negative'];
           }
        return 0;
    }

    public static function getPositivesByNews($id_new){
        $db=Conectar::conexion();
        if($result=$db->query("SELECT COUNT(valoracion) as Positive FROM valoracion WHERE valoracion=1 AND id_noticia=".$id_new))
           { 
           	$row=$result->fetch_assoc();
            return $row['Positive'];
           }
        return 0;
    }

    public static function valorarNews($id_new,$val){
        $db=Conectar::conexion();
        if($result=$db->query("INSERT INTO valoracion VALUES ('".$id_new."', '".$_SESSION['user']->username."', ".$val.")")) {

         return true;
        } else {
        	return false;
        }
    }
}
?>