package com.myJava;

public class StaticMethod{

public static void Method1(){         
System.out.println("It is a static method");  // static keyword is used so can call without using obj
}
public void Method2()
{
System.out.println("It is a non static method");
}
public static void main(String []args){
Method1();  //directly called without creating obj

}
}
