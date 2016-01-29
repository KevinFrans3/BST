
public class Main {

	public static void main(String[] args) {


//		int totaldepth = 0;
//		
//		for(int k = 0; k < 100; k++)
//		{
//			randp randomlist = new randp(1000);
//	
//			BST<Integer> t = new BST<Integer>(randomlist.nextInt());
//			
//			for(int i = 0; i < 999; i++){
//				t.insert(randomlist.nextInt());
//			}
//			totaldepth += t.depth();
//			
//		}
//		
//		System.out.println(totaldepth / 100.0);
		randp test = new randp(10);
		for(int i = 0; i < 10; i++)
		{
			System.out.println(test.nextInt());
		}

	}

}
