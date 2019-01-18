import java.util.*;
public class Prog6
{
public static void main(String [] args)
{
    Scanner sc=new Scanner(System.in);
    int choice;
    do
    {
    System.out.println("Registration number:");
    String regno=sc.next();
    System.out.println("Name:");
    String name=sc.next();
    System.out.println("CGPA:");
    String CGPA=sc.next();
    System.out.println("Program:");
    String pgrm=sc.next();
    System.out.println("School:");
    String school=sc.next();
    System.out.println("Proctor:");
    String proctor=sc.next();
    System.out.println("Registration number:"+regno);
    System.out.println("Name:"+name);
    System.out.println("CGPA:"+CGPA);
    System.out.println("Program:"+pgrm);
    System.out.println("School:"+school);
    System.out.println("Proctor:"+proctor);
    System.out.println("Do you want to enter and display details? 1-Yes/0-No");
    choice=sc.nextInt();
    }while(choice!=0);
    
}
}
