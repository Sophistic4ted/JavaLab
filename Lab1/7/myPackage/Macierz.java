package myPackage;


public class Macierz {
	int aRows;
    int aColumns;
    int[][] A;
    public Macierz(int[][] _A){
    	   aRows = _A.length;
	       aColumns =_A[0].length;
	       A=_A;

    }


	 public int[][] add(int[][] B) {
	        int bRows = B.length;
	        int bColumns = B[0].length;    

	        if (aColumns != bColumns || aRows != bRows ) {
	        	System.out.println("Bledne rozmiary maciezry"); 
	        }

	        int[][] C = new int[aRows][bColumns];
	        for (int i = 0; i < aRows; i++) {
	            for (int j = 0; j < bColumns; j++) {
	                C[i][j] = 0;
	            }
	        }

	        for (int i = 0; i < aRows; i++) { // aRow
	            for (int j = 0; j < bColumns; j++) { // bColumn
	                
	                    C[i][j] = A[i][j] + B[i][j];
	                
	            }
	        }

	        return C;
	    }
	 public  int[][] sub( int[][] B) {
	        int bRows = B.length;
	        int bColumns = B[0].length;

	        if (aColumns != bColumns || aRows != bRows ) {
	        	System.out.println("Bledne rozmiary macierzy"); 
	        	}

	        int[][] C = new int[aRows][bColumns];
	        for (int i = 0; i < aRows; i++) {
	            for (int j = 0; j < bColumns; j++) {
	                C[i][j] = 0;
	            }
	        }

	        for (int i = 0; i < aRows; i++) { // aRow
	            for (int j = 0; j < bColumns; j++) { // bColumn
	                
	                    C[i][j] = A[i][j] - B[i][j];
	                
	            }
	        }

	        return C;
	    }
	 public int[][] mul(int[][] B) {

	        int bRows = B.length;
	        int bColumns = B[0].length;

	        if (aColumns != bRows) {
	        	System.out.println("Bledne rozmiary macierzy");       
	        }

	        int[][] C = new int[aRows][bColumns];
	        for (int i = 0; i < aRows; i++) {
	            for (int j = 0; j < bColumns; j++) {
	                C[i][j] = 0;
	            }
	        }

	        for (int i = 0; i < aRows; i++) { // aRow
	            for (int j = 0; j < bColumns; j++) { // bColumn
	                for (int k = 0; k < aColumns; k++) { // aColumn
	                    C[i][j] += A[i][k] * B[k][j];
	                }
	            }
	        }

	        return C;
	    }
	    public static void wypiszMacierz(int[][] m) {
	        for (int i = 0; i < 2; i++) {
	            for (int j = 0; j < 2; j++)
	                System.out.print(m[i][j] + " ");
	            System.out.println();
	        }
	        System.out.println();
}
}