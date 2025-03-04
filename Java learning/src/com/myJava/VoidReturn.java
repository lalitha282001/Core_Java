
package com.myJava;

public class VoidReturn{
int ChocoAmount = 200;
public int getchocolate(){
System.out.println("brought it for " +ChocoAmount);
return ChocoAmount;
}

public static void main(String []args){
VoidReturn sister =new VoidReturn();
int brother=sister.getchocolate();
System.out.println("got chocolate from " +brother);
}

}