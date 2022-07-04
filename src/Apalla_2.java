import java.util.Scanner;
public class Apalla_2 {
	public static void main(String args[]){
		long startTime = System.nanoTime();
		long elapsedTime = 0;
		
		Scanner input = new Scanner(System.in);
		int N, M;
		boolean constraints=true;
			
		do{
			System.out.print("Row Size: ");
			N = input.nextInt();
			System.out.print("Column Size: ");
			M = input.nextInt();
			System.out.println();
				
			if(N>0 && N<11){
				if(M>0 && M<11){
					constraints=false;
					break;
				}
				constraints=true;
			break;
			}
		}while(constraints);

		int[][] A = new int[N][M];
			
		System.out.println("----- Values -----");
		for(int i=0;i<N;i++){
			for( int j=0;j<M;j++){
				A[i][j] = input.nextInt();
			}
		}
		for(int x=0;x<M;x++){
			for(int y=0;y<N;y++){
				System.out.print(A[y][x] + " ");
			}
			System.out.println();
		}
		elapsedTime  = System.nanoTime() - startTime;
		System.out.println("Execution Time: "+elapsedTime/1000000);
	}
}