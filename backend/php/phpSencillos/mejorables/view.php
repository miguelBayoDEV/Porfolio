<?php

//bloque foreach
foreach($articulos as $articulo){
    $articulo->getName();
}

//estoy en la primera pagina?
if($npagina>1) {
    echo '<a href="https://educacionadistancia.juntadeandalucia.es/centros/granada/pluginfile.php/364687/mod_assign/introattachment/0/index.php?pagina=1"><<</a>';
    echo '<a href="https://educacionadistancia.juntadeandalucia.es/centros/granada/pluginfile.php/364687/mod_assign/introattachment/0/index.php?pagina='.($npagina-1).'">'.($npagina-1).'</a>';
}
echo "--";
//estoy en la última página?
if($npagina<$totalPaginas){
    echo '<a href="https://educacionadistancia.juntadeandalucia.es/centros/granada/pluginfile.php/364687/mod_assign/introattachment/0/index.php?pagina='.($npagina+1).'">'.($npagina+1).'</a>';
    echo '<a href="https://educacionadistancia.juntadeandalucia.es/centros/granada/pluginfile.php/364687/mod_assign/introattachment/0/index.php?pagina='.$totalPaginas.'"> >> </a>';
}

?>