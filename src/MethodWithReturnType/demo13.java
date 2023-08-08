package MethodWithReturnType;

public class demo13 {
	public static String[] name(String s1)
	{
		String [] name=s1.split(",");
		
		
		for(String a: name)
			System.out.println(a);
		
		String s2 = "v i d y a";
		
		System.out.println("string str3");
		System.out.println(s2);
		System.out.println("split stringstr");
		
		String [] s3 =s2.split(" ", 5);
		
		for(String b:s3)
			System.out.println(b);
		
		String c= s1.concat(s2);
		System.out.println(c);
		
		return name;
	}
	
	public static void main(String[] args) {
		
		String [] v1=name("v,i,d,y,a");
		System.out.println(v1);
		
	}

}
