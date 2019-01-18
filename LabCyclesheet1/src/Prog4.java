/**
 * Write a program to demonstrate the knowledge of students in String handling.
 */

/**
 * @author Abhirupa Mitra 17BCEO437
 * PROGRAM 4
 */

import java.io.*;

public class Prog4 {
    
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        System.out.println("Enter gene sequence:");
        String gen=br.readLine();
        int stop;
        int i;
        int l= gen.length();
        for(i=0;i<l-2;i++)
        {
            String atg = gen.substring(i,i+3);
            if(atg.equals("ATG"))
            {
                stop=-1;
                int j=i+3;
                for(;j<l-2;j++)
                {
                    String g=gen.substring(j,j+3);
                    System.out.println(g);
                    if(g.equals("TAG") || g.equals("TAA") || g.equals("TGA"))
                    {
//                        System.out.println("1st if");
                        stop=j;
                        break;
                    }
                    if(g.equals("ATG"))
                    {
//                        System.out.println("2st if");
                        stop=-1;
                        break;
                    }
                }
//                System.out.println("stop:"+stop);
                if(stop!=-1)
                {
                    System.out.println("Genome:"+gen.substring(i+3,stop));
                    i=stop;
                }
            }
        }
    }
}