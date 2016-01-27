
public class BST<T extends Comparable<T>> {
	
	private T datum;
	private BST<T> left;
	private BST<T> right;
	
	public BST(T start)
	{
		datum = start;
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
		
	}
	
	public String toString()
	{
		return "";
	}
	
	public int depth()
	{
		return 0;
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
