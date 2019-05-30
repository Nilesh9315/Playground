import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
    String input = inp.readLine();
      String input2 = inp.readLine();
      String in [] = input.split(",");
       LinkedList <String> ans = new LinkedList<String>();
      for(int i=0;i<in.length;i++)
      {
        ans.add(in[i]);
      }
      System.out.println(ans);
      boolean n= ans.isEmpty();
            System.out.println("Size of the linked list: "+ans.size());
           System.out.println("Is LinkedList empty? "+n); 
                  System.out.println("Does LinkedList contains " +input2+"?");

                      System.out.println(ans.contains(input2));


    }
}