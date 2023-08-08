package Logical_Program;



	public class example13_ReverseEvenOrOddIndexWordsInStatement3
	{
		public static void main(String[] args) 
		{
			
			String s1="my name is abc";
			
			
			String [] ar=s1.split(" ");  //{my(0) name(1) is(2) abc(3)}
			
			            // 0<=3
			for(int i=0; i<=ar.length-1; i++)
			{
				             // 0
				String org = ar[i];   //my
							
				if(i%2!=0) 
				{
					System.out.println(findReverseOfGivenString(org));
				}
				else 
				{
					System.out.println(org);
				}		
			}
						
		}
		
		
		
		public static String findReverseOfGivenString(String org) 
		{
			String rev="";
			for(int j=org.length()-1; j>=0; j--) 
			{
				rev=rev+org.charAt(j);
			}
			
			return rev;
		}
		

	}


