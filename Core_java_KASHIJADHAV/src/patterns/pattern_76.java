package patterns;

public class pattern_76 {

	public static void main(String[] args) 
	{
		int cnt=1;
		for (int i = 0; i < 5; i++) 
		{
			for (int j = 0; j < 5; j++) 
			{
				if(j-i<=0)
				{
					System.out.print(cnt+++" ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
