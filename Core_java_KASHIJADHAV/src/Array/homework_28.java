package Array;
/*
 * saddle point
 */
public class homework_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int a[][]= {{6,3,1},{9,7,8},{2,4,5}};
		
		for (int i = 0; i < a.length; i++)
		{
		
			for (int j = 0; j < a.length; j++) 
			{
			int row=0;
			for (int k = 0; k < a.length; k++)
			{
			
				if(a[i][k]<a[i][j])
				{
					row++;
				}
			}
			
			int col=0;
			
			for (int k = 0; k < a.length; k++) 
			{
				if(a[k][j]>a[i][j])
				{
					col++;
				}
			}
			
			if(row==0 && col==0)
			{
				System.out.println(a[i][j]);
			}
			}
	

		}
	}
}
