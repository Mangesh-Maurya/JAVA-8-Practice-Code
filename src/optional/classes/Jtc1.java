package optional.classes;
              //empty()  Method
import java.util.Optional;

public class Jtc1 {
	public static void main(String[] args) {
		//Optional op=new Optional();
		Optional<String> op1=Optional.empty();
		System.out.println(op1);
		//System.out.println(op1.get());
		
		System.out.println(op1.toString());
		Optional op2=Optional.empty();
		System.out.println(op2.hashCode());
		System.out.println(op1.hashCode());
		System.out.println("************\n");
		Optional<String> op3=Optional.empty();
		System.out.println(op3);
		System.out.println(op3.orElse("JTC1"));
		System.out.println(op3);
		System.out.println(op3.isPresent());
		//System.out.println(op3.get());
		if(op3.isPresent()) {
			System.out.println(op3.get());
		}else {
			System.out.println("No value is Found");
		}
	}
}
