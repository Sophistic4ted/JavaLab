package myPackage;


public class MacierzProgram {
	public static void main(String [] argv) {
				int[][] A = {{1,1},{1,1}};
    		 	Macierz matrix = new Macierz(A);
    		 	int[][] B = {{1,2},{3,4}};
    	        Macierz.wypiszMacierz(matrix.add(B));	    	        
    	        Macierz.wypiszMacierz(matrix.sub(B));      
    	        Macierz.wypiszMacierz(matrix.mul(B));	
	    	  

}
}