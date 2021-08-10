package Array;

import java.util.Arrays;

public class StrictlyIncDecOrder {

	public static void main(String[] args) {
		
		int []a= {5,1,3,6,8,2,9,0,10};
		
		int inc=1;
		int dec=1;
		int inn=0;
		int den=0;
		
		if(a[0]>a[1])
		{
			inn=a[1];
			den=a[0];
		}
		else
		{
			inn=a[0];
			den=a[1];
		}
		
		for (int i = 2; i < a.length; i++) 
		{
			if(a[i]>inn)
			{
				inc++;
				inn=a[i];
			}
			else if(a[i]<den)
			{
				dec++;
				den=a[i];
			}
			else
			{
				System.out.println(-1);
				System.exit(0);			}
		}
		
		int []ina=new int[inc];
		int []dea=new int[dec];
		
		if(a[0]>a[1])
		{
			inn=a[1];
			den=a[0];
			
			ina[0]=a[1];
			dea[0]=a[0];
		}
		else	
		{
			inn=a[0];
			den=a[1];
			
			ina[0]=a[0];
			dea[0]=a[1];
		}
		
		int iindex=1;
		int dindex=1;
		
		for (int i = 2; i < a.length; i++)
		{
			if(a[i]>inn)
			{
				inn=a[i];
				ina[iindex++]=a[i];
			}
			else if(a[i]<den)
			{
				den=a[i];
				dea[dindex++]=a[i];
			}
		}
		
		
	   System.out.println(Arrays.toString(ina));
       System.out.println(Arrays.toString(dea));
	}

}
