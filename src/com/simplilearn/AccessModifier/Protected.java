package com.simplilearn.AccessModifier;


public class Protected {

	protected void display() 
    { 
        System.out.println("This is protected access specifier"); 
    } 



public class accessSpecifiers3 extends Protected {

	public static void main(String[] args) {
		accessSpecifiers3 obj = new accessSpecifiers3 ();   
	       obj.display();  
	}

}
}

