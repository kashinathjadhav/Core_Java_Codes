package MyHashMapString;

public class HashhMap extends Object
{

	Node []a=new Node[5];
	
	void add(String key,int value)
	{
		int index=key.hashCode()%a.length;
		if(a[index]==null)
		{
			a[index]=new Node(key,value);
		}
		else
		{
			Node p=a[index];
			while(p.next!=null)
			{
				p=p.next;
			}
			p.next=new Node(key,value);
		}
	}
	int get(String key)
	{
		int index=key.hashCode()%a.length;
		Node p=a[index];
		while(p!=null)
		{
			if(p.key.compareTo(key)==0)
			{
				return p.value;
			}
			p=p.next;
		}
		return Integer.MIN_VALUE;
	}
	

}


