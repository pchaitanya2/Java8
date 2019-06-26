package com.dxc.lambda;

import java.util.concurrent.Callable;

public class Ex1 {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		execute(()-> System.out.println("done"));

	}
	
	
	public static void execute(Runnable run) {
		System.out.println("Runnable running");
	}
	
	public static void execute(Callable<String> call) {
		
		System.out.println("Callable calling");
		
	}

}
