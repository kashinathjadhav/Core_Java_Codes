package ArrayPractise;
/*
 * Given an array of size N-1 such that it can only contain distinct integers in the range of 1 to N. Find the missing element.

Example 1:

Input:
N = 5
A[] = {1,2,3,5}
Output: 4
 */
class my
{
	int MissingNumber(int array[], int n) 
	 {
        int i, total;
        total = (n + 1) * (n) / 2;
        for (i = 0; i < n-1; i++)
            total -= array[i];
        return total;
    }
}
public class MissingNumberInArray {
	 

	public static void main(String[] args) 
	{
		int arr[] = {1,2,4,4,6,7,8,9};		
		my mm=new my();
		int a=mm.MissingNumber(arr, 8);
        System.out.println(a);
	}

}
