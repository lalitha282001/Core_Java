package com.myJava;

public class Naturals extends AbstractionClass{
	
	@Override
	public void MakeupSecret(){
		System.out.println("Naturals Makeup secret");
		}
	@Override
		public void MakeupRemoveSecret(){
		System.out.println("Naturals Remove Makeup secret");
		}
public static void main(String []args){
Naturals obj= new Naturals();
obj.MakeupSecret();
obj.MakeupRemoveSecret();
}
}