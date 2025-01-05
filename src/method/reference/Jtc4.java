package method.reference;
import java.util.*;
@FunctionalInterface
interface Hello3{
	void test(int arr[]);
}
public class Jtc4 {
	public static void main(String[] args) {
		System.out.println("Method Ref.******\n");
		int myarr2[]= {33,44,55,2,12,33};//VERY VERY IMPORTANT
		Hello3 h2=Arrays::sort;
		h2.test(myarr2);
		
		for(int a:myarr2) {
		System.out.println(a);
		}
		System.out.println("lambda Exp.***\n");
		int myarr1[]= {11,22,29,30,40};
		
		Hello3 h1=(arr)->{
			for(int i=0;i<arr.length-1;i++) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]>arr[j]) {
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
		};
		h1.test(myarr1);
		for(int b:myarr1) {
			System.out.println(b);
		}
	}
}
