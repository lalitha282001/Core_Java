package com.myJava;

public class SwitchCase{
int age=40;
public void Getage(){
switch(age){
case 10:{
System.out.println("My age is 10");
}
case 20:{
System.out.println("My age is 20");
break;
}
case 30:{
System.out.println("My age is 30");
break;
}
case 40:{
System.out.println("My age is 40");
break;
}
case 50:{
System.out.println("My age is 50");
break;
}
default:{
System.out.println("Sorry i dont know your age");
}
}
}
public static void main(String []args){
SwitchCase obj=new SwitchCase();
obj.Getage();
}
}


























