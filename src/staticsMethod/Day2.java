package staticsMethod;
interface I1{
	int a=10;//public static final by default
	void m1();//public abstract
	/*
	 * abstract void m22() { //not Allowed }
	 */
	
	 //abstract static void m22() { //not Allowed }
	
		/*
		 * default static void m22() { //not Allowed }
		 */
	
	static void m2() {
		System.out.println("static Method in m2");
		//m3();
	}
	default void m3() {
		System.out.println("M3 in I1");
	//	m2();
	}
	/*
	 * protected static void m4() {
	 * 
	 * }
	 */
}
public class Day2 {
	public static void main(String[] args) {
		I1.m2();
		// I1.m3();
	}
	

}
