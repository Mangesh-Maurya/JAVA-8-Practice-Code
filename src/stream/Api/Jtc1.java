package stream.Api;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Jtc1 {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9);
		System.out.println(list);
		Stream<Integer> stream1=list.stream();
		System.out.println(stream1);
		Stream<Integer> stream2=stream1.filter(input->input%2!=0);
		System.out.println(stream2);
		stream2.forEach(System.out::println);
		
		list.stream().filter(input1->input1%2==0).map(input1->input1).forEach(System.out::println);
		System.out.println(list);
		
		//Stream s1=list.stream();
		//si=s1.filter(input1->input1%2==0);
	}
}
