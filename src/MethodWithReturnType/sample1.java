package MethodWithReturnType;

public class sample1 {
	public static void main(String[] args)
	{
		int num1=10;
		int num2=5;
		int num3=4;				
		int num4 = addition(num1, num2);   //10,5  = 15		
		int num5 = sample2.multiplication(num3, num4);   //4 15
		System.out.println(num5);
		
		System.out.println("--------------------------------------------");
		
		String s2 = convertNameToUpperCase("amol");
		System.out.println(s2);
				
		System.out.println(convertNameToUpperCase("shivaji"));   //SHIVAJI
		
		System.out.println("------------------------");
		
		System.out.println(sample2.multiplication(4, 3));		
	}
	
	
	
	//method with int return type
	public static int addition(int a, int b)   //10 , 5
	{
		int sum=a+b;                 //10+5		
		return sum;
	}
	
	
	//method with string return type
	public static String convertNameToUpperCase(String s1)  //amol
	{
		String name = s1.toUpperCase();    //AMOL
		return name;
	}
	
	
	
	

}


