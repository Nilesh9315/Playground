import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
    String input = inp.readLine();
      String input2[] = input.split(",");

      Set s = new LinkedHashSet();
      for(int i =0;i<input2.length;i++)
      {
        s.add(input2[i]);
      }
        System.out.print(s);
    }
}