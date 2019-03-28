package com.dxc.dp.creational;

public class MyGaFactory {
	
	
	public Object getClothtype(String type) {
		
		if(type=="Children") {
			
			return new ChildernCloths;
		}
		
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


class Childer