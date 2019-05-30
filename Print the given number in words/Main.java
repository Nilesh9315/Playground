import java.util.Scanner;
class Main {
	public static void main (String[] args) {
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int i = in.nextInt();
      if(i==5)
        System.out.println("Five");
      else if(i==4)
        System.out.println("Four");
      else if(i==3)
        System.out.println("Three");
      else if(i==2)
        System.out.println("Two");
      else if(i==1)
        System.out.println("one");
      else
        System.out.println("Invalid");
}
}