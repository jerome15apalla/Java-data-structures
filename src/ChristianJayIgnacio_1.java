public class ChristianJayIgnacio_1 {
	public static void  main(String[]args) {
		long startTime = System.nanoTime();
		long elapsedTime = 0;
		int [] arr = new int [] {14,564,933,341,165,36,372,516,581,903,577,845,383,51,145};
		System.out.println("----------------");
		System.out.println("Original array: ");
		
		for (int i = 0; i < arr.length; i++){
			System.out.println(arr [i]+" ");				
		}
		System.out.println("------------------------");
		System.out.println("Array in reverse order: ");
		for (int i = arr.length-1; i>=0; i--) {
			System.out.println(arr[i]+" ");
		}
				
		System.out.println("---------------------------------------");
		elapsedTime = System.nanoTime() - startTime;
		System.out.println("Your code run at time (milliseconds): " + elapsedTime);		
	}
}