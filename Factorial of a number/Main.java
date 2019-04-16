import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int fact = 1;
      for( int facto = 1; facto <= n;facto++)
      {
        fact = fact*facto;
      }
      System.out.println(fact);
	}
}