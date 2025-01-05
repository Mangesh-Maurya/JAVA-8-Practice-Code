package defaults.method;
interface I12{
	default void m1() {
		System.out.println("m1 in I12");
	}
}
interface I13 extends I12{
	default void m2() {
 		System.out.println("m2 in I13");
 		//m1();
	}
	public default void m1() {
		
	}
}
public class Day1Forth {

}
