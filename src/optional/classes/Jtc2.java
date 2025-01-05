package optional.classes;

import java.util.Optional;

public class Jtc2 {
	public static void main(String[] args) {
		//of Method
		String s1="jtc";
		//Optional<String> op1=Optional.of(1234);
		Optional<String> op1=Optional.of(s1);
		System.out.println(op1);
		System.out.println(op1.orElse("jtc123445"));
		System.out.println(op1);
		System.out.println(op1.isPresent());
		System.out.println(op1.get());
		if(op1.isPresent()) {
			System.out.println(op1.get());
		}else {
			System.out.println("No value Found");
		}
		System.out.println("**********************\n");
		String s2=null;
		//Optional<String> op2=Optional.of(s2);
		//System.out.println(op2);
		
	}

}
