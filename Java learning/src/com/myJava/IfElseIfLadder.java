package com.myJava;

public class IfElseIfLadder{
String MyFavouriteFood ="Sambarrice";

public void Foodguess(){
if(MyFavouriteFood.equals("Curd")){          //equals exactly match the values consider cases and space
System.out.println("Your favourite food is curd rice");
}else if(MyFavouriteFood.equals("friedrice")){
System.out.println("Your favourite food is fried rice");
}else if(MyFavouriteFood.equalsIgnoreCase("sambarRice")){           // equalsIgnoreCase ignore the case 
System.out.println("Your favourite food is sambar rice");
}else{
System.out.println("Sorry, i dont know");
}
}
public static void main(String []args){
	IfElseIfLadder food=new IfElseIfLadder();
food.Foodguess();

}
}