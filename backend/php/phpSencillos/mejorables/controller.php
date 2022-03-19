<?php

$articulosPorPagina=3;
if(isset($_GET['pagina'])){
    $npagina=$_GET['pagina'];
}else $npagina=1;

$articulos=repositorio::getArticulosInPage($npagina);

$totalpaginas=count($articulos)/$articulosPorPagina;

require_once("view.php");


?>