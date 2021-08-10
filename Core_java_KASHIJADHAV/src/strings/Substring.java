package strings;

public class Substring {

	public static void main(String[] args) {
		
	//	String s="abcde";
		//char arr[]=s.toCharArray();
		int s[]= {1,2,3,4};
		for (int i = 0; i < s.length; i++) 
		{
			for (int j = i; j < s.length; j++) 
			{
				for (int k = i; k < j; k++) 
				{
					System.out.print(s[k]);
				}
				System.out.println();
			}
		}
		
		
		
		/*for (int i = 0; i < s.length(); i++) 
		{
			for (int j = i; j < s.length(); j++) 
			{
				for (int k = i; k < j; k++) 
				{
					System.out.print(s.charAt(k));
				}
				System.out.println();
			}
		}
*/
	}

}
