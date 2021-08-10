package Array;

//import sun.security.ec.ECDSASignature.SHA1;

public class Compare_Lexicographacally {

	public static void main(String[] args) {
		
	
		//hwdjr7w
		String a1="kashinath7jiihh";
		String s2="odvsojjjjjjjjjjkmmkcewncoi";
		
	     System.out.println(s2.compareTo(a1));
		
		boolean flag=true;
		
		for (int i = 0; i<a1.length() && i<s2.length(); i++) 
		{
			if(a1.charAt(i)!=s2.charAt(i))
			{
				System.out.println((s2.charAt(i)-a1.charAt(i)));
				flag=false;
				break;
			}
		}
		if(flag)
		{
			if(a1.length()!=s2.length())
			{
			System.out.println(s2.length()-a1.length());
			}
		    else
		    {
			System.out.println(0);
		   }
	}

	}
}
