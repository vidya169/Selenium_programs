package MethodWithReturnType;
public class demo1 {
	
	public static int addition(int a, int b)
	{
	int sum=a+b;
	return sum;
	}
	
	public static String name(String s1 )
	{
	String	name=s1.toUpperCase();
	return name;
	}
	
	
public static void main(String[] args) {
		
		int num1=10;
		int num2=20;
		int num5=4;
		
		 int num3 = addition(num1,num2);
		 System.out.println(num3);
		 
		 int num4 =demo2.multiplication(num3, num5);
		 System.out.println(num4);
		 
		 int num6=demo2.multiplication(2, 3);
		 System.out.println(num6);
		 
		 int num7=demo2.multiplication(30, 30);
		 System.out.println(num7);
		 
		 String s2=name("vidya");
		 System.out.println(s2);
		 System.out.println(name("chavan"));
		 
		
		 
		 
		
		
		
		
	}
	
	}


