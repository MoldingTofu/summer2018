using System;

namespace projecteuler
{
  public class problem_2
  {
    public static void Main(string[] args)
    {
      int n = 2;
      int sum = 0;
      while (fibonacci(n) < 4000000)
      {
        if (fibonacci(n) % 2 == 0)
          sum += fibonacci(n);
        n++;
      }

      Console.WriteLine(sum);
    }

    public static int fibonacci(int index)
    {
      if (index <= 1)
      {
        return index;
      }
      else
      {
        return fibonacci(index - 1) + fibonacci(index - 2);
      }
    }
  }
}
