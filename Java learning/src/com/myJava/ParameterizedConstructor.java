package com.myJava;

public class ParameterizedConstructor{
String Student_name;
int Student_number;

ParameterizedConstructor(String name, int number){
Student_name = name;
Student_number = number;
}
public void GetDetails(){
System.out.println("The Name of the student is "+Student_name+ " The roll number of the student is "+Student_number);
}
public static void main(String []args){
ParameterizedConstructor obj= new ParameterizedConstructor("Lalitha",23);
obj.GetDetails();

ParameterizedConstructor obj2 = new ParameterizedConstructor("Alen",35);
obj2.GetDetails();
}
}

