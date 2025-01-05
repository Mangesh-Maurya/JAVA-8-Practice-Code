package optional.classes;

import java.util.Optional;

public class Jtc4 {
	public static void main(String[] args) {
		//String s1=null;
		String s1="Hello JTC Student";
		Optional<String> op1=Optional.ofNullable(s1);
		if(op1.isPresent()) {
			System.out.println(op1.get());
		}
		System.out.println("**************\n");
		//we are trying to use The Functional Interface.
		op1.ifPresent(input->System.out.println(input));
		
		if(op1.isPresent()) {
			System.out.println(op1.get().toUpperCase());
		}
		
		op1.ifPresent(input->System.out.println(input.toUpperCase()));
	}
}
