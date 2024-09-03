package object FuncionesRecursivas {


  def mcdTFA(ln:List[Int],lm:List[Int],primes:List[Int]): Int= {
    if (primes.isEmpty) 1
    else math.pow(primes.head,math.min(ln.head,lm.head)).toInt*mcdTFA(ln.tail,lm.tail,primes.tail)
  }

  def mcdEB(n: Int, m: Int): (Int, Int,Int) = {
    if (m == 0) (n, 1, 0)
    else {val bezout=mcdEB(m,n % m)
          (bezout.head,
          bezout.tail.tail.head,
          bezout.tail.head - (bezout.tail.tail.head * (n / m)))
    }
  }

}
