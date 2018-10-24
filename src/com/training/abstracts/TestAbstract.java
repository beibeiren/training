package com.training.abstracts;

public class TestAbstract {

	public static void main(String[] args) {
		// AbstractClass ac = new AbstractClass();
		AbstractClass ac2 = null;
		AbstractClass ac3 = new SubAbstract();
		try {
			ac2.eatSomething();
		} catch (Exception e) {
			System.out.println("info: "+ e.getMessage());
			e.printStackTrace();
		}finally{
			System.out.println("exception is chuli");
		}
		
	}
	
}
