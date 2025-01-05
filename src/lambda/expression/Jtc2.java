package lambda.expression;
interface I12{
	void m1(String s1);
}
public class Jtc2 {
	public static void main(String[] args) {
		I12 i1=(s1)->{
			System.out.println("M1(String s1) in JTC2     "+s1 );
		};
		//i1.m1(1234);//iska parammeter match nhi kr rha h
		i1.m1("JTC");
		
		I12 i2=(String s1)->{
			System.out.println("*********"+s1);
		};
		i2.m1("Hello jtc");
	}

}
