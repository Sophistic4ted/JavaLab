package myPackage;


public class LiczbyPierwsze {
	public static void main(String [] argv) {
		// pobranie limitu
		System.out.print("Type the limit:");
			int limit = JIn.getInteger();			
		//utworzenie listy z odpowiednia iloscia elementow
		int[] myList = new int[limit];	
		//Sito Eratostenesa(chyba w miare optymalne)
		for (int i = 2; i < Math.sqrt(myList.length); i++) {
			if(myList[i]==0) {
			int multiple = i+i;
			//wykreslanie
			while(multiple<limit) {	
				myList[multiple]=1;
				multiple+=i;
				}
			}
		};
	
	    //Wypisanie + zliczenie zeby sprawdzic poprawnosc
		int ile = 0;
	      for (int i = 2; i < myList.length; i++) {
	    	  if (myList[i]==0){
	    	  ile +=1;
	          System.out.println(i + " ");	          
	    	  }
	    	  
	      }
	      System.out.println("Koniec" + ile );
	}
}
