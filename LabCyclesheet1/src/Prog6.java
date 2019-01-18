import java.util.*;
public class Prog6
{
public static void main(String [] args)
{
    Scanner sc=new Scanner(System.in);
    int choice;
    do
    {
    System.out.println("Enter registration number:");
    String regno=sc.next();
    System.out.println("Enter name:");
    String name=sc.next();
    System.out.println("Enter CGPA:");
    float CGPA=sc.nextFloat();
    System.out.println("Enter Program:");
    String pgrm=sc.next();
    System.out.println("Enter School:");
    String school=sc.next();
    System.out.println("Enter proctor:");
    String proctor=sc.next();
    System.out.println("Registration number:"+regno);
    System.out.println("Name:"+name);
    System.out.println("CGPA:"+CGPA);
    System.out.println("Program:"+pgrm);
    System.out.println("School:"+school);
    System.out.println("Proctor:"+proctor);
    System.out.println("Do you want to enter and display your details?1/0");
    choice=sc.nextInt();
    }while(choice!=0);
    
}
}
