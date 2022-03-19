<?php

class repositorio {
    public static function getArticulosInPage($p){
        $db=Conectar::conexion();
        $start=($p*3)-3;
        if($result=$db->query('SELECT * FROM articulos LIMIT '.$start.', 3'))
        //fetch while------

        return $articulos;
    }

}

?>