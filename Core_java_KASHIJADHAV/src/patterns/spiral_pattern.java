package patterns;

public class spiral_pattern {

	public static void main(String[] args) {
		int n=4;
		int[][]a =new int[n][n];
		int cnt=1;
		int mini=0;
		int minj=0;
		int maxi=n-1;
		int maxj=n-1;
		
		int limit=((n)/2)+1;
		
		for (int k = 0; k <limit; k++) 
		{
			
			for (int j = minj; j <=maxj; j++) 
			{
				a[mini][j]=cnt;
				cnt++;
			}
			mini++;
			
			for (int i = mini; i <= maxi; i++)
			{
				a[i][maxj]=cnt;
				cnt++;
			}
			maxj--;
			
			for(int j=maxj;j>=minj;j--)
			{
				a[maxi][j]=cnt;
				cnt++;
			}
			maxi--;
			for (int i = maxi; i >=mini; i--)
			{
				a[i][minj]=cnt;
				cnt++;
			}
			minj++;
		}
		
		

		
		for (int i = 0; i < a.length; i++)
		{
		
			
			for (int j = 0; j < a.length; j++)
			{
			if(a[i][j]>9)
			{
				System.out.print(a[i][j]+" ");
			}
			else
			{
				System.out.print(a[i][j]+"  ");
			}
			}
			System.out.println();
		}
	}

}
