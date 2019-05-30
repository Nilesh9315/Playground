import java.util.Scanner;
class Main{
    public static void main(String args[]){
  Scanner in = new Scanner(System.in);
      String str1 = in.nextLine();
      int len = str1.length();
      int b[] = new int[26];
      for(int ind =0;ind<26;ind++)
      {
        b[ind]=0;
      }
      for(int i =0;i<len;i++)
      {
        if(str1.charAt(i)>='a'&&str1.charAt(i)<='z')
      {
        char a = str1.charAt(i);
        int offset = a-'a'; 
        b[offset]++;
        }
       else if(str1.charAt(i)>='A'&&str1.charAt(i)<='Z')
       {
         char a = str1.charAt(i);
         int offset = a-'A';
         b[offset]++;
       }
      }
      for(int idx = 0;idx<26;idx++)
      {
        if(b[idx]==0)
        {
          char ans = (char)('a'+idx);
                    System.out.print(ans+" ");


        }
        
      }
    
    
    }
}
