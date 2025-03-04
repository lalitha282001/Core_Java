package com.myJava;
public class NoArgumentConstructor{
String name;
int age;
NoArgumentConstructor(){
name ="Lalitha";
age =24;
System.out.println("My name is "+name+ " My age is "+age);
}
public static void main(String []args){
NoArgumentConstructor obj = new NoArgumentConstructor();
}
}

