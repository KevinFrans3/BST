
public class Main {

	public static void main(String[] args) {
			
		BST t = new BST(5);
		t.insert(1);
		t.insert(2);
		t.insert(3);
		t.insert(7);

//		t.printTree();
		System.out.println(t.depth());
//		System.out.println(t.getRight().getDatum());

	}

}
