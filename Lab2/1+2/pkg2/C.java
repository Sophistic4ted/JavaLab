package pkg2;

public class C extends pkg1.B {
	public C(int number, String name) {
		super(number,name);
	};
	void changeName(){
		this.name = name + "C";
	};
}
