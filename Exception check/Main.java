import java.util.Scanner;
import java.util.InputMismatchException;
public class Main
{
   public static void main(String args[])
   {
Scanner sc = new Scanner(System.in);
   int a=0;
   boolean b = true;
     try{
     a =sc.nextInt();
       
     }
     catch(Exception e)
     {
       
       System.out.print("Input Mismatch Exception occurred");
       b = false;
     }
     
     if(b ==true)
     {
       System.out.println(a);
     }

     }
   }
