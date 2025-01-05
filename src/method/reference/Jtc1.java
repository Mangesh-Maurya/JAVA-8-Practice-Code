package method.reference;
@FunctionalInterface
interface Hello{
	int test(int a,int b);
}
class MyInteger{
	public static int findSum(int a,int b) {
		System.out.println("FindSum(int a,int b)in MyInteger");
		return a+b;
	}
}
public class Jtc1 {
	public static void main(String[] args) {
		System.out.println("Main in Jtc1");
		Hello h1 = (a, b)->{
			int c = a + b;
			System.out.println("test in Jtc1");
			return c;
		};
		int i=h1.test(100,200);
		System.out.println(i);
		System.out.println("******static Method Ref********\n");
		Hello h2=MyInteger::findSum;
		h2.test(11, 22);
		
		Hello h3=MyInteger::findSum;//jitni baar chaho utni baar use kro
	} 

}
