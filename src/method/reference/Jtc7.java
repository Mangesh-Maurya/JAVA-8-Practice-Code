package method.reference;

import java.util.ArrayList;
import java.util.List;

public class Jtc7 {
	public static void main(String[] args) {
		  List<Integer> mylist=new ArrayList<Integer>();
		  mylist.add(1);
		  mylist.add(2);
		  mylist.add(3);
		  mylist.add(4);
		  mylist.add(8);
		  mylist.add(9);
		  mylist.stream().filter(a->a%2==0).map(a->a*a).forEach(a->System.out.println(a));
		  
		  mylist.stream().filter(a->a%2!=0).map(a->a*a).forEach(a->System.out.println(a));
	}

}
