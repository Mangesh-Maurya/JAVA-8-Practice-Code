package defaults.method;
interface I11{
	//default void mm1();
	//default abstract void mm2();
	/*
	default static void mm2() {
		
	}*/
	default void mm1() {
		System.out.println("mm1 in I11");
	}
	default void mm2() {
		System.out.println("mm2 in I11");
		mm1();
	}
 
	/* 
	default boolean equals(Object obj) {
		
	}*/
}
class A implements I11{
	
}
public class Day1Thirdpro {
	public static void main(String[] args) {
		A a1=new A();
		a1.mm1();
		a1.mm2();
	}

}
