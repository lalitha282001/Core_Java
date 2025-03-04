package com.myJava;

public class ConstructorOverloading{

String Animal_name;
String Animal_food;
ConstructorOverloading(){
//no argument constructor
System.out.println("Animal is no argument constructor");
}
ConstructorOverloading(String name){
//parameterized constructor with 1 argument
Animal_name=name;
System.out.println("Animal name is "+Animal_name);
}
ConstructorOverloading(String name,String food){
//parameterized constructor with 2 arguments
Animal_name=name;
Animal_food=food;
System.out.println("Animal name is "+Animal_name+ " Animal food is "+Animal_food);
}
public static void main(String []args){
ConstructorOverloading obj1=new ConstructorOverloading();
ConstructorOverloading obj2=new ConstructorOverloading("Cow");
ConstructorOverloading obj3= new ConstructorOverloading("Cow", "grass");

}
}

