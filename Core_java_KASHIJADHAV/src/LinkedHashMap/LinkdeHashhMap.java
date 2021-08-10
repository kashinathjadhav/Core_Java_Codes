package LinkedHashMap;
public class LinkdeHashhMap {

	Node []a=new Node[5];
	
	Node head;
	
	void add(int key,String value)
	{
		Node n=new Node(key,value);
		
		
		//adding in hash table
		
		int index=key%a.length;
		
		if(a[index]==null)
		{
			a[index]=n;
		}
		else
		{
			Node p=a[index];
			while(p.hashTableNext!=null)
			{
				p=p.hashTableNext;
			}
			p.hashTableNext=n;
		}
		
		//adding in linkedlist
		
		if(head==null)
		{
			head=n;
		}
		else
		{
			Node p=head;
			while(p.linkdeListNext!=null)
			{
				p=p.linkdeListNext;
			}
			p.linkdeListNext=n;
		}
	}
	
	void print()
	{
		Node p=head;
		while(p!=null)
		{
			System.out.println(p.key+" "+p.value);
			p=p.linkdeListNext;
		}
	}
	String get(int key)
	{
		int index=key%a.length;
		Node p=a[index];
		
		while(p!=null)
		{
			if(p.key==key)
			{
				return p.value;
			}
			p=p.hashTableNext;
		}
	return null;
	}
}
