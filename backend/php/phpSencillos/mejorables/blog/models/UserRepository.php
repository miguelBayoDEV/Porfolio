<?php

class UserRepository 
{
	public static function checkLogin($user,$password){
		$db=Conectar::conexion();
		$result= $db->query("SELECT * FROM usuarios WHERE username = '".$user."' AND password='".$password."'");
		if($row=$result->fetch_assoc())	{	
			return new UserModel($row);			
		}else {
			return FALSE;
		}
	}

	// Listar usuarios.
	public static function getUsers(){
		$db=Conectar::conexion();
		$users= array();
		$result= $db->query("SELECT * FROM usuarios");
		while($row=$result->fetch_assoc()){
			$users[]=new UserModel($row);
		}
		return $users;
	}
}
?>