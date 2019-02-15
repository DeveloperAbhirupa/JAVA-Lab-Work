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

public class main0 {
    public static void main (String args[])throws IOException{
        simpleClassProgram obj = new simpleClassProgram();
        obj.reg="17BCE0437";
        obj.name="Abhirupa";
        obj.sex='F';
        obj.age=21;
        obj.fee=20000.50;
        obj.disp();
        System.out.println("Displaying object details:\n"+obj.reg+"    "+obj.name);
    }
    
}
