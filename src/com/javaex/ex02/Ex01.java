package com.javaex.ex02;

public class Ex01 {

	public static void main(String[] args) {
		
		Thread t01 = new DigitThread();
		Thread t02 = new LowerThread();
		Thread t03 = new UpperThread();
		
		
		t01.start();
		t02.start();
		t03.start();
		
		/*
		t01.run();
		t02.run();
		t03.run();
		*/
	}
}
