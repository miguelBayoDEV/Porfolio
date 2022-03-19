let numeroAleatorio = Math.floor(Math.random() * 100) + 1;
let numeroPedido = 0;
var seguir = true;

function adivideNumero() {
    console.log(numeroAleatorio)
    
        console.log(numeroAleatorio)
        try {
            console.log(document.getElementById("numero").value)
            numeroPedido = parseInt(document.getElementById("numero").value);
            
            console.log("a")
            if(Number.isNaN(numeroPedido)) {
                console.log("a1")
                throw new Exception();
            }else if(Number(numeroPedido < 1)) {
                console.log("a2")
                document.getElementById("result").innerHTML = "Número introducido es menor 1.<br/>";
            }else if(Number(numeroPedido > 100)) {
                console.log("a3")
                document.getElementById("result").innerHTML = "Número introducido es mayor 100.<br/>";
            }else {
                console.log("a4")
                if(Number(numeroPedido < numeroAleatorio)) {
                    document.getElementById("result").innerHTML = "Número introducido es menor número adivinado: " + numeroPedido +  "<br/>";
                    console.log("a5")
                }else if(Number(numeroPedido > numeroAleatorio)) {
                    document.getElementById("result").innerHTML = "Número introducido es mayor número adivinado: " + numeroPedido +  "<br/>";
                    console.log("a6")
                }
            }

            
            if(numeroAleatorio == numeroPedido) {
                seguir = false;
                confirm("Número introducido " + numeroPedido + " es igual a número generado: " + numeroAleatorio);
                document.getElementById("result").innerHTML = "Número adivinado.";
            }
        } catch (error) {
            if(Number.isNaN(numeroPedido)) {
                document.getElementById("result").innerHTML = "No es un número.<br/>";
            }
        }
    
}
