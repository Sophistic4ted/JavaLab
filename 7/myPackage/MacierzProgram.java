package myPackage;


public class MacierzProgram {
	public static void main(String [] argv) {
		// pobranie limitu
		 	Macierz matrix = new Macierz();
	        int[][] result1 = Macierz.add(matrix.A, matrix.B);
	        Macierz.wypiszMacierz(result1);
	        
	        int[][] result2 = Macierz.sub(matrix.A, matrix.B);
	        Macierz.wypiszMacierz(result2);	        
	        int[][] result3 = Macierz.mul(matrix.A, matrix.B);
	        Macierz.wypiszMacierz(result3);
		//utworzenie listy z odpowiednia iloscia elementow

}
}