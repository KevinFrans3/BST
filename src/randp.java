import java.util.ArrayList;

public class randp {
	
	ArrayList<Integer> ints;

	public randp(int i) {
		ints = new ArrayList<Integer>();
		for(int x = 1; x <= i; x++)
		{
			ints.add(x);
		}
		
	}

	public int nextInt() {
		
		if(ints.size() == 0)
		{
			return 0;
		}
		
		int randomindex = (int) Math.floor(Math.random() * ints.size());
		int toreturn = ints.get(randomindex);
		ints.remove(randomindex);
		return toreturn;
	
	

	}

}