package strings;
//6) Write a program to compare a given string to the specified character
//sequence.
public class classwork_06 {

	public static void main(String[] args) 
	{
		
        String s="vijay";
        
        char ch[]= {'v','i','j','a','y'};
        int cnt=0;
        for (int i = 0; i < ch.length; i++) 
        {
			if(s.charAt(i)!=ch[i])
			{
				cnt++;
				break;
			}
		}
        if(cnt==0)
        {
        	System.out.println("equal");
        }
        else
        {
        	System.out.println("not equal");
        }
	}

}
