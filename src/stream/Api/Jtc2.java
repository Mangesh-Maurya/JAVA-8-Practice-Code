package stream.Api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Jtc2 {
	public static void main(String[] args) {
		List<Integer> numList=Arrays.asList(1,2,3,4,5,6,7,8);
		//Stream<Integer> mystr1=numList.stream();
		
		//System.out.println(mystr1);
		//mystr1.forEach(System.out::println);//method reference use karke method ko call kr liye
		
		numList.stream().forEach(System.out::println);
		
		System.out.println("*************\n");
		numList.parallelStream().forEach(System.out::println);
	}
}
