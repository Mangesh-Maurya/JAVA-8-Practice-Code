package lambda.expression;
@FunctionalInterface
interface I1234{
	int m1(int a,int b);
	
}
public class Jtc4 {
	public static void main(String[] args) {
		I1234 i1=(a,b)->{
			System.out.println("int M1(int a,int b)");
			return a+b;
		};
		int x=i1.m1(99,88);
		System.out.println(x);
		System.out.println("************\n");
		I1234 i2=(int a,int b)->a+b;
		int y=i2.m1( 111,222);
		System.out.println(y);
	}

}
