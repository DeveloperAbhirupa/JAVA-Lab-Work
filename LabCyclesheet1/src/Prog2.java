/**
 * Write a program to demonstrate the knowledge of students in multidimensional arrays and looping constructs.
 */

/**
 * @author Abhirupa Mitra 17BCEO437
 * PROGRAM 1
 */


import java.io.*;

public class Prog2 {
    
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        int arr[][]=new int[4][];
        for (int i=0;i<4;i++)
        {
            System.out.print("Enter no. of slow learners:");
            int slow = Integer.parseInt(br.readLine());
            double n=slow/4.0;
            if ((int)n*4== slow)
            {
                arr[i]= new int[(int)n];
                for(int j=0;j<n;j++)
                    arr[i][j]=4;
            }
                
            else
            {
                int j=0;
                arr[i]= new int[(int)(n)+1];
                for(j=0;j<n;j++)
                    arr[i][j]=4;
                arr[i][--j]=slow%4;
            }
        }
        System.out.println("Resulting array:");
        int c=0;
        for(int i=0;i<4;i++)
        {   
            int flag=0;
            for(int j=0;j<arr[i].length; j++)    
            {
                System.out.print(arr[i][j]+"\t");
                if(arr[i][j]!=4)
                {
                    flag=-1;
                }
                
            }
            if(flag==0)
                c++;
            System.out.println("");
        }
        System.out.println("Batches in which all tutors have exactly 4 students:"+c);           
        
    }
}  