package MethodWithReturnType;



public class demo5 {
	
	public static int addition(int a, int b)
	{
		int sum=a+b;
		return sum;
	}
	
	
public static void main(String[] args) {
		
		int num1=10;
		int num2=20;
		
		int num3=addition(num1, num2);
		System.out.println(num3);
		
		int num4=addition(20, 30);
		System.out.println(num4);
		
		System.out.println(addition(4, 5));
		System.out.println("===========================");
		
		
		System.out.println(demo6.multiplication(2, 3));
		
		int num5=demo6.multiplication(40, 30);
		System.out.println(num5);
		
		
		int num6=demo6.multiplication(num3, num4);
		System.out.println(num6);
		
		System.out.println("================================");
		
			
}	

}
