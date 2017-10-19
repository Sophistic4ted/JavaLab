package pkg1;

public class B extends A {
	public B(int number, String name) {
		super(number,name);
	};
	protected void decrement() {
		this.number-=3;
	};
	void changeName() {
		this.name = name + "B";
	};
	private void increment(){
		this.number+=3;
	};	
}
