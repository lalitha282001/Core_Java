package com.myJava;

public class ChildInheritParent extends Parentsuperkeyword{

	ChildInheritParent(){
		//super();
		//whenever child inherit parent by default super keyword will be generated and not visible 
		//which always executes the super which is parent first then only child
		System.out.println("I am a child class ");
	}
public static void main(String []args){
	ChildInheritParent obj=new ChildInheritParent();
}
}

/*
how to debug?
Right click on the line it wants to check and select toggle breakpoint and right click on the page debug as
and select run as java application and you can see one be one selection clicking on the resume button at top
*/

