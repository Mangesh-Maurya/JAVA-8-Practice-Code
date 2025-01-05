package method.reference;
@FunctionalInterface
interface Hai{
	//void test(int a,int b);
	void test(String str);
}
@FunctionalInterface
interface Hello1{
	int test(int a,int b);
}
class MyInteger1{
	/*public static int findSum(int a,int b) {
		System.out.println("FindSum(int a,int b) in MyInteger");
		return a+b;*/
		
		public int findSum(int a,int b) {
			System.out.println("FindSum(int a,int b) in MyInteger");
			return a+b;
	}
}
public class Jtc2 {
	public static void main(String[] args) {
		/*Hai hai1=(a,b)->{
			int c=a+b;
			System.out.println("Sum of a and b  :"+c);
		};
		*/
		Hai hai1=(str)->{
			//int c=a+b;
			System.out.println("test(String str) in Hai : "+str);
		};
		hai1.test("jtc ");
		
		System.out.println("hai1**********\n");
		Hai hai2=System.out::println;
		hai2.test("Hai testing Println");//println ka inmplementation to test() Hai.
		
		System.out.println("Hello***********\n");
		Hello1 h1=(a,b)->{
			int c=a+b;
			System.out.println("Sum of a and b  :"+c);
			return c;
		};
		MyInteger1 mi=new MyInteger1();
		h1.test(111, 222);
		Hello h2=mi::findSum;
		
	}

}
