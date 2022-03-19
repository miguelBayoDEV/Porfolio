const lienzo=document.getElementById("lienzo");
const ctx=lienzo.getContext("2d");

const w = lienzo.width = 800;
const h = lienzo.height = 500;


function Bola(x,y,radio,color,velx,vely) {
    this.x = x;
    this.y = y;
    this.radio = radio;
    this.color = color;
    this.velx = velx;
    this.vely = vely;
}

Bola.prototype.dibujar = function() {
    ctx.beginPath();
    ctx.fillStyle=this.color;
    ctx.arc(this.x,this.y,this.radio,0,2*Math.PI);
    ctx.fill();
    ctx.closePath();
}

Bola.prototype.mover = function() {
    if(this.x + this.radio >= w) {
        this.velx=-this.velx;
    } else if(this.x - this.radio <= 0) {
        this.velx=-this.velx;
    } else if(this.y + this.radio >= h) {
        this.vely=-this.vely;
    } else if( this.y - this.radio <= 0) {
        this.vely=-this.vely;
    } 

    this.x += this.velx;
    this.y += this.vely;
}

var bolas = [];
for(i=0;i<30;i++) {
    var radio = 10 + Math.floor(Math.random() * 11);
    //var x = 300 + Math.floor(Math.random() * w-300);
    //var y = 300 + Math.floor(Math.random() * h-300);
    var x = w/2;
    var y = h/2;
    var velx = -10 + (Math.random() * 21);
    var vely = -10 + (Math.random() * 21);
    bolas.push(new Bola(x,y,radio,"red",velx,vely));
}

console.log(bolas);

function BucleDeAnimación() { 
    ctx.clearRect(0,0,w+100,h+100);
    for(i=0;i<bolas.length;i++) {
        bolas[i].dibujar();
        bolas[i].mover();
    }
    window.requestAnimationFrame(BucleDeAnimación);
}

BucleDeAnimación();