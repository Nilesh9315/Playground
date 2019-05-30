import java.util.Scanner;
class Main
 
{
  public static int square(int m)
  {
    int squa = m*m;
    return squa;
  }
	public static void main (String[] args)
    {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int a = square(n);
      System.out.println(a);
	} 
}