package Logical_Program;
public class example4_Reverse_String {
	public static void main(String[] args) {

		String org = "abcd";      //
		String rev = "";         // dcba
		
		//          3               -1>=0
		for(int i=org.length()-1; i>=0; i--)
		{                 //0       
			rev = rev + org.charAt(i);  // dcb + a = dcba
		}
		
		System.out.println(org);
		System.out.println(rev);
		
			
	}
}