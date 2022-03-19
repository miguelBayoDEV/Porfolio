<?php
class ValorationsRepository {

    public static function getValorationsByNews($id){
        $db=Conectar::conexion();
        $vals=array();
        if($result=$db->query("SELECT val FROM valorations WHERE idNews=".$id))
           { while($row=$result->fetch_assoc())
               { $vals[]=new Val($row);}
           }
        return $vals;
    }

    
    public static function getNegativesByNews($id){
        $db=Conectar::conexion();
        if($result=$db->query("SELECT COUNT(val) as Negative FROM valorations WHERE val=-1 AND idNews=".$id))
           { $row=$result->fetch_assoc();
              return $row['Negative'];
           }
        return 0;
    }

    public static function getPositivesByNews($id){
        $db=Conectar::conexion();
        if($result=$db->query("SELECT COUNT(val) as Positive FROM valorations WHERE val=1 AND idNews=".$id))
           { $row=$result->fetch_assoc();
              return $row['Positive'];
           }
        return 0;
    }

    public static function valorarNews($id,$v){
        $db=Conectar::conexion();
        if($result=$db->query("INSERT INTO valorations VALUES ('".$id."', '".$_SESSION['user']->getName()."', ".$v.")"))
         return true;
        else return false;
    }
}

?>