package MethodWithReturnType;

public class demo10 {
	public static int add(int a, int b, int c)
	{
		int sum=a+b+c;
		return sum;
	}
	
	public static int name(String s1)
	{
		int name=s1.lastIndexOf('a');  //ans store in int format..
		return name;
		
	}
	
	
	public static void main(String[] args) {
		int num1=10;
		int num2=20;
		int num3=30;
		
		int num4=add(num1,num2, num3);
		System.out.println("addition " +num4);
		System.out.println("---------------------");
		
		System.out.println(name("vidya chavan"));
		
	}

}
