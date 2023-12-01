package com.simplilearn.Throws;

class Throws{  
void m()throws IO.Exception{  
throw new IO.Exception("device error");//checked exception  
  }  
void n() throws IO.Exception{  
m();  
  }  
void p(){  
try{
n();  
   }
catch(Exception e)
{
System.out.println("exception handled");
}  
}  
public static void main(String args[]){  
   Throws obj=new Throws();  
obj.p();  
System.out.println("normal flow...");  
  }  
}
