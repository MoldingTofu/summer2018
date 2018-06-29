public class ulam {
  //https://en.wikipedia.org/wiki/Ulam_spiral

  public static void main(String[] args) {
    //should choose odd primes for 1 to be in middle
    int[][] row = spiral(66, 11);
    viewUlam(row, false);

  }

  //views spiral with or without non-primes
  public static void viewUlam(int[][] row, boolean check) {
    for (int i = 0; i < row.length; i++) {
      for (int j = 0; j < row.length; j++) {
        if (check | isPrime(row[i][j])) {
          System.out.print(row[i][j] + "\t");
        } else {
          System.out.print(" " + "\t");
        }
      }
      System.out.print("\n");
    }
  }

  //check if number is prime
  public static boolean isPrime(int num) {
    if(num == 1) {
      return false;
    } else if (num == 2) {
      return true;
    } else {
      for(int i = num - 1; i >= Math.sqrt(num); i--) {
        if(num % i == 0) {
          return false;
        }
      }
      return true;
    }
  }

  //creates spiral array
  //start - what number middle of spiral starts with
  //size - size of spiral, should be odd square
  public static int[][] spiral(int start, int size) {
    int[][] row = new int[size][size];
    int i = start - 1 + size * size;
    int min = 0;
    int max = size - 1;

    while(i >= start){
      for(int j = max; j >= min; j--) {
        row[max][j] = i;
        i--;
      }
      for(int j = max - 1; j >= min; j--) {
        row[j][min] = i;
        i--;
      }
      for(int j = min + 1; j <= max; j++) {
        row[min][j] = i;
        i--;
      }
      for(int j = min + 1; j < max; j++) {
        row[j][max] = i;
        i--;
      }

      min++;
      max--;
    }

    return row;
  }
}
