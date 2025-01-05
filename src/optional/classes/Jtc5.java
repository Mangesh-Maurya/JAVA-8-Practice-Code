package optional.classes;

import java.util.Optional;
import java.util.function.*;

public class Jtc5 {
	public static void main(String[] args) {
		/*
		String s1="som";
		Optional<String> op1=Optional.ofNullable(s1);
		Optional op2=op1.filter(input->input.contains("rai"));
		System.out.println(op2);
		*/
		//Map
		String s1="som";
		Optional op1=Optional.ofNullable(s1);
		System.out.println(op1);
	//	Optional<String> op2=op1.map(input->input);
	//	System.out.println(op2);
		
		Optional<String> op2=op1.map(input->new String((String) input).toString());
		System.out.println(op2);
		
	//	Optional<String> op2=op1.map(input->new String((String) input).reverse().toString());
	//	System.out.println(op2);
		}
}
