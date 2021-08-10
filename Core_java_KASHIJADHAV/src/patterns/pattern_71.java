package patterns;



public class pattern_71 {

	public static void main(String[] args) 
	{
		
		for (int i = 0; i < 9; i=i+2)
		{
			int a=1;
			
			for (int j = 0; j < 10; j++)
			{
				if(j-i<=0)
				{
					System.out.print(a);
					
					if(j<i/2)
					{
					a++;
					}
					else
					{
						a--;
					}
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
