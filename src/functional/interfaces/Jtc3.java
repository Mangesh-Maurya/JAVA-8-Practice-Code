package functional.interfaces;
                  //cmd:-javap java.ulti.function.Consumer
import java.util.*;
import java.util.function.Consumer;
public class Jtc3 {
	public static<T> void printEach(List<T> list, Consumer<T> consumer) {
		for(T obj : list) {
			consumer.accept(obj);
		}
	}
	public static void main(String[] args) {
		Consumer<Number> printNumConsumer=(Number val)->System.out.println(val);
		Consumer<String> printStringConsumer=(String val)->System.out.println(val);
		List<String> names=Arrays.asList("som","rai","jtc","vivek","noida",null,"");
		List<Number> values=Arrays.asList(2727,383,0,0,3783,838);
		printEach(names, printStringConsumer);
		System.out.println("**********\n");
		printEach(values, printNumConsumer);
		
	}

}
