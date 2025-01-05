package method.reference;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

//collection api basics use of method reference

class Hello4{
	public static void show(int x) {
		System.out.println(x);
	}
}
public class Jtc5 {
	public static void main(String[] args) {
		List<Integer> myList=new ArrayList<Integer>();
		myList.add(22);
		myList.add(11);
		
		myList.add(14);
		myList.add(88);
		myList.add(438);
		myList.add(28);
		//1st way of collection class use
		Stream<Integer> mystream =myList.stream();
		 mystream.forEach(Hello4::show);
		 //2nd way static
		 myList.stream().forEach(Hello4::show);
		 //3rd way. Instance Method...
		 myList.stream().forEach(System.out::println);
		 //4. Lambda expression
		 myList.stream().forEach((x)->System.out.println(x));		 
	}

}
