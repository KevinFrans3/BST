import java.util.ArrayList;

public class randp {
	
	int[] ints;
	int numsChosen;
	int originalsize;

	public randp(int i) {
		originalsize = i;
		numsChosen = 0;
		ints = new int[i];
		for(int x = 0; x < i; x++)
		{
			ints[x] = x+1;
		}
		
	}

	public int nextInt() {
		
		if(numsChosen == originalsize)
		{
			return 0;
		}
		
		int randomindex = (int) Math.floor(Math.random() * (originalsize - numsChosen));
		int toreturn = ints[randomindex + numsChosen];
		ints[randomindex + numsChosen] = ints[numsChosen];
		numsChosen++;
		return toreturn;

	}

}