import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int row = in.nextInt();
    int col = in.nextInt();
    int arr[][]= new int[row][col];
    int match=0;
    for(int i =0;i<row;i++)
    {
      for(int j=0;j<col;j++)
      {
        arr[i][j]=in.nextInt();
      }
        
    }
    int arr2 [][]= new int[row][col];
    
 for(int i =0;i<row;i++)
    {
      for(int j=0;j<col;j++)
      {
        arr2[i][j]=in.nextInt();
      }
        
    }
    for(int i =0;i<row;i++)
    {
      for(int j=0;j<col;j++)
      {
        if(arr[i][j]==arr2[i][j])
        {
          match =1;
      }
        else
        {
          match=0;
        }
      }
        
    }
    if(match==1)
    {
      System.out.print("Yes");
    }
    else
    {
      System.out.print("No");
    }
    
  
  }
}