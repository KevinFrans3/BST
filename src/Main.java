
public class Main {

	public static void main(String[] args) {


		randp randomlist = new randp(1000);

		BST<Integer> t = new BST<Integer>(randomlist.nextInt());
		
		for(int i = 0; i < 999; i++){
			t.insert(randomlist.nextInt());
		}
		
		t.printTree();

	}

}
