package myPackage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.table.TableModel;

public class Macierz {
	int aRows;
    int aColumns;
    int[][] A;
    public Macierz(int[][] _A) throws MatrixDimensionsException{
    	   this.aRows = _A.length;
	       this.aColumns =_A[0].length;
	       this.A=_A;

    }
    public Macierz(String in_macierz) throws MatrixDimensionsException {
		        int[][] matrix = null;		      
		        
				try {
					BufferedReader buffer;
					buffer = new BufferedReader(new FileReader(in_macierz));				 
					String line;
					int row = 0;
					int size = 0;	        
		        	
					while ((line = buffer.readLine()) != null) {
					    String[] vals = line.trim().split("\\s+");
					    		     
					    if (matrix == null) {
					        size = vals.length;
					        matrix = new int[size][size];
					    }

					    for (int col = 0; col < size; col++) {
					        matrix[row][col] = Integer.parseInt(vals[col]);
					    }

					    row++;
					}
					buffer.close();
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		        
		        this.A = matrix;
		        this.aRows = matrix.length;
		        this.aColumns = matrix[0].length;
		    }
   	

   
	 public int[][] add(Macierz B) throws MatrixDimensionsException {  

	        if (aColumns != B.aColumns || aRows != B.aRows ) {
	        	throw new MatrixDimensionsException("Matrix dimensions are bad");
	        }

	        int[][] C = new int[aRows][B.aColumns];
	        for (int i = 0; i < aRows; i++) {
	            for (int j = 0; j < B.aColumns; j++) {
	                C[i][j] = 0;
	            }
	        }

	        for (int i = 0; i < aRows; i++) { // aRow
	            for (int j = 0; j < B.aColumns; j++) { // bColumn
	                
	                    C[i][j] = A[i][j] + B.A[i][j];
	                
	            }
	        }

	        return C;
	    }
	 public  int[][] sub(Macierz B) {
	    
	        if (aColumns != B.aColumns || aRows != B.aRows ) {
	        	System.out.println("Bledne rozmiary macierzy"); 
	        	}

	        int[][] C = new int[aRows][B.aColumns];
	        for (int i = 0; i < aRows; i++) {
	            for (int j = 0; j < B.aColumns; j++) {
	                C[i][j] = 0;
	            }
	        }

	        for (int i = 0; i < aRows; i++) { // aRow
	            for (int j = 0; j < B.aColumns; j++) { // bColumn
	                
	                    C[i][j] = A[i][j] - B.A[i][j];
	                
	            }
	        }

	        return C;
	    }
	 public int[][] mul(Macierz B) {

	        if (aColumns != B.aRows) {
	        	System.out.println("Bledne rozmiary macierzy");       
	        }

	        int[][] C = new int[aRows][B.aColumns];
	        for (int i = 0; i < aRows; i++) {
	            for (int j = 0; j < B.aColumns; j++) {
	                C[i][j] = 0;
	            }
	        }

	        for (int i = 0; i < aRows; i++) { // aRow
	            for (int j = 0; j < B.aColumns; j++) { // bColumn
	                for (int k = 0; k < aColumns; k++) { // aColumn
	                    C[i][j] += A[i][k] * B.A[k][j];
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