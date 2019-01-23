/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abhirupa
 */


class Polymorphism{
   public void myMethod(){
	System.out.println("Overridden Method");
   }
}
public class XYZ extends Polymorphism{

   public void myMethod(){
	System.out.println("Overriding Method");
   }
   public static void main(String args[]){
	Polymorphism obj = new XYZ();
	obj.myMethod();
   }
}