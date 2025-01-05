package lambda.expression;
interface I5{
	int m1(int x,int y);
}
public class Test {
	public static void main(String[] args) {
		I5 i1=(x,y)->x+y;
	
	int a=i1.m1(5,6);
	System.out.println(a);
	}
}
