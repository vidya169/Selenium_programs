package MethodWithReturnType;

public class demo8 {
	public static char name(String s1)
	{
		char name=s1.charAt(3);
		return name;
	}
	
	
	public static void main(String[] args) {
		
		char v1=name("vidya");
		System.out.println(v1);
		System.out.println("========================");
		
		char v2=demo9.name2("chavan");
		System.out.println(v2);
		
		System.out.println(demo9.name2("pihuu"));
		
		System.out.println("===========================");
		
		
	}

}
