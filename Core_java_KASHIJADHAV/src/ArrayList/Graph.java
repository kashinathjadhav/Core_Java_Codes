package ArrayList;

import java.util.Arrays;

public class Graph {

	public static void main(String[] args) 
	{
		int a[]= {2,2,1,2};
		int b[]= {1,3,4,4};
		int id[]= {1,2,3,4,5};
		int count[]={0,0,0,0,0};
		int value[]={5,4,3,2,1};
		
		for (int i = 0; i < id.length; i++)
		{
		
			int p=id[i];
			int idcnt=0;
			for (int j = 0; j <a.length; j++)
			{
				if(a[j]==p)
				{
					idcnt++;
				}
			}
			for (int j = 0; j <b.length; j++)
			{
				if(b[j]==p)
				{
					idcnt++;
				}
			}
			count[i]=idcnt;
		}
		
		
	  	
		
		for (int i = 0; i < value.length; i++) 
		{
			for (int j = 0; j < value.length; j++) 
			{
				if(i<j && count[i]<count[j])
				{
					int temp=count[j];
					count[j]=count[i];
					count[i]=temp;
					
					temp=id[j];
					id[j]=id[i];
					id[i]=temp;
				}
			}
		}
		
		for (int i = 0; i < value.length; i++) 
		{
		System.out.println("id "+id[i]+" value "+value[i]);	
		}
	}

}
