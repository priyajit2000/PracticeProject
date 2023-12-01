package com.simplilearn.Try;

import java.io.FileOutputStream;

public class Tryblock{ 

	public static void main(String[] args) {
		//import java.io.FileOutputStream;

 {
				try(FileOutputStream fileOutputStream =new FileOutputStream("abc.txt")){      
					String msg = "Welcome to java!";      
					byte byteArray[] = msg.getBytes(); //converting string into byte array      
					fileOutputStream.write(byteArray);  
		System.out.println("Message written to file successfuly!");      
					}catch(Exception exception){  
					       System.out.println(exception);  
					}
 
 }
	}
}

			

		


	

