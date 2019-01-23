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
public class Demo {
    public static void main(String args[])throws IOException
    {
        int big = 1234567890;
        float approx = big;
        System.out.println("big "+big+"  approx  "+approx);
        System.out.println(big - (int)approx);
        boolean flag= true;
        boolean flag2=flag;
        
        Double object = new Double("2.4");
        int a = object.intValue();
        byte b = object.byteValue();
        float d = object.floatValue();
        double c = object.doubleValue();
        System.out.println(a +" "+ " "+b +" "+ c +" "+ d );
        
    }
}
    

