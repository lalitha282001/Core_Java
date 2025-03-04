package com.myJava;

public class NanoCar extends CarNew implements Interface1, Interface2 {  // this is known as multiple inheritance is achieved through interface
// whenever we inherit class and interface use implements keyword
	String name ="Model car";
	@Override
	public void Carengine(){
		System.out.println("Nano enginne");
		}
	public static void main(String []args){
		CarNew obj=new NanoCar();
		obj.Carengine();

	}
	@Override
	public void Cardesign() {
	
		
	}
	@Override
	public void Method1() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void Method2() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void Method3() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void Method4() {
		// TODO Auto-generated method stub
		
	}
}
