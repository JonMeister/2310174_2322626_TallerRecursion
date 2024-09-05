//Importando funciones
import FuncionesRecursivas.{mcdTFA,mcdEB,fibonacciA,fibonacciI}

//1. Máximo común divisor utilizando el Teorema Fundamental de la Aritmética.
/*
* MCD(120,500)
* 120=2^3*3^1*5^1
* 500=2^2*3^0*5^3
* */
mcdTFA(List(3,1,1),List(2,0,3),List(2,3,5))

/*
* MCD(2,2)
* 2=2^1
* 2=2^1
* */
mcdTFA(List(1),List(1),List(2))

/*
* MCD(105875,94325)
* 105875=5^3+7^1*11^2
* 94325=5^2*7^3*11^1
* */
mcdTFA(List(3,1,2),List(2,3,1),List(5,7,11))

/*
* MCD(7,11)
* 7=7^1*11^0
* 11=7^0*11^1
* */
mcdTFA(List(1,0),List(0,1),List(7,11))

/*
* MCD(360,540)
* 360=2^3*3^2*5^1
* 540=2^2*3^3*5^1
* */
mcdTFA(List(3,2,1),List(2,3,1),List(2,3,5))

//2. Máximo común divisor utilizando el algoritmo de la división.

/*
* MCD(963,657)
* */
mcdEB(963,657)

/*
* MCD(500,120)
* */
mcdEB(500,120)

/*
* MCD(86,86)
* */
mcdEB(86,86)

/*
* MCD(1,1)
* */
mcdEB(1,1)

/*
* MCD(307,103)
* */
mcdEB(307,103)

// Algoritmos de sucesión de Fibonacci

/*
* Sea F(n), la función que calcula el número de fibonacci en la posición n, entonces, para
visualizar un poco mejor el panorama de las pruebas, se define una lista con los los primeros
20 valores de la sucesión de fibonacci.

ListFibonacci = List(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597,
2584, 4181, 6765)
* */

/*
* Aquí habrán unas iniciales dos llamadas a la función fibonacciA con el fin de probar el caso base del
algoritmo

* */

fibonacciA(0) // Debe retornar 0
fibonacciA(1) // Debe retornar 1


// Aquí algunas pruebas del algoritmo fibonacciA para valores aleatorios

fibonacciA(2) // Debe retornar 1
fibonacciA(3) // Debe retornar 2
fibonacciA(4) // Debe retornar 3
fibonacciA(5) // Debe retornar 5
fibonacciA(6) // Debe retornar 8
fibonacciA(7) // Debe retornar 13
fibonacciA(8) // Debe retornar 21
fibonacciA(9) // Debe retornar 34
fibonacciA(10) // Debe retornar 55
fibonacciA(11) // Debe retornar 89

/** Sin embargo, dado que no esta definido fibonacci de un número negativo, es decir F(n),
 * donde n < 0 no esta definido.
 * Esto anterior, se asume, dado que el algoritmo no esta construido para evaluar el error de que
 * n < 0, es por esto que, si se evaluase fibonacciA(n) con n < 0, la respuesta muy probablemente
 * genere una recursión infinita o de algún valor arbitrario.
**/

/** Para el algoritmo fibonacciI se realizarán exactamente las mismas pruebas, con el fin de
 * probar los casos base y algunos casos altearios
**/

fibonacciI(0) // Debe retornar 0
fibonacciI(1) // Debe retornar 1


// Aquí algunas pruebas del algoritmo fibonacciA para valores aleatorios

fibonacciI(2) // Debe retornar 1
fibonacciI(3) // Debe retornar 2
fibonacciI(4) // Debe retornar 3
fibonacciI(5) // Debe retornar 5
fibonacciI(6) // Debe retornar 8
fibonacciI(7) // Debe retornar 13
fibonacciI(8) // Debe retornar 21
fibonacciI(9) // Debe retornar 34
fibonacciI(10) // Debe retornar 55
fibonacciI(11) // Debe retornar 89

//El siguiente algoritmo puede ser util para ver el resultado de una lista de varias entrada,
//para un algoritmo cualquiera, es decir, la función show recibe una lista de los valores de
//entrada que se quieren verificar como un algoritmo y el algoritmo mismo que se quiere evaluar,
//luego imprimira el resultado de haber evaluado la función para cada elemento de la lista.
/**
 def show(li : List[Int], f : Int => Int) : Int = {

    if(li.isEmpty){
        0
    }
    else{
        println(f(li.head))
        show(li.tail,f)
    }
 }
**/