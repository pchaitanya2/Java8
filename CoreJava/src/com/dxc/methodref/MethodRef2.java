package com.dxc.methodref;



interface TriFunction<T, U, V, R> {
	  R apply(T t, U u, V v);
	}

class Sum {
	  Integer doSum(String s1, String s2) {
	    return Integer.parseInt(s1) + Integer.parseInt(s1);
	  }
	}





public class MethodRef2 {

	public static void main(String[] args) {
		TriFunction<Sum, String, String, Integer> anon =
				new TriFunction<Sum, String, String, Integer>() {
				  @Override
				  public Integer apply(Sum s, String arg1, String arg2) {
				    return s.doSum(arg1, arg1);
				  }
				};
				System.out.println(anon.apply(new Sum(), "3", "5"));

	}

}
