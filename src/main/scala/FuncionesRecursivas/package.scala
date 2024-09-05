package object FuncionesRecursivas {

  /**
   * Ejercicio 1.1.1
   * maximo comun divisor a partir del teorema fundamental de la aritmetica
   */
  def mcdTFA(ln:List[Int],lm:List[Int],primes:List[Int]): Int= {
    if (primes.isEmpty) 1
    else math.pow(primes.head,math.min(ln.head,lm.head)).toInt*mcdTFA(ln.tail,lm.tail,primes.tail)
  }

  /**
   * Ejercicio 1.1.2
   * maximo comun divisor a partir del teorema de Euclides con coeficientes de Bezout
   */

  def mcdEB(n: Int, m: Int): (Int, Int, Int) = {

    if (m == 0) (n, 1, 0)
    else {
      val (mcd, x, y) = mcdEB(m, n % m)
      (mcd, y, x - (n / m) * y)
    }
  }
  
  /**
   * Ejercicio 1.2
   * Números de fibonacci (fibonacciA y fibonacciI)
   */

  def fibonacciA(n: Int): Int = {

    if (n == 0) {
      0
    } else if (n == 1) {
      1
    } else {
      fibonacciA(n - 1) + fibonacciA(n - 2)
    }
  }

  def fibonacciI(n: Int): Int = {

    def fibI(ni: Int, a: Int, b: Int): Int = {

      println(a + b)

      if (ni == 0) {
        b - 1
      } else if (ni == 1){
        b
      } else {
        fibI(ni - 1, b, a + b)
      }
    }

    fibI(n, 0, 1)
  }
  
}

/**
 * //Otras implementaciones para mcdTFA y mcdEB
 def mcdTFA(ln: List[Int], lm: List[Int], primes: List[Int]): Int = {

     def pow(base: Int, exp: Int, carry: Int): Int = {
     
         if (exp == 0)
            carry
         else
            pow(base, exp - 1, base * carry)
         }
    
     def calcMin(num1: Int, num2: Int): Int = {
     
        if (num1 > num2) num2 else num1
     }
     
     def recorderPrims(carry: Int, ln: List[Int], lm: List[Int], primos: List[Int]): Int = {
     
        if (primos.isEmpty || ln.isEmpty || lm.isEmpty)
            carry
        else {
            recorderPrims(carry * pow(primos.head, calcMin(ln.head, lm.head), 1), ln.tail, lm.tail, primos.tail)
        }
     
     }
     
     recorderPrims(1, ln, lm, primes)
     
 }
 
 * /**
 * Ejercicio 1.1.2
 * maximo comun divisor a partir del teorema de Euclides con coeficientes de Bezout
 * */
 
 def mcdEB(n: Int, m: Int): (Int, Int,Int) = {
    if (m == 0) (n, 1, 0)
    else {val bezout=mcdEB(m,n % m)
    (bezout.head,
    bezout.tail.tail.head,
    bezout.tail.head - (bezout.tail.tail.head * (n / m)))
    }
 }

 * */

