package lambda.expression;
@FunctionalInterface
interface I1{
	void m1();//by default public abstract
	//void m2();
	default void m3() {
		System.out.println("Default Method in Functional Interface I1");
		
	}
	static void m4() {
		System.out.println("M4 in Functional Interface");
	}
}

/*
 * class A implements I1{ public void m1() {
 * 
 * } }
 */
public class Jtc {
	public static void main(String[] args) {
	I1 i1=()->{
		System.out.println("M1 in Jtc");
		System.out.println("**********");//more then one Line we can write
		};
		i1.m1();
		I1 i2=()->System.out.println("m1 in 2222");//only one line we can write
		i2.m1();
	}
}
