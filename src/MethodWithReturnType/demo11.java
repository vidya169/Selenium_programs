package MethodWithReturnType;

public class demo11 {
	
	public static String[] name(String s1)
	{
		String[] name=s1.split(",");
		
		for(int i=0;i<=name.length-1;i++)
		{
			System.out.println(name[i]);
		}
		return name;
	}
	public static void main(String[] args) {
		String[] v1=name("v,i,d,y,a");
		System.out.println(v1);
	}

}

