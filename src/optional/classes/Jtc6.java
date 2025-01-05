package optional.classes;

import java.util.ArrayList;
import java.util.Optional;
import java.util.function.Function;

public class Jtc6 {
	public static void main(String[] args) {
		String s1="som";
		Optional<Optional<String>> op1=Optional.of(Optional.ofNullable(s1));
		System.out.println(op1);
		System.out.println(op1.map(input->input));
		System.out.println(op1.flatMap(input->input));
		System.out.println("************\n");
		Optional<Optional<String>> op2=op1.map(input1->input1.map(input2 ->input2.toUpperCase()));
		System.out.println(op2);
		
		//Function fn=input->input;
		//fn.apply("Hello");
		
		
	}

}
