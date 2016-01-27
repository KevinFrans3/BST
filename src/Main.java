
public class Main {

	public static void main(String[] args) {


		randp randomlist = new randp(1000);

		BST<Integer> t = new BST<Integer>(randomlist.nextInt());
		
		for(int i = 0; i < 999; i++){
			t.insert(randomlist.nextInt());
		}
		
		t.printTree();
		
		//Worst case order of growth for finding a datum is O(n)
		//Best case order of growth for finding a datum is O(1)
		//Average order of growth is O(log 2 n), so about 9

	}

}
