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
    int ans[][] = new int[col1][row1];
    for(int i =0;i<row1;i++)
    {
      for(int j =0;j<col1;j++)
      {
        ans[j][i] = a[i][j];
        
      }
      
    }
    for(int i =0;i<col1;i++)
    {
      for(int j =0;j<row1;j++)
      {
        System.out.print(ans[i][j]+" ");
      }
                    System.out.println();


      
    }
     
  }
}