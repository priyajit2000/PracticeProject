package com.simplilearn.Inheritance;



public class inheritanse 
{ 
   
 float Salary = 52000;  
}  
	class Engineer extends inheritanse {  
 float Allowance = 16000;

 public static void main(String args[])  {  
	 
   Engineer One =new Engineer();  
   
   System.out.println("Salary of Engineer:" + One.Salary);  
   System.out.println("Allowance of Engineer:" + One.Allowance);
   
}  
 
}  
