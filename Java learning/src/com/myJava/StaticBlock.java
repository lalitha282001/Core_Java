package com.myJava;

public class StaticBlock {                // A class can have n number of static block

	static {                               // static block is created
		System.out.println("Static 1");
	}
	static {
		System.out.println("Static 2");
	}
	public static void main(String[] args) {
		System.out.println("Main method"); //compiler gives high priority to static block more than main method
		//executed because the class loaded in the memory

	}

}
