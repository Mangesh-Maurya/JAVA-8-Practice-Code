package staticsMethod;
interface I11{
	static void m1() {
		System.out.println("M1 in I11");
	}
}
interface I22{
	static void m2() {
		System.out.println("M1 in I22");
	}
}
class Hello1 implements I11,I22{
	static void m1() {
		//new method in Hello class
	}
	void show() {
		//m1();
		//m2(); 
		I11.m1();
		I22.m2();
	}
}
public class Day2Thrid {
	public static void main(String[] args) {
		Hello1 h1=new Hello1();
		h1.show();
	}

}
