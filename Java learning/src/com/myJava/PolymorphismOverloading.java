package com.myJava;

public class PolymorphismOverloading{
public int  multiply(int a){               //same method name -overloading with different parameters
return a;
}
public int  multiply(int a, int b){
return a*b;
}
public float  multiply(float a, float b, float c){
return a*b*c;
}
public static void main(String []args){
PolymorphismOverloading poly=new PolymorphismOverloading();
System.out.println(poly.multiply(3));
System.out.println(poly.multiply(2,5));
System.out.println(poly.multiply(5,7,3));
}
}