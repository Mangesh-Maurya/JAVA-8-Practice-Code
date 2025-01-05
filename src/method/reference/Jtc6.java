package method.reference;

import java.util.ArrayList;
import java.util.List;

class MyNumber{
	static boolean isEven(int number) {
		//System.out.println("isEven Number ");
		if(number % 2 == 0)
			return true;
		else
			return false;
	}
	static boolean isOdd(int number) {
		//System.out.println("isOdd Number ");
		if(number % 2!= 0)
			return true;
		else 
			return false;
		
	}
}
public class Jtc6 {
	public static void main(String[] args) {
		  List<Integer> mylist=new ArrayList<Integer>();
		  mylist.add(1);
		  mylist.add(2);
		  mylist.add(3);
		  mylist.add(4);
		  mylist.add(8);
		  mylist.add(9);
		  mylist.stream().filter(MyNumber::isEven).forEach(System.out::println);
		  System.out.println("***************\n");
		  mylist.stream().filter(MyNumber::isOdd).forEach(System.out::println);
		  System.out.println("**********\n");
		  mylist.stream().filter(a->a%2==0).forEach(a->System.out.println(a));
		  System.out.println("**********\n");
		  mylist.stream().filter(a->a%2!=0).forEach(a->System.out.println(a));
}

}
