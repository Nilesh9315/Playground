import java.util.Scanner;
class Main
{
 
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int ele[] = new int[n];
    int a=0;
    int max=0;
    for(int i = 0;i<n;i++)
    {
      ele[i] = in.nextInt();
    }
    
    
    if(ele[0]<=ele[1])
    {
      max = ele[0];
      a= 1;
    }
    else 
    {
      max = ele[1];
      a =0;
    }
      
  for(int i =2 ;i<n;i++)
  {
    if(max<=ele[i])
    {
      max=ele[i];
     a=i;
    }
   }
  
    System.out.println(a);
  }
  }
