package lambda.expression;
interface I123{
	void m1(int x,int y);
}
public class Jtc3 {
	public static void main(String[] args) {
		I123 i1=(a,b)->System.out.println("hello Everyone :"+a+" the value of b :"+b);
		i1.m1(100,200);
		
		I123 i2=(a,b)->{
			int ab=b-a;
			System.out.println("hello Everyone b-a  :"+ab);
		};
		i2.m1(100,200);
		
		
	}

}
