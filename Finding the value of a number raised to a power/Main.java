import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
Scanner in = new Scanner(System.in);
      int base = in.nextInt();
      int expo = in.nextInt();
      int i =0;
      int ans =1;
      while(i<expo)
      {
        ans = base*ans;
        i++;
      }
      System.out.print(ans);
      
    
    }
}