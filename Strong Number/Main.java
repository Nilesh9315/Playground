import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
      Scanner in = new Scanner(System.in);
      // Type your code here
      
      int number  = in.nextInt();
      
int a=number;
      while(a>=10)
      {
      a=a/10;
}       
    
int b=number;
while(b>=100)
{
 b=b/10;
}
b=b%10;
 

int c= number;
c=c%10;
 

int fact1=1;
for(int i=1;i<=a;i++)
{
 fact1=fact1*i;
}
int fact2=1;
for(int i=1;i<=b;i++)
{
 fact2=fact2*i;
}

int fact3=1;
for(int i=1;i<=c;i++)
{
 fact3=fact3*i;
}
int sum = fact1+fact2+fact3;
if(sum==number)
{

 System.out.println("Yes");
}
      else
        System.out.println("No");
	}
}