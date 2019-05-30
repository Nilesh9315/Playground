import java.util.Scanner;
class Main{
public static void partition(int n , int arr[])
{ 
  int index=0;
 for(int i = 0;i<n;i++)
 {
   if(arr[i]>0)
   {
     arr[index]=arr[i];
     index++;
   }
 }
  for(int i = index;i<n;i++ )
  {
   arr[index]=0;
    index++;
  }
  
 }
  

  

    public static void main(String args[]) {

    Scanner in = new Scanner(System.in);
      int n = in.nextInt();
            int arr[]= new int[n];
      for(int i =0;i<n;i++)
      {
        arr[i]=in.nextInt();
      }
partition(n,arr);
  for(int i =0;i<n;i++)
  {
    System.out.print(arr[i]+" ");
  }
    
    }
}