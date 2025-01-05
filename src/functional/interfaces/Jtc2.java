package functional.interfaces;

import java.util.*;
import java.util.function.*;

public class Jtc2 {
	public static void main(String[] args) {

	List<String> names=Arrays.asList("som","rai","jtc","vivek","noida",null);
	Predicate<String> nonEmpltyString=(s)->s != null && !s.isEmpty();
	System.out.println(filter(names,nonEmpltyString));
	
	//kya hm method refernce use kr sakte h?
	//Ans:- definatly we can use it.
	
	}
	public static <T> List<T> filter(List<T> list,Predicate<T> predicate){
		List<T> result=new ArrayList<>();
		for(T obj:list) {
			if(predicate.test(obj));
			result.add(obj);
		}
		return result;
		
		
	}
}
