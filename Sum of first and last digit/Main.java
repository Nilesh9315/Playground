import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
   Scanner in = new Scanner(System.in);
   
    int n = in.nextInt();

int a=n;
    
       while(a>=10)
{
     a = a/10;
 }


        
        int b = n%10;
     
          int sum = a+b;
      
System.out.println(sum);






     	}


}