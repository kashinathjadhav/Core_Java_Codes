package ArrayPractise;
/*
 * Given an unsorted array A of size N that
 *  contains only non-negative integers, 
 *  find a continuous sub-array which adds to a given number S.
 *  Input:
    N = 5, S = 12
    A[] = {1,2,3,7,5}
    Output: 2 4
    Explanation: The sum of elements 
    from 2nd position to 4th position 
    is 12.
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    The complete solution is

   	Maintain start and last index to store and print these values 
	Iterate the complete array.
	Add array elements to cuursum
	If currsum becomes greater than S, then remove elements starting from start index, 
	till it become less than or equal to S, and increement start.
	if currsum becomes equals to S, then print the starting and last index
	if the currsum never maches to S, then print -1
 */

public class SubArrayWithGivenSum {

	public static void main(String[] args) {
		int []arr= {1,2,3,7,5};
	    int	sum=12;
	    int cursum=0;
	    int si=0;
	    int ei=0;
	    for (int i = 0; i < arr.length; i++) 
	    {
		
	    	cursum=cursum+arr[i];
	    	System.out.println(cursum);
	    	if(cursum>sum)
	    	{
	    		
	    		si++;
	    			    			}
		     }
	    
	    for (int j = si; j < arr.length; j++) 
		{
			cursum=cursum+arr[j];
			if(cursum==sum)
    		{
    			ei=j;
    			
    			System.out.println(si);
    			System.out.println(ei);
    			break;
    		}
    
		}

	    
	   
		

	}

}
