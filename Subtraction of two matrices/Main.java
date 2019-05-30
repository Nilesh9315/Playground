import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    Scanner in = new Scanner(System.in);
int row1 = in.nextInt();
    int col1 = in.nextInt();
    int sum[][]= new int[row1][col1];
    
    int a[][]=new int[row1][col1];
    for(int i =0;i<row1;i++)
    {
      for(int j =0;j<col1;j++)
      {
        a[i][j]=in.nextInt();
      }
      
    }
    int b[][] = new int[row1][col1];
    
    for(int i =0;i<row1;i++)
    {
      for(int j =0;j<col1;j++)
      {
 b[i][j] = in.nextInt();
      }
    }
     for(int i =0;i<row1;i++)
    {
      for(int j =0;j<col1;j++)
      {
    sum[i][j]=a[i][j]-b[i][j];
      }
    }
    for(int i =0;i<row1;i++)
    {
      for(int j =0;j<col1;j++)
      {
      System.out.print(sum[i][j]+" ");
      }
            System.out.println();

    }  }
}