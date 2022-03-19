<?php

/**
 *  
 */
class UserRepository 
{
	public static function checkLogin($u,$p){
		$db=Conectar::conexion();
		$result= $db->query("SELECT * FROM usuarios WHERE username = '".$u."' AND password='".md5($p)."'");
		if($row=$result->fetch_assoc())		
			return new User($row);			
		else return FALSE;
	}
}
?>