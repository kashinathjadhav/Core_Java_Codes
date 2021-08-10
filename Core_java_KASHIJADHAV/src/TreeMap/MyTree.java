package TreeMap;

public class MyTree 
{
Node root=null;

void add(int a)
{
	if(root==null)
	{
		root=new Node(a);
	}
	else
	{
		Node p=root;
		while(true)
		{
			if(p.data<a && p.right==null)
			{
				p.right=new Node(a);
				break;
			}
			else if(p.data<a && p.right!=null)
			{
				p=p.right;
			}
			else if(p.data>a && p.left==null)
			{
				p.left=new Node(a);
				break;
			}
			else
			{
				p=p.left;
			}
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
	if(p.right!=null)
	{
		printTree(p.right);
		
	}
	System.out.println(p.data+" ");
	
	if(p.left!=null)
	{
		printTree(p.left);
	}
}

boolean contains(int a)
{
	if(root==null)
	{
		return false;
	}
	else
	{
		Node p=root;
		while(true)
		{
			if(p.data==a)
			{
				return true;
			}
			else if(p.data<a && p.right==null)
			{
				return false;
			}
			else if(p.data<a && p.right!=null)
			{
				p=p.right;
			}
			else if(p.data>a && p.left==null)
			{
				return false;
			}
			else 
				p=p.left;

		}
	}
}
}
