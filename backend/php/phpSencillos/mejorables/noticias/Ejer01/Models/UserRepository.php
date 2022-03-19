<?php


    class UserRepository{

            
	public static function register($datos){
		$db = Conectar::conexion();
		$result=$db->query("INSERT INTO `user` (`user`, `pass`, `rol`, `email`) VALUES 
            ('".$datos['username']."', '".md5($datos['pass'])."', '0', '".$datos['correo']."');");
        Conectar::desconectar($db);		
	}

    } 
?>