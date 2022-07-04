public class ChristianIgnacio_2 {
	public static void main(String args[]){ 
		
		long startTime = System.nanoTime();
		long elapsedTime = 0;
		int original[][]={{13,98,100},{21,64,85},{2,33,81},{4,9,97},{57,39,59}};    
		     
		int transpose[][]=new int[3][5];
		    
		
		for(int i=0;i<3;i++){    
		for(int j=0;j<5;j++){    
		transpose[i][j]=original[j][i];  
		}    
		}    
			System.out.println("----------------------------------");
			System.out.println("Printing Matrix without transpose:");  
			System.out.println("----------------------------------");
				for(int i=0;i<5;i++){    
				for(int j=0;j<3;j++){    
		System.out.print(original[i][j]+" ");    
		}    
		System.out.println();    
		} 
		System.out.println("--------------------------------");
		System.out.println("Printing Matrix After Transpose:");
		System.out.println("--------------------------------");
			for(int i=0;i<3;i++){    
			for(int j=0;j<5;j++){    
		System.out.print(transpose[i][j]+" ");    
		}    
		System.out.println();   
		}    
			{
				System.out.println("---------------------------------------");
				elapsedTime = System.nanoTime() - startTime;
				System.out.println("Your code run at time (nanoseconds): " + elapsedTime);
				System.out.println("---------------------------------------");
				}
	}
}  