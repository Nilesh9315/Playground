import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      String str;
      str = sc.nextLine();
      StringBuilder sb = new StringBuilder(str);
            StringBuilder temp= new StringBuilder("");
int len = str.length();
      
for(int i =len-1;i>=0;i--)
{
  char a = sb.charAt(i);
  temp.append(a);

}


  if(sb.toString().equals(temp.toString()))
  {
  
    System.out.print("Yes");
    
  }
      else 
      {
            System.out.print("No");
      }
      
}
    
    
    }
    
    
