import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
           Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int b =n;
      int arr[] = new int[n];
      for(int index =0;index<n;index++)
      {
        arr[index]=in.nextInt();
      }
    int i =0;
      for(int j=n-1;j>=0;j--)
      {
        if((i!=n)&&(arr[i]==arr[j]))
        {
          i++;
          b--;

        }
      }
      if(b==0)
      {
        System.out.print("Yes");
      }
      else
      {        System.out.print("No");

      }
        
        
        
    }
}