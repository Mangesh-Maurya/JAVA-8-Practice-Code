package defaults.method;
interface I1{
	default void show() {
		System.out.println("Show in I1");
	}
}
interface I2{
	default void show() {
		System.out.println("Show in I2");
	}
}
class Hello implements I1,I2{
	public void show() {
		System.out.println("Show in Hello");
	}
	void showAll() {
		System.out.println("ShowAll in Hello");
		show();
		I1.super.show();
		I2.super.show();
	}
}
public class Day1SecondPro {
	public static void main(String[] args) {
		Hello h1=new Hello();
		h1.showAll();
	}

}
