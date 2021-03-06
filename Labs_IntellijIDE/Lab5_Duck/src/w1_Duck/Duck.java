package w1_Duck;

public abstract class Duck {
	protected IFlyBehavior flyBehavior;
	protected IQuackBehavior quackBehavior;

	public void fly(){
		flyBehavior.fly();
	}
	public void quack() {
		quackBehavior.quack();
	}

	public void swim() {
		System.out.println("\tswimming");
	}

	public abstract void display();
		
	

}
