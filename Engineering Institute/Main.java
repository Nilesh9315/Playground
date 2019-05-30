//import required packages
import java.util.*;
class Faculty
{
  int baseAmount;
  
  public void salary(int amount)
  {
    baseAmount=amount;
       System.out.println("Base Salary:"+" "+amount);

    }
}
class CSE extends Faculty
{
  public void salary(int base)
  {
   System.out.println("CSE Faculty:"+" "+(base+3000));
}
}
class IT extends Faculty
{
  public void salary(int base)
  {
   System.out.println("IT Faculty:"+" "+(base+5000));

  }
}
class ECE extends Faculty
{
  public void salary(int base)
  {
   System.out.println("ECE Faculty:"+" "+(base+4500));
  }
}

class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int ammount = sc.nextInt();
    
    Faculty fac = new Faculty();
      fac.salary(ammount);
       CSE obj1 = new CSE();
    obj1.salary(ammount);
    IT it = new IT();
    it.salary(ammount);
        ECE obj = new ECE();
    obj.salary(ammount);
    
    //implement your required concept here
  }
}