package com.cg.demoproject.ui;

class A{

 A(String a){
  
  System.out.println("A");
 }
}
class B extends A {

 B(String a){
  //this();
	 super(a);
	 
  System.out.println("B"+a);
 }
}

public class Test  {
  
 public static void go(){
  new B("C");
 }
 public static void main(String [] args) {
 go();
 }
}