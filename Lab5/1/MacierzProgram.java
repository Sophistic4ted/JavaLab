package myPackage;


public class MacierzProgram {
	public static void main(String [] argv) {
				try {
					Macierz matrix = new Macierz("C:\\Users\\Kamil\\JavaWorkspace\\Lab5_1\\src\\myPackage\\in_macierz");
					Macierz B = new Macierz("C:\\Users\\Kamil\\JavaWorkspace\\Lab5_1\\src\\myPackage\\in_macierz1");        
					Macierz.wypiszMacierz(matrix.add(B));
					Macierz.wypiszMacierz(matrix.sub(B));      
	    	        Macierz.wypiszMacierz(matrix.mul(B));	
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					
				}
    	        
	    	  

}
}