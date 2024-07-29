import java.util.*;
public class divIDELONGNUMBER30DIGIT
{
  public static void main(String[] args)
  {
      Scanner in =new Scanner(System.in);
      System.out.println("ENTER A 30 DIGIT NUMBER AND A NUMBER TO DIVIDE IT ");//THIS PROGRAM WILL CHECK WEATHER THE NUMBER IS DIVIDE OR NOT
      String str=in.next();
      int length=str.length();
      String str2=str.substring(str.length()-5,str.length());
      System.out.println(str2);
      int number=Integer.parseInt(str2);
      System.out.println(number);
      int n=5;
      if(number%n==0)
            System.out.println("diviDED");
      else
                  System.out.println("not diviDED");
    }
    }