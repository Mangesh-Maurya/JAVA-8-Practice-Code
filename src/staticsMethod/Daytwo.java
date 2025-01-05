package staticsMethod;
class Hello{
	void m1() {
		System.out.println("m11 in Hello");
	}
}
public interface Daytwo {
	public static void main(String[] args) {
		System.out.println("Hello Main in I1");
		Hello h1=new Hello();
		h1.m1();
		
	}

}
