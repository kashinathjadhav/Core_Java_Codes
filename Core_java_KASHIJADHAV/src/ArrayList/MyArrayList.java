package ArrayList;

import java.util.ArrayList;

public class MyArrayList {

	public static void main(String[] args)
	{
		
		ArrayList<Range> ar=new ArrayList();
		
		ar.add(new Range(1,30));
		ar.add(new Range(15,45));
		ar.add(new Range(10,50));
		ar.add(new Range(50,55));
		ar.add(new Range(70,105));
		ar.add(new Range(100,135));
		
		
		for (int i = 0; i < ar.size(); i++) 
		{
			
			for (int j = 0; j < ar.size(); j++) 
			{
				Range iwo=ar.get(i);
				Range jwo=ar.get(j);
				
				if(i!=j && iwo.ldate>=jwo.sdate && iwo.sdate<jwo.sdate)
				{
					if(jwo.ldate>iwo.ldate)
					{
					iwo.ldate=jwo.ldate;
					}
					ar.remove(j);
					i--;
					break;
					
				}
			}
		}
		
		for (int i = 0; i < ar.size(); i++) 
		{
			System.out.println(ar.get(i));
		}
		
	}

}
