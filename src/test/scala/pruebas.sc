//Importando funciones
import FuncionesRecursivas.{mcdTFA,mcdEB}

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
