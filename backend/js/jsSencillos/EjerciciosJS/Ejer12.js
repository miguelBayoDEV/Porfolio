function pedirNumeroImprimirDiaSemana() {
    var numeroDiaSemana = window.prompt("Introduzca un número entre 1-7:");
    var arrayDiaSemana = ["Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sábado", "Domingo"];
    var diaSemana = "";
    if(numeroDiaSemana < 1 || numeroDiaSemana > 7) {
        diaSemana = "ERROR, valor fuera de rango";
    }else {
        diaSemana = arrayDiaSemana[numeroDiaSemana-1];
    }
    document.write("Día de la semana: " + diaSemana + "<br/>");
}
pedirNumeroImprimirDiaSemana();