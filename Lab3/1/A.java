package myPackage;

import java.util.LinkedList;

public class A {

	void metodaA(final double var) {
		//zmienna final typu prymitywnego double jest stała
		var=1;
	}
	
	void metodaB(final LinkedList<Double> list) {
		//zmienna LinkedList jest obiektem, więc stała jest tylko referencja do obiektu
		//Więc to można 
		list.add(2.0);
		list.remove(2.0);
		//A tego już nie 
		list = new LinkedList<Double>();
	}
}
