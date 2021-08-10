package Array;
//2) Write a program to test if an array contains a specific value
public class homework_02 {

	public static void main(String[] args) 
	{
		
     int arr[]= {3,5,7,8,9,0,1};
     
     int cnt=0;
     int no=1;
     
     for (int i = 0; i < arr.length; i++)
     {
	
    	 if(arr[i]==no)
    	 {
    		 cnt++;
    		 break;
    	 }
	 }
     if(cnt==0)
     {
    	 System.out.println("not found");
     }
     else
     {
    	 System.out.println("found");
     }
	}

}
