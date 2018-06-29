using System;

namespace projecteuler
{
  public class problem_3
  {
    public static void Main(string[] args)
    {
      int num = 600851475143;
      for (int i = num - 1; i > 0; i--)
      {
        if (isPrime(i) && num % i == 0)
          Console.WriteLine(i);
      }
    }

    public static boolean isPrime(int n)
    {
      if (n == 1)
        return false;
      else if (n == 2)
        return true;
      else
      {
        for (int i = n; i >= Math.sqrt(n); i--)
        {
          if (n % i == 0)
            return false;
        }
        return true;
      }
    }
  }
}
