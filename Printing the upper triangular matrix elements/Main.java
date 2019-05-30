import java.util.*;
class Main
{
  public static void main(String args[])
  {
Scanner in = new Scanner(System.in);
    int a=0;
    int b=0;
    int row= in.nextInt();
    int col = in.nextInt();
    int arr[][] = new int[row][col];
    
    for(int i=0;i<row;i++)
    {
      for(int j =0;j<col;j++)
      {
        arr[i][j]=in.nextInt();
    }
    }
    for(int k =0;k<col;k++)
    {
    for(a=0,b=k;b<col;a++,b++)
    {
      System.out.print(arr[a][b]+" ");
    }
    }
  }
}