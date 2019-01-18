/**
 * Write a program to demonstrate the knowledge of students in String handling.
 */

/**
 * @author Abhirupa Mitra 17BCEO437
 * PROGRAM 3
 */

import java.io.*;

public class Prog3 {
    
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        System.out.println("Enter chemical equation:");
        String eqn=br.readLine();
        char sp;
        int stp, i;
        int l=eqn.length();
        int shft=-1;
        System.out.println("Reactants are:\n");
        for(i=0;i<l;i++)
        {
            
            char c=eqn.charAt(i);
            if(i!=0)
                c=eqn.charAt(i+1);
            
            stp=-1;
            if(true)
            {
                for(int j=i;j<l;j++)
                {
                    sp=eqn.charAt(j);
                    if(sp=='+' || sp=='-' || j==l-1)
                    {
                        stp=j;
                        if(sp=='-')
                            shft=1;
                        break;
                    }                              
                            
                    
                }
                if(i!=0)
                    System.out.println(c+ " moles of "+ eqn.substring(i+2,stp));
                else
                    System.out.println(c+ " moles of "+ eqn.substring(i+1,stp));
                        
                
            }
            System.out.println();
            i=stp;
            if(shft==1)
                break;
         
        }
        
        //Print out the products
        i=i+3;
        System.out.print("Character at:"+eqn.charAt(i));
        int org=i;
        System.out.println("Character at product beginning:"+eqn.charAt(i));
        System.out.println("Products are:\n");
        for(;i<l;i++)
        {
            
            char c=eqn.charAt(i);
//            System.out.println("Petuk:"+c);
         
//            if(i!=org)
//                c=eqn.charAt(i+1);
            stp=-1;
            if(true)
            {
                for(int j=i;j<l;j++)
                {
                    sp=eqn.charAt(j);
                    if(sp=='+' || sp=='-' || j==l-1)
                    {
                        stp=j;
                        if(sp=='-')
                            shft=1;
                        break;
                    }                              
                            
                    
                }
                if(i!=org)
                    System.out.println(c+ " moles of "+ eqn.substring(i+1,stp+1)+"\n");
                else
                    System.out.println(c+ " moles of "+ eqn.substring(i+1,stp)+"\n");

            }
            System.out.println();
            i=stp;
        }
        
    }
}  