/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abhirupa
 */

import java.io.*;
public class Prog8 {
    public static int rotation(int n){
        int d=n%10;
        int c=0;
        for(int i=n;i!=0;i/=10,c++); //Counting no. of digits
        int pw=1;
        for(int i=1;i<=c;i++,pw*=10);
        int p = pw*d +n;
        p=p/10;
        return p;
    }
    
    public void foldData(int n){
        int s=0;
        for(int i=n;i!=0;i/=100)
        {
            System.out.println("s:"+(i%100));
            s+=(i%100);
        }
        String dm=Integer.toString(s);
        if(s/100 !=0)
        {
            dm=dm.substring(1,dm.length());
        }
        System.out.println(dm);
    }
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        Prog8 obj = new Prog8();
        int n =Integer.parseInt(br.readLine());
        
        int n0 = obj.rotation(n);
        System.out.println("n is"+n0);
        obj.foldData(n0);
        
        System.out.println("Running Instance");
    }
            
    
}
