package MethodWithReturnType;

import net.bytebuddy.implementation.bytecode.Multiplication;

public class demo3 {
	public static int addition(int a,int b)
	{
		int sum=a+b;
		return sum;
	}
	public static String name(String v1)
	{
		String name=v1.toUpperCase();
		return name;
	}
	
	
	
	
	public static void main(String[] args) {
		
		int num1=10;
		int num2=4;
		
		int num3=addition(num1, num2);
		System.out.println(num3);
		
		int num4=addition(20, 30);
		System.out.println(num4);
		
		System.out.println(addition(2, 3));
		System.out.println("===========================");
		
		int num5=demo4.multiplication(num3, num2);
				System.out.println(num5);
				
				int num6=demo4.multiplication(20, 2);
				System.out.println(num6);
				
				System.out.println(demo4.multiplication(3, 3));
				
				System.out.println("-----------------------");	
				
				String v2=name("chavan");
				System.out.println(v2);
				
				
				
				
			//System.out.println(name("vidya"));	
				
				
		
		
	}

}
