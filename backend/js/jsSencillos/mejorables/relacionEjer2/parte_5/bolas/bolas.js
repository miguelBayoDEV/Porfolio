// Lienzo
const lienzo = document.getElementById("lienzo");
const contexto = lienzo.getContext("2d");

// Propiedades de lienzo
const w = lienzo.width = 1800;
const h = lienzo.height = 900;

// Colores bolas
var color = ["red", "green", "blue", "yellow", "black", "white", "purple"];

// Función constructora
function Ball(x,y,radio,c,velx,vely) {
    this.x = x;
    this.y = y;
    this.radio = radio;
    this.color = color[c];
    this.velx = velx;
    this.vely = vely;
}

// Agregar método dibujar a clase Bola con prototype
Ball.prototype.draw = function() {
    contexto.beginPath();
    contexto.fillStyle=this.color;
    contexto.arc(this.x,this.y,this.radio,0,2*Math.PI);
    contexto.fill();
    contexto.closePath();
};

// Agregar método mover a clase Bola con prototype
Ball.prototype.move = function() {
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
};

// Agregar método colisionar a clase Bola con prototype
Ball.prototype.colisionar = function() {
  for(var i = 0; i < balls.length; i++) {
    if(!(this === balls[i])) {
      const dx = this.x - balls[i].x;
      const dy = this.y - balls[i].y;
      const distance = Math.sqrt(dx * dx + dy * dy);

      if (distance < this.radio + balls[i].radio) {
      	var c = Math.floor(Math.random() * (6-0)) + 0;
        balls[i].color = this.color = color[c];
      }
    }
  }
};

// Array objetos bolas
var balls = [];

// Crear bolas
for(var i=0; i<30; i++) {
	// Tamaño de bolas
	var radio = 10 + Math.floor(Math.random() * 21);

	// Posición aleatoria
	var x = w/2;
    var y = h/2;

    // Velocidades por coordenadas
    var velx = -7 + (Math.random() * 7);
    var vely = -7 + (Math.random() * 7);

	// Color aleatorio
	var c = Math.floor(Math.random() * (6-0)) + 0;

	// Guardar objeto bola
	balls.push(new Ball(x, y, radio, c, velx, vely));
}

// Mostrar array bolas por consola
console.log(balls);

// Método de animación de bolas dentro del lienzo
function BucleAnimationBalls() { 
    contexto.clearRect(0, 0, w+100, h+100);
    for(var i = 0; i < balls.length; i++) {
        balls[i].draw();
        balls[i].move();
        balls[i].colisionar();
    }
    window.requestAnimationFrame(BucleAnimationBalls);
}

// Realizar el bucle de clear bolas con velociadades
BucleAnimationBalls();