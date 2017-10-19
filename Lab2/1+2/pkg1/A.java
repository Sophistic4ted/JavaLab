package pkg1;

public class A {
	protected int number; 
    protected String name;
	public A(int number_,String name_) {
		name = name_;
		number = number_;
	};
	public void callDecrement() {
		decrement();
	};
	public void callChangeName() {
		changeName();
	};
	public void callIncrement() {
		increment();
	};
	private void increment() {		
		this.number+=2;
	};
	protected void decrement() {
		this.number-=2;
	};
	void changeName() {
		this.name= name + "A";
	};
}