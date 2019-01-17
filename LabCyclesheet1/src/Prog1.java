/**
 * Write a program to demonstrate the knowledge of students in basic Java concepts.
 * Eg.Write a program to read the First name and Last name of a person, his weight and height using command line arguments. 
 * Calculate the BMI Index which is defined as theindividual's body mass divided by the square of their height.
 */

/**
 * 
 * @author Abhirupa MItra 17BCEO437
 * PROGRAM 1
 */
import java.io.*;

public class Prog1 {
    
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        String firstName, lastName;
        double weight,height;
        System.out.println("Enter first name:");
        firstName=br.readLine();
        System.out.println("Enter last name:");
        lastName=br.readLine();
        System.out.println("Enter height: (in cm)");
        height=Double.parseDouble(br.readLine());
        System.out.println("Enter weight:");
        weight=Double.parseDouble(br.readLine());
        double bmi= weight/(height*height);
        if(bmi<18.5)
            System.out.println("Underweight");
        else if(bmi<=25)
            System.out.println("Normal(healthy weight");
        else if(bmi<=30)
            System.out.println("Overweight");
        else
            System.out.println("Obese Class");
    }
}
        
        
        
        
        
        
        
    }
}
