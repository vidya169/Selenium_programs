package Logical_Program;
public class example8_Imp_Armtrong_Number
{
	public static void main(String[] args)
	{
		int OrgNum = 153;  // 1 + 125 + 27 =153
			
		int sum = 0;    //	0	
		
				// 153       153>0         153/10   
		for (int i = OrgNum; i > 0;  i = i / 10)
		{
			int rem = i % 10;   //153 % 10 = 3
			sum = sum + (rem * rem * rem);   // 0 + 27 = 27
		}
		
		
		if (OrgNum == sum)
		{
			System.out.println("given number " + OrgNum + " is an armstrong number");
		} 
		else 
		{
			System.out.println("given number " + OrgNum + " is not an armstrong number");
		}
	}
	
	
	
	
	
	// find Armtrong_Number from 1 to 1000
	
}