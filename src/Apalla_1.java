import java.util.Scanner;
public class Apalla_1 {
	public static void main(String args[]){
		long startTime = System.nanoTime();
		long elapsedTime = 0;
		
		int N;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Array Size: ");
		N = input.nextInt();
		int[] A = new int[N];
		
		System.out.println("Values:");
		for(int i=0;i<A.length;i++){
			A[i] = input.nextInt();
		}
		
		for(int i=A.length-1;i>=0;i--){
			System.out.println(A[i]);
		}
		
		elapsedTime  = System.nanoTime() - startTime;
		System.out.println("Execution Time: "+elapsedTime/1000000);
	}
}