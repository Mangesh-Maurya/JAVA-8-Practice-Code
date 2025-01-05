package defaults.method;
interface Animal{
	void eating();
	void sleeping();
	default void running() {
		System.out.println("Running in Animal");
	}
	default void thinking() {
		System.out.println("Thinking in Animal");
	}
}
class Dog implements Animal{
	public void eating() {
		System.out.println("Dog is eating");
	}
	public void sleeping() {
		System.out.println("Dog is sleeping");
	}
	 public void thinking() {
		 System.out.println("Dog is thinking");
	 }
}
class Cat implements Animal{
	public void eating() {
		System.out.println("Cat is eating");
	}
	public void sleeping() {
		System.out.println("Cat is sleeping");
	}
	public void running() {
		System.out.println("Cat is running");
	}
	public void thinking() {
		System.out.println("Cat is Thinking");
	}
}
public class Day1 {
	public static void main(String[] args) {
		//Animal ani=new Dog();
		Animal ani=null;
		//ani.sleeping();
		//ani.eating();
		//ani.running();
		//ani.thinking();
		//Animal.thinking();
		//Animal.running();
		
		ani=new Cat();
		ani.eating();
		ani.sleeping();
		ani.thinking();
		ani.running();
		
		
	}

}