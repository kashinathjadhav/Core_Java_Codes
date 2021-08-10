package patterns;



public class pattern_75 {

	public static void main(String[] args)
	{
		for (int i = 0; i <5; i++) 
		{
			for (int j = 0; j<11; j++) 
			{
				if(j-i<=0 )
				{
					System.out.print("*");
				}
				else if(i+j>=10)
				{
					System.out.print("*");
				}
				else if(i+j==9)
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}

	}

}
