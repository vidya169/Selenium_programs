package ListBox;

import java.util.ArrayList;

public class demoArraylist {
	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("vidya");
		al.add("chavan");
		
		for(String s1:al)
		{
			System.out.println(s1.length());
		}
		
	}

}
