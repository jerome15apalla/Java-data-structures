public class ReverseArray {
	public static void main(String args[]){
		long startTime = System.nanoTime();
		long elapsedTime = 0;
	
		int[] A ={564,933,341,165,36,372,516,581,903,577,845,383,51,145};
		
		for(int i=A.length-1;i>=0;i--){
			System.out.println(A[i]);
		}

		elapsedTime  = System.nanoTime() - startTime;
		System.out.println("Your code run at time: "+elapsedTime);
	}
}
