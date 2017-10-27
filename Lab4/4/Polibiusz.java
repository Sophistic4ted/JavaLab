package myPackage;

public class Polibiusz implements Algorithm{
	public String crypt(String word) {
		String cypher = "";		
		for (char x : word.toUpperCase().toCharArray()) {	
			if (x=='J') {
				cypher+= String.format("%d%d ",2,4);
			}
			for(int i = 0;i<polib.length;i++) {
				for(int j = 0;j<polib[0].length;j++) {					
						if (x == polib[i][j]) {							
							cypher+= String.format("%d%d ",i+1,j+1);							
						}
				}
			}
		}
		return cypher;
	}

	
	public String decrypt(String word) {
		String cypher = "";
		char[] kod = word.toCharArray();
		cypher+= Character.toString(polib[Character.getNumericValue(kod[0])-1][Character.getNumericValue(kod[1])-1]);		
		return cypher;
	}

}
