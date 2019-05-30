import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
    int a =num1%100;
      int b = a/10;
      
      
      System.out.println(b);
	}
}