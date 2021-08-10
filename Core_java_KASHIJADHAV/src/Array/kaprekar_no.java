package Array;

public class kaprekar_no {

	public static void main(String[] args) {
		
		
		int a=45;
		
		int b=a*a;
		int c=b;
		
		System.out.println("square is"+b);
		int nd=0;
		
		while(c>0)
		{
			nd++;
			c=c/10;
		}
		if(nd%2!=0)
		{
			nd++;
		}
		nd=nd/2;
		
		int div=(int)Math.pow(10, nd);
        System.out.println(div);
        
        int fp=b/div;
        int sp=b%div;
        
        System.out.println(fp+" "+sp);
        
        if(fp+sp==a)
        {
        	System.out.println("kaprekr no");
        }
        else
        {
        	System.out.println("not kaprekar");
        }
	}

}
