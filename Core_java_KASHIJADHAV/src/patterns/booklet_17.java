package patterns;

public class booklet_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 19; i=i+2) 
		{
		
			for (int j = 0; j < 10; j++) 
			{
				if(j-i<=0 && i+j<=18)
				{
					System.out.print("*");
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
