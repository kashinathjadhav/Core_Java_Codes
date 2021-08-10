package hefshineTreeMap;

public class MyTreeMap 
{
	Node root=null;
	
	void add(int key,String value)
	{
		if(root==null)
		{
			root=new Node(key,value);
		}
		else 
		{
			Node p=root;
			while(true)
			{
				if(p.key<key && p.right==null)
				{
					p.right=new Node(key,value);
					break;
				}
				else if(p.key<key && p.right!=null)
				{
					p=p.right;
				}
				else if(p.key>key && p.left==null)
				{
					p.left=new Node(key,value);
					break;
				}
				else
					p=p.left;
			}
		}
	}
	
	
	void print()
	{
		if(root!=null)
		{
			printTree(root);
		}
	}
	private void printTree(Node p) 
	{
		if(p.left!=null)
		{
			printTree(p.left);
			
		}
		System.out.println(p.key+" "+p.value);
		
		if(p.right!=null)
		{
			printTree(p.right);
		}
		
		
	}


	String get(int key)
	{
	if(root==null)
	{
		return null;
	}
	else
	{
		Node p=root;
		while(true)
		{
			if(p.key==key)
			{
				return p.value;
			}
			else if(key>p.key && p.right==null)
			{
				return null;
			}
			else if(key>p.key && p.right!=null)
			{
				p=p.right;
			}
			else if(key<p.key && p.left==null)
			{
				return null;
			}
			else 
			{
				p=p.left;
			}
		}
	}
}
}
