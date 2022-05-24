/* 
Definicion

Un array es un conjunto de datos que se pueden almaacenar en una sola variable.

Cuando tenemos una variabale, la usamos para guardar un dato. 
Cuando tenemos un 


*/

let variabale = 1; //Es una variable con un solo valor

let array = [1,2,3,4,5];//ES un array con varios valores

/*
*Formas de crear un array o arreglo

1.- Utilizando la palabra reservada "new y el metodo "Array"

*/

var arcoiris = new array();

//Declaramos un nombre para nuestro arreglo (arcoiris)
//y le asignamos el metodo "Array" usando la palabra reservada
"new"

var arcoiris = new array(7);

var arcoiris =  new Array("rojo", "verde", "azul", "amarillo", "violeta", "naranja", "rosa"); //Declarammos un arreglo con 7 posiciones

/*
? Segunda forma de crear un arreglo
*/

var arcoiris = ["rojo", "verde", "azul", "amarillo", "violeta", "naranja", "rosa"]; //Declaramos un arreglo con 7 posiciones

var arcoiris = []; //Declaramos un arreglo vacio

//EJEMPLLOS DE ARREGLOS

var listaSuper = new Array();
var listaSuper = [];

var diasSemana = new Array ("Lunes", "Martes", "Miercoles", "Jueves",  "Viernes", "Sabado", "Domingo"); //Primera Forma

var diasSemana = ["Lunes", "Martes", "Miercoles", "Jueves",  "Viernes", "Sabado", "Domingo"];//Segunda Forma

// ¿Investigas si podemos hacer arreglos con otro tipo de datos

/*
*Acceder a elementos de un array

Antes de hablar de elementos de un array, es importante definir 2 conceptos:

-Cantidad de elementos
-Indice de esos Elementos (posiciones del elemento)


*/

var diasSemana = ["Lunes", "Martes", "Miercoles" , "Jueves", "Viernes", "Sabado", "Domingo"];

//Elementos: 7 elementos
//Indices (posiciones): 0,1,2,3,4,5,6

// 0 = Lunes
// 1 = Martes
// 2 = Miercoles
// 3 = Jueves
// 4 = Viernes
// 5 = Sabado
// 6 = Biónica


// ¿Acceder a un elemento de un array

//Sintaxis general para imprimir un elemento de un Array

//console.log(nombreDelArreglo[valorDelIndice]);

console.log(diasSemana[4]); //Imprime el elemento de la posicion 0

console.log(diasSemana[0]); //Imprime el elemento de la posicion 0

console.log(diasSemana[9]); //Imprime el elemento de la posicion 0

