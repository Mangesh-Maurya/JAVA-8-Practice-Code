package functional.interfaces;
@FunctionalInterface
interface I1{
	public void m1();
	
	//void m2();
	default void m2() {
		
	}
}
public class Jtc1 {
	public static void main(String[] args) {
		//I1 i1=(int a)->System.out.println("Hello");
		System.out.println("Main start");
		I1 i1=()->System.out.println("Hello");
		i1.m1();
	}

}
