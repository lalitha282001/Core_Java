package com.myJava;
public class PolyChild extends PolyParent{
	
	@Override
	public void Marriage(){
		System.out.println("My marriage my rules");
	}

public static void main(String []args){
PolyChild child = new PolyChild();
child.properties();
child.Marriage();
}
}