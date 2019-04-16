import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
	   Scanner in = new Scanner(System.in);
      int number = in.nextInt();
      int original_num = number;
      int result = 0;
      int remainder;
      while(original_num != 0)
      {
        remainder = original_num % 10;
        result = result + (remainder* remainder*remainder);
        original_num = original_num /10;
      }
      if(result == number)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
        
	}
}