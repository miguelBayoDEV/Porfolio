var id;
function start() {
    let cronometro = document.getElementById("cronometro").firstChild.nodeValue;
    let trocear = cronometro.split(":");
    if(Number(trocear[2] < 59)) {
        Number(trocear[2]++);
    }else {
        if(Number(trocear[2] >= 59)) {
            Number(trocear[2] = 0);
            if(Number(trocear[1] < 59)) {
                Number(trocear[1]++);
            }else {
                if(Number(trocear[1] >= 59)) {
                    Number(trocear[1] = 0);
                    Number(trocear[0]++);  
                }
            }  
        }
            
    }
    console.log(trocear[0])
    console.log(trocear[1])
    console.log(trocear[2])
    document.getElementById("cronometro").firstChild.nodeValue = trocear[0]+":"+trocear[1]+":"+trocear[2];
}

function reset() {
    let reset = "00:00:00";
    document.getElementById("cronometro").firstChild.nodeValue = reset;
}

function cronometroStart() {
    if(document.getElementById("start").firstChild.nodeValue == "Start") {
        clearInterval(id);
        id = setInterval(start, 1000);
    }
}

function cronometroStop() {
    if(document.getElementById("stop").firstChild.nodeValue = "Stop") {
        clearInterval(id);
    }
}

function cronometroReset() {
    if(document.getElementById("reset").firstChild.nodeValue = "Reset") {
        clearInterval(id);
        reset();
    }
}