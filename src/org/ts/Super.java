package org.ts;

public class Super {
	public Super() {
		System.out.println("cons non a:"+ 1234);
		
	}
	int a=10;
	int b=80;
		
	{
		System.out.println("int value a:"+a+b);
		
	}
	public void superName() {
		System.out.println("super name:"+ "JAVA");
	}
	public static void main(String[] args) {
		Super s=new Super();
		s.superName();
		
	}
	
	
	}


