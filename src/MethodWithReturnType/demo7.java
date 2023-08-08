package MethodWithReturnType;

public class demo7 {
	
	public static String name(String v1)
	{
	String name=v1.toUpperCase();
	return name;
	}
	
	
	
	public static String name2(String v2)
	{
		String name2=v2.replace("s1", "s2");
	return name2;
	}
	
	
	
	public static void main(String[] args) {
		
		String s1="snehal";
		String s2="vidya";
		
		
	//	String s1=name("vidya");
		//System.out.println(s1);
		
		//System.out.println(name("rajat"));
		System.out.println("=================================");
	

		String s3=name2("s1");
		System.out.println(s2);
		
		
		
		
	}

}
