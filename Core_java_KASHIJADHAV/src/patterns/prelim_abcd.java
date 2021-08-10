package patterns;

public class prelim_abcd {

	public static void main(String[] args) {
		
		for (int i = 0; i < 7; i++) 
		{
			for (int j = 0; j < 7; j++)
			{
				if(i+j<=6)
				{
					System.out.print((char)(j+65));
				}
			}
			for (int j = 0; j < 7; j++) 
			{
			
				if(i+j<=6)
				{
					System.out.print((char)(6-i-j+65));
				}
			}
			System.out.println();
		}

	}

}
