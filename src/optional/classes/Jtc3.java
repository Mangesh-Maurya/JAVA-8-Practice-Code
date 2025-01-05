package optional.classes;

import java.util.Optional;

public class Jtc3 {
	public static void main(String[] args) {
		Optional<String> op1=Optional.ofNullable(null);
		System.out.println(op1);
		System.out.println(op1.orElse("hai JTC"));
		System.out.println(op1);
		System.out.println(op1.isPresent());
		System.out.println(op1.get());
		if(op1.isPresent()) {
			System.out.println(op1.get());
		}else {
			System.out.println("No value Found");
		}
	}

}
