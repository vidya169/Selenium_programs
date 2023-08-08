package Logical_Program;
import java.util.Scanner;

public class eaxmple7_fact_of_num {
public static void main(String[] args) 
{
	
	System.out.println("enter num:");
	Scanner scan=new Scanner(System.in);
	int num = scan.nextInt();    //3	
	
	int fact = 1;     //6

	//       3   0>=1
	for(int i =num; i>=1; i--)
	{
		fact = fact*i;     //6*1 =6 
	}
	

	System.out.println(fact);
}
}