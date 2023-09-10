package org.ts;

public class This extends Super {
public This() {// constrecter
      super();
      
	System.out.println("this con b:"+ 5656);
   
}
int a=30;//veriable
{
      
	System.out.println("int value b:"+ a);
	System.out.println(super.a);
	System.out.println(this.a);
	this.thisId();
	
}
public void thisId() {//methode
	
	System.out.println("this id :"+ 987);
	super.superName();
	
	
}
public static void main(String[] args) {
	This t=new This();
	t.thisId();
	t.superName();
	
}
}
