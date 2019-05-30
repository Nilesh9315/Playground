import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      int area, length,breadth;
      Scanner in = new Scanner(System.in);
	
		length= in.nextInt();
       breadth = in.nextInt();
      area= length*breadth;
      System.out.println(area);
	}
}