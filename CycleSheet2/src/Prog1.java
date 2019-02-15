/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abhirupa
 */
import java.util.NoSuchElementException;
import java.io.*;
public class Prog1 {
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        System.out.println("Enter Reg No:");
        String reg=br.readLine();
        System.out.println("Enter Number:");
        String n=br.readLine();
        try{
            int ln=n.length();
            if(ln!=10)
                throw new IllegalArgumentException ("Invalid Phone Number");
            for(int i=0;i<ln;i++)
            {
                if(Character.isDigit(n.charAt(i))==false)
                {
                    throw new NumberFormatException ("Invalid Phone Number");
//                    break;
                }
            }
            
        }
        catch(NumberFormatException e)
        {
            System.out.println(e);
        }
        catch(IllegalArgumentException e)
        {
            System.out.println(e);
        }
       
        try{ 
        int lReg=reg.length();
            for(int i=0;i<lReg;i++)
            {
                if(Character.isLetterOrDigit(n.charAt(i))==false)
                {
                    throw new NoSuchElementException ("Invalid Reg Number");
//                    break;
                }
            }
        }
         catch(NoSuchElementException e)
        {
            System.out.println(e);
        }

    }
}
