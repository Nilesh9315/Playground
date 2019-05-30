import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner in = new Scanner(System.in);
      // Type your code here
      
      int n = in.nextInt();
      for(int num =1; num<=n;num++)
      {
        if(num%2==1)
        {
          System.out.println(num);
      }
	}
}
}