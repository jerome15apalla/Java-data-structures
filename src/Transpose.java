
public class Transpose {
	public static void main(String args[]){
		long startTime = System.nanoTime();
		long elapsedTime = 0;
		
		int[][] A = {{13,98,100},{21,64,85},{2,33,81},{4,9,97},{57,39,59}};
		
		for(int x=0;x<A[0].length;x++){
			for(int y=0;y<A.length;y++){
				System.out.print(A[y][x] + " ");
			}
			System.out.println();
		}
		
		elapsedTime  = System.nanoTime() - startTime;
		System.out.println("Your code run at time: "+elapsedTime);
	}
}
