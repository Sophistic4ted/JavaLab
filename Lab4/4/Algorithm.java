package myPackage;

public interface Algorithm {
	char[][] polib =    {{'A','B','C','D','E'},
			{'F','G','H','I','K'},
			{'L','M','N','O','P'},
			{'Q','R','S','T','U'},
			{'V','W','X','Y','Z'}};
	
	String rot = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	int rot_shift = 13;
	String crypt(String word);
	String decrypt(String word);
}
