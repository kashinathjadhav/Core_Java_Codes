package patterns;

public class pattern_77 {

	public static void main(String[] args) 
	{
		
		
		for (int i = 1; i <=5; i++) 
		{
			int a=i;
			int b=4;
			
			for (int j = 1; j <=5; j++) 
			{
				
				if(j-i<=0)
				{
					System.out.print(a+" ");
					a=a+b;
					b--;
					
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


