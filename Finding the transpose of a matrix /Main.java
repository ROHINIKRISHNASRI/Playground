import java.util.Scanner;
class Main{
  public static void main(String args[]){
    // Type your code here
    Scanner in = new Scanner(System.in);
    int r = in.nextInt();
    int c = in.nextInt();
    int m[][] = new int[r][c];
    for(int i = 0;i< r;i++)
    {
      for(int j = 0;j< c;j++){
        m[i][j] = in.nextInt();
      }
    }
    int t[][] = new int[c][r];
    for(int i = 0;i<= r-1;i++)
    {
      for(int j = 0;j <= c-1;j++)
      {
        t[j][i] = m[i][j];
      }
    }
    for(int i =0;i<= c-1;i++)
    {
      for(int j= 0;j<= r-1;j++)
      {
        System.out.print(t[i][j] + " ");
      }
      System.out.println();
    }
                       
  }
}