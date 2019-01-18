import java.util.Scanner;
import java.util.Random;
class Prog7
{
String[][] c= {{"ITA1001", "ITA1002", "ITA1003", "ITA1004", "ITA1005", "ITA1006"}, {"ITA2001", "ITA2002", "ITA2003", "ITA2004", "ITA2005", "ITA2006"}, {"ITE1001", "ITE1002", "ITE1003", "ITE1004", "ITE1005", "ITE1006"}, {"ITE2001", "ITE2002", "ITE2003", "ITE2004", "ITE2005", "ITE2006"}, {"SWE1001", "SWE1002", "SWE1003", "SWE1004", "SWE1005", "SWE1006"}, {"SWE2001", "SWE2002", "SWE2003", "SWE2004", "SWE2005", "SWE2006"}};
public void courseDetails()
{

System.out.println("The courses offered are:");
System.out.println();
for(int i=0;i<6;i++)
{
for(int j=0;j<6;j++)
System.out.print(c[i][j]+" ");
System.out.println();
}
}
public void select()
{
int[] a=new int[6];
int r,c1,no,i;
Scanner sc=new Scanner(System.in);
System.out.println("For faculty: how many course you want to allocate:");
no=sc.nextInt();
System.out.println("Enter the number for courses:");
for(i=0;i<no;i++)
a[i]=sc.nextInt();
if(no<5)
{
System.out.println("The remaining courses will be selected by committee member randomly");
for(i=no;i<5;i++)
a[i]=(int)(Math.random()*35);
}
System.out.println("The five preferences are:");
for(i=0;i<5;i++)
{
r=a[i]/6;
c1=a[i]%6;
System.out.println(c[r][c1]);
}
}
}
public class Course
{
    public static void main(String[] args)
    {
    Courses c1=new Courses();
    c1.courseDetails();
    c1.select();
    }
}