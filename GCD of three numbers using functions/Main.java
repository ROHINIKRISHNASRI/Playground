import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    Scanner in = new Scanner(System.in);
      int n1= in.nextInt();
      int n2= in.nextInt();
      int n3= in.nextInt();
      int result = gcd_of_num(n1,n2);
      System.out.print(gcd_of_num(n1,n2));
    }
  public static int gcd_of_num(int num1,int num2)
  {
    int min_val , gcd = 0;
    if(num1 < num2)
    {
      min_val = num1;
    }
    else
    {
      min_val = num2;
    }
    while(min_val >= 1)
    {
      if((num1%min_val ==0)&&(num2%min_val == 0))
         {
           gcd = min_val;
           break;
         }
         --min_val;
         }
    return gcd;                   
	}
}