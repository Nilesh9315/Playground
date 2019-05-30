import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner in = new Scanner(System.in);
      // Type your code here
      int sum = 0;
      int n = in.nextInt();
      for(int num =1; num<=n;num++)
      {
        
         sum = sum+num;
      }
        {
          System.out.println(sum);
      }
	}
}
