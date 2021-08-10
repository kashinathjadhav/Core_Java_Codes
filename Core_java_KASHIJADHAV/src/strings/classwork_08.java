package strings;
//8) Write a program to test methods of StringBuffer.
public class classwork_08 {

	public static void main(String[] args) 
	{
		StringBuffer sb=new StringBuffer("shubham");
		
		System.out.println(sb.length());
		
		System.out.println(sb.charAt(5));
		
		System.out.println(sb.lastIndexOf("m"));
		
        System.out.println(sb.replace(2, 4, "jjk"));
	}

}
