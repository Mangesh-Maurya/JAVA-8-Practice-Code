package stream.Api;

import java.util.Arrays;
import java.util.List;

public class Jtc3 {
	public static void main(String[] args) {
		List<Integer> myList=Arrays.asList(1,2,2,3,4,5,5,6,7,8,9,10,10,11,12,13,14,15,16,17);
		/*
		 * myList.stream().limit(10).forEach(System.out::println);
		 * 
		 * System.out.println(myList);
		 *  System.out.println("*************\n");
		 * myList.stream().limit(10).filter(num->num%2!=0).map(num->num*num).forEach(
		 * System.out::println);
		 */
		
		//multi comment apply shortcut= control+shift+/
		//multi comment remove shortcut= control+shift+\
		
		//myList.stream().skip(4).limit(9).forEach(System.out::println);
		//System.out.println("***************\n");
		//myList.stream().skip(4).limit(9).filter(num->num%2!=0).map(num->num*num).forEach(System.out::println);
		
	//	myList.stream().skip(3).limit(10).peek(System.out::println).
	//	filter(num->num%2!=0).peek(System.out::println).map(num->num*num).forEach(System.out::println);
		
		myList.stream().limit(15).distinct().filter(num->num%2!=0).map(num->num*num).sorted()
		.forEach(System.out::println);
		
	}
}
