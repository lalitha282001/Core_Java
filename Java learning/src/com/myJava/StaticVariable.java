package com.myJava;
public class StaticVariable{
static String name;            //A single memory is created with static and shared among all objects
int age;
public static void main(String []args){
StaticVariable obj1=new StaticVariable();
obj1.name="lalitha";           //In name container it will store lalitha
obj1.age=23;
StaticVariable obj2=new StaticVariable();
obj2.name="alen";             //In name container it will replace lalitha to alen as it is shared among all object
obj2.age=25;
System.out.println(obj1.name);
System.out.println(obj2.name);
}
}