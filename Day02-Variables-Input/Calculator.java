import java.util.*;
public class Calculator
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number1:");
    int num1=sc.nextInt();
    System.out.println("Enter number2:");
    int num2=sc.nextInt();
    System.out.println("Addition:"+(num1+num2));
    System.out.println("Subtraction:"+(num1-num2));
    System.out.println("Multiplication:"+(num1*num2));
    System.out.println("Division:"+(num1/num2));
  }
}