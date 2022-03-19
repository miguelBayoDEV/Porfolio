// Mayor que >
var hoy = 4, ayer = 10, comp;
comp = hoy > ayer; // comp adquiere el valor false
console.log(comp);
var hoy = "mañana", ayer = "hoy", comp;
comp = hoy > ayer; // comp adquiere el valor true
console.log(comp);

// Menor que <
var hoy = 4, ayer = 10, comp;
comp = hoy < ayer; // comp adquiere el valor true
console.log(comp);
var hoy = "mañana", ayer = "hoy", comp;
comp = hoy < ayer; // comp adquiere el valor false
console.log(comp);

// Mayor o igual que >=
var hoy = 4, ayer = 4, comp;
comp = hoy >= ayer; // comp adquiere el valor true
console.log(comp);
var hoy = "mañana", ayer = "hoy", comp;
comp = hoy >= ayer; // comp adquiere el valor true
console.log(comp);

// Menor o igual que <=
var hoy = 4, ayer = 4, comp;
comp = hoy <= ayer; // comp adquiere el valor true
console.log(comp);
var hoy = "mañana", ayer = "hoy", comp;
comp = hoy <= ayer; // comp adquiere el valor false
console.log(comp);

// Iguales ==
var hoy = 4, ayer = 4, comp;
comp = hoy == ayer; // comp adquiere el valor true
console.log(comp);
var hoy = '32', ayer = 2, comp;
comp = hoy == ayer; // comp adquiere el valor false
console.log(comp);

// No iguales !=
var hoy = 4, ayer = 4, comp;
comp = hoy != ayer; // comp adquiere el valor false
console.log(comp);
var hoy = '32', ayer = 2, comp;
comp = hoy != ayer; // comp adquiere el valor true
console.log(comp);

// Idénticos ===
var hoy = 4, ayer = '4', comp;
comp = hoy == ayer; // comp adquiere el valor true
console.log(comp);
comp = hoy === ayer; // comp adquiere el valor false
console.log(comp);
var hoy = '32', ayer = 2, comp;
comp = hoy == ayer; // comp adquiere el valor false
console.log(comp);
comp = hoy === ayer; // comp adquiere el valor false
console.log(comp);

// No idénticos !==
var hoy = 4, ayer = '4', comp;
comp = hoy != ayer; // comp adquiere el valor false
console.log(comp);
comp = hoy !== ayer; // comp adquiere el valor true
console.log(comp);
var hoy = '32', ayer = 2, comp;
comp = hoy != ayer; // comp adquiere el valor true
console.log(comp);
comp = hoy !== ayer; // comp adquiere el valor true
console.log(comp);