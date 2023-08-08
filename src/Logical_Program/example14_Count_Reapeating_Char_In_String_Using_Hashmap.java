package Logical_Program;


	import java.util.HashMap;

	import java.util.Set;
	//containsKey(key)   --> use to verify given key present or not . if present-> return true, if not present-> return false. 
	//put(key,value)  --> use to add keys & values in hashmap
	//mp.get(key)   --> return value
	//mp.keySet()   --> return all the keys from hashmap


	public class example14_Count_Reapeating_Char_In_String_Using_Hashmap {
		public static void main(String[] args) {

			String org = "abcaba";

			HashMap<Character, Integer> mp = new HashMap<Character, Integer>();
						
			               //5<=5 
			for (int i = 0; i <= org.length() - 1; i++) 
			{							//5
				char s1 = org.charAt(i);   //a
				
				if (mp.containsKey(s1))  //a  --> true
				{
					mp.put(s1, mp.get(s1) + 1);   //a,  2+1
				} 
				else
				{
					mp.put(s1, 1);   //c,1
				}
			}
			
			
			Set<Character> keys = mp.keySet(); //[a, b, c]
			
//			//print occurence of each char
//			for (Character key : keys) 
//			{	
//				System.out.println(key +": "+ mp.get(key));
//			}
			
			
			
			//print only duplicate char
			for (Character key : keys) 
			{
				if(mp.get(key)>1)
				{
					System.out.println(key +": "+ mp.get(key));
				}
			}
			
			//System.out.println("a: "+ mp.get('a'));
			
		}

	}


