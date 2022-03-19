<?php

class ErrorHandler{

	public static function addError($type, $error){
		$_SESSION['error'][$type]=$error;
	}

	public static function existErrors(){
		
		return isset($_SESSION['error']);
	}

	public static function getErrors(){
		return $_SESSION['error'];
	}

	public static function deleteErrors(){
		unset($_SESSION['error']);
	}
}

?>