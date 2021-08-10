package Array;

public class homework_27 {

	public static void main(String[] args) {
		
	     char s1[]= {'a','b','c','d'};
	     char s2[]= {'w','x','y','z','e','p','k'};
	     char a[]=new char[s1.length+s2.length];
	     int len=0;
	     int index=0;
	     
	     if(s1.length<s2.length)
	     {
	    	 len=s1.length;
	     }
	     else
	     {
	    	 len=s2.length;
	     }
	     
	     for (int i = 0; i <len; i++)
	     {
			a[index++]=s1[i];
			a[index++]=s2[i];
		 }
	     
	     for (int i = len; i < s1.length; i++) 
	     {
			a[index++]=s1[i];
		 }
	     for (int i = len; i < s2.length; i++) 
	     {
			a[index++]=s2[i];
		 }
	     
	     for (int i = 0; i < a.length; i++) 
	     {
			System.out.print(a[i]+" ");
		 }

	}

}
