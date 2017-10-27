package myPackage;

public class ROT11 implements Algorithm {

	public String crypt(String word) {
		String cypher = "";	
		for (char x : word.toUpperCase().toCharArray()) {	
			cypher+= rot.charAt((rot.indexOf(x)+rot_shift)%26);
		}
		return cypher + " ";
	}

	@Override
	public String decrypt(String word) {
		String cypher = "";	
		for (char x : word.toUpperCase().toCharArray()) {	
			cypher+= rot.charAt(((rot.indexOf(x)+26-rot_shift)%26));
		}		
		return cypher + " ";
	}

}
