
public class BST<T extends Comparable<T>> {

	private T datum;
	private BST<T> left;
	private BST<T> right;

	public BST(T tostart)
	{
		datum = tostart;
	}

	public T getDatum()
	{
		return datum;
	}

	public BST<T> getRight()
	{
		return right;
	}

	public BST<T> getLeft()
	{
		return left;
	}

	public void printTree()
	{
		boolean islast = false;
		if(left == null)
		{
			islast = true;
		}
		else
		{
			left.printTree();
		}
		
		System.out.println(datum);
		
		if(right == null)
		{
			islast = true;
		}
		else
		{
			right.printTree();
		}
		
	}

	public String toString()
	{
		return "";
	}
	
	public int depth()
	{
		return rdepth(1);
	}

	public int rdepth(int d)
	{
		int depthleft = d;
		int depthright = d;
		
		if(right != null)
		{
			depthright = right.rdepth(d+1);
		}
		
		
		if(left != null)
		{
			depthleft = left.rdepth(d+1);
		}
		
//		System.out.println(d);
//		System.out.println(d);
		
		return depthleft > depthright ? depthleft : depthright;
	}

	public void insert(T toinsert)
	{
		if(toinsert.compareTo(datum) > 0)
		{
			if(right == null)
			{
				right = new BST(toinsert);
			}
			else
			{
				right.insert(toinsert);
			}
		}
		else
		{
			if(left == null)
			{
				left = new BST(toinsert);
			}
			else
			{
				left.insert(toinsert);
			}
		}
	}

}
