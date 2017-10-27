package myPackage;

import java.util.Comparator;

public class MyComparator implements Comparator<Pracownik> {

	@Override
	public int compare(Pracownik arg0, Pracownik arg1) {
		return (int)(arg0.wynagrodzenieBrutto - arg1.wynagrodzenieBrutto);
	}
}

