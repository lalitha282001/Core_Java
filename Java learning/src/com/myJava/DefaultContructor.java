package com.myJava;

public class DefaultContructor{
String name; // String is a class so by default return null
int num; // return 0 
Integer values; // Integer is a class so by default return null

/* Compiler created a default constructor here when user does not create any constructor which is not visible to eye. 
 * We can see here printing the NULL and 0 values when user does not initialise any values
  
 */

public static void main(String []args){
DefaultContructor stud = new DefaultContructor();
System.out.println(stud.name); 
System.out.println(stud.num);
System.out.println(stud.values);

}
}
