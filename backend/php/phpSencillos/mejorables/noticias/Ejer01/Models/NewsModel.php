<?php

class News {
    private $title;
    private $url;
    private $positives;
    private $negatives;
    private $id;

    public function __construct($datos){
        $this->id=$datos['id'];
        $this->title=$datos['title'];
        $this->url=$datos['url'];
        $this->positives=ValorationsRepository::getPositivesByNews($datos['id']);
    
        $this->negatives=ValorationsRepository::getNegativesByNews($datos['id']);
    }

    public function __get($a){
        if(property_exists($this, $a))
            return $this->$a;
    }

    public function __toString(){
        return '<a href="'.$this->url.'">'.$this->title.'</a>';
    }

    public function getPositives(){

    }


}
?>