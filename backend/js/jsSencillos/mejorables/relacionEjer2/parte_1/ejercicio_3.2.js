// Suma +
var var1 = 10, var2 = "Buenos", var3 = "días", var4 = 31;
document.write(var1 + var4); // El resultado mostrado es 41
console.log(var1 + var4);
document.write(var2 + var3); // El resultado mostrado es Buenosdías
console.log(var2 + var3);
document.write(var1 + var3); // El resultado mostrado es 10días
console.log(var1 + var3);

// Resta -
var num1 = 10, num2 = 8, res = 0;
res = num1 - num2; // res contiene 2
console.log(res);
res = -res; // ahora res contiene -2
console.log(res);

// Producto * y cociente /
var op1 = 50, op2= 4, div, mul;
div = op1 / op2; // div contiene 12.5
console.log(div);
mul = op1 * op2; // mul contendrá 200
console.log(mul);

// Resto %
var op1 = 50, op2= 4, resto;
resto = op1 % op2; //resto contendrá 2
console.log(resto);

// Incremento ++ decremento --
var op1=5, op2 = 5, res;
res = ++op1; // res toma el valor 6 y luego op1 el 6
console.log(res);
console.log(op1);
res = --op1; // res toma el valor 5 y luego op1 el 5
console.log(res);
console.log(op1);
res = op2++; // res toma el valor 5 y luego op2 el 6
console.log(res);
console.log(op2);
res = op2--; // res toma el valor 6 y luego op2 el 5
console.log(res);
console.log(op2);