package myPackage;


public class Macierz {
	 int[][] A = { { 1, 1 }, { 1, 1 } };
	 int[][] B = { { 1, 2 }, { 3, 4 } };

	 public static int[][] add(int[][] A, int[][] B) {

	        int aRows = A.length;
	        int aColumns = A[0].length;
	        int bRows = B.length;
	        int bColumns = B[0].length;

	        if (aColumns != bColumns || aRows != bRows ) {
	            throw new IllegalArgumentException("A:Rows: " + aColumns + " did not match B:Columns " + bRows + ".");
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
	 public static int[][] sub(int[][] A, int[][] B) {

	        int aRows = A.length;
	        int aColumns = A[0].length;
	        int bRows = B.length;
	        int bColumns = B[0].length;

	        if (aColumns != bColumns || aRows != bRows ) {
	            throw new IllegalArgumentException("A:Rows: " + aColumns + " did not match B:Columns " + bRows + ".");
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
	 public static int[][] mul(int[][] A, int[][] B) {

	        int aRows = A.length;
	        int aColumns = A[0].length;
	        int bRows = B.length;
	        int bColumns = B[0].length;

	        if (aColumns != bRows) {
	            throw new IllegalArgumentException("A:Rows: " + aColumns + " did not match B:Columns " + bRows + ".");
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
}
}