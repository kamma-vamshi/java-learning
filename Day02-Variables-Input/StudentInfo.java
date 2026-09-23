import java.util.*;
public class StudentInfo
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("----- Student Information -----");
    System.out.println("Enter name:");
    String name=sc.next();
    System.out.println("Enter age:");
    int age=sc.nextInt();
    System.out.println("Enter Branch:");
    String branch=sc.next();
    System.out.println("Enter Grade:");
    String grade=sc.next();
    System.out.println("Enter college name:");
    String college=sc.next();
    sc.close();
    System.out.println("Name:"+name);
    System.out.println("Age:"+age);
    System.out.println("Branch:"+branch);
    System.out.println("Grade:"+grade);
    System.out.println("College:"+college);
  }
}