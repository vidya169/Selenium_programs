package MethodWithReturnType;

public class demo12 {
	public static String[] name(String a1)
	{
		String[] name=a1.split(",");
		
		for(int i=0;i<=name.length-1;i++)
		{
			System.out.println(name[i]);
		}
		return name;
	}
	public static String[] name2(String s2)
	{
		String[] name2=s2.split(" ");
		
		for(int j=0;j<=name2.length-1;j++)
		{
			System.out.println(name2[j]);
		}
		return name2;
		
		
		
		//String str= a1.concat(s2);
		//System.out.println(str);
	}
	public static void main(String[] args) {
		String[] v1=name("v,i,d,y,a");
		System.out.println(v1);
		System.out.println("==========================");
		
		String[] v2=name2("c h a v a n");
		System.out.println(v2);
		
	}


}
