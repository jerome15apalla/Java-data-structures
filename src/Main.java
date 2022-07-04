
public class Main {
	public static void main(String[] args) {
		int[] a = new int[] {11, 12, 13, 14, 15};
		int[] b = new int[] {16, 17, 18, 19, 20};
		
		Queue arrQ = new Queue();
		
		for(int i=0;i<5;i++) {
			arrQ.Enqueue(a[i]);
			arrQ.Enqueue(b[i]);
		}
		
	}
}
