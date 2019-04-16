import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int arr_size = in.nextInt();
      int arr[] = new int[arr_size];
      for(int i = 0;i <= (arr_size - 1);i++)
      {
        arr[i] = in.nextInt();
      }
      int search_ele_1=in.nextInt();
      int search_ele_2 = in.nextInt();
      int ele_1_idx = -1;
      int ele_2_idx = -1;
      for(int i = 0 ; i <= arr_size -1;i++)
      {
        if(search_ele_1 == arr[i])
        {
          ele_1_idx = i;
        }
        if(search_ele_2 == arr[i])
        {
          ele_2_idx =i;
        }
      }
      System.out.println(ele_1_idx);
      System.out.println(ele_2_idx);
    
          
    }
}