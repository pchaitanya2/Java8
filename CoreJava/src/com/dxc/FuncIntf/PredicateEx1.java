package com.dxc.FuncIntf;

import java.util.function.BiFunction;
import java.util.function.Predicate;

//Predicate Interface def
/*public interface Predicate<T> {
	
	  public boolean test(T t);
}*/

public class PredicateEx1 {
	Predicate<Integer> oddNumber = (Num) -> Num % 2==0;
	
	public static void main(String args[]) {
	
		BiFunction<Integer, Integer, Integer> bif= (a,b)-> a+b;
		System.out::println(bif.apply(2, 5));
	//	System.out.println((2,5)->2+5); 
		
		

	
	}
	
	//BiFunction<Integer, Integer, Integer> bif= (a,b)-> a+b;
	


}
