public class ulam {
  public static void main(String[] args) {
    int[][] row = spiral(5);

    for(int i = 0; i < row.length; i++) {
      for(int j = 0; j < row.length; j++) {
        System.out.print(row[i][j] + "\t");
      }
      System.out.print("\n");
    }
  }

  public static int[][] spiral(int input) {
    int[][] row = new int[input][input];
    int i = 1;
    int min = 0;
    int max = input - 1;

    while(true){
      for(int j = min; j <= max; j++) {
        row[min][j] = i;
        i++;
      }
      for(int j = min + 1; j <= max; j++)   {
        row[j][max] = i;
        i++;
      }
      for(int j = max - 1; j >= min; j--) {
        row[max][j] = i;
        i++;
      }
      for(int j = max - 1; j > min; j--){
        row[j][min] = i;
        i++;
      }
      min++;
      max--;
      if(i > input * input) {
        break;
      }
    }

    return row;
  }
}
