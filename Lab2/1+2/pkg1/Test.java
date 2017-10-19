package pkg1;
import pkg2.*;
public class Test {
	public static void main(String [] argv) {
		A a = new A(0,"tekst");
		B b = new B(0,"tekst");
		C c = new C(0,"tekst");
		a.callIncrement();
		b.callIncrement();
		c.callIncrement();	
		a.callChangeName();
		b.callChangeName();
		c.callChangeName();
		System.out.println(a.name);
		System.out.println(b.name);
		System.out.println(c.name);
		System.out.println(String.format("%d",a.number));
		System.out.println(String.format("%d",b.number));
		System.out.println(String.format("%d",c.number));
		a.callDecrement();
		b.callDecrement();
		c.callDecrement();
		System.out.println(String.format("%d",a.number));
		System.out.println(String.format("%d",b.number));
		System.out.println(String.format("%d",c.number));
	}
}
