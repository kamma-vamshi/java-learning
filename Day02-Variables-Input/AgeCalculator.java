import java.util.*;
public class AgeCalculator
{
  public static void main(String args[])
  {
    int current_year=2026;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Birth year:");
    int birth_year=sc.nextInt();
    System.out.println("current Age:"+(current_year-birth_year));
    sc.close();
  }
}