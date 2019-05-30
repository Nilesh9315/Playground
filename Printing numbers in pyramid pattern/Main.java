import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
      int n = in .nextInt();
      int sum=0;
      for(int row = 1;row<=n;row++)
      {
        for(int space = 1;space<=n-row;space++)
        {
          System.out.print(" ");
        }
	for(int col = 1; col<=row;col++ )
    {
      sum = sum+1;
      System.out.print(sum+" ");
    }
        System.out.println();
      }
      }
}