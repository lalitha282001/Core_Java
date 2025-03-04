package com.myJava;

public class DataMethods{

Long AccountNumber = 1234567890l; // l should be last to indicate it is a long primitive data type
String CustomerName = "Lalitha";  //  String is non primitive - mutable - values can be modified
int AccountBalance =300;

public void getbalance(){
System.out.println("Account balance amount is " +AccountBalance);
}

public static void main(String []args){

	// syntax for creating object 
	// ClassName objname = new ClassName();
DataMethods account = new DataMethods();
account.getbalance();  // obj can call all the variables (data) and all methods
}

}
