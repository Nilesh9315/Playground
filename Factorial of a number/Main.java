import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
      Scanner in = new Scanner(System.in);
      // Type your code here
      int fact=1;
      int number  = in.nextInt();
	for(int i=1;i<=number;i++)
    {
      fact=fact*i;
    }
      System.out.println(fact);
	}
}