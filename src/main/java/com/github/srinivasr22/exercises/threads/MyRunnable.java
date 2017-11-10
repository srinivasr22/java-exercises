package com.github.srinivasr22.exercises.threads;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class MyRunnable {
	
	String var1;
	String var2;
	short var3 = 11222;

	public MyRunnable() {
		System.out.println("in constructor");
	}
	
	public void MyRunnable() {
		System.out.println("in call");
	}
	
	public static void main(String... args) {
		Runnable r = () -> System.out.println("Hello");
		new Thread(r).start();
		
		MyInt myInt = () -> true;
		System.out.println(myInt.test());
		
		Predicate<String> hasA = (arg) -> arg.contains("a");
		System.out.println(hasA.test("apple"));
		
		Consumer<String> cons = (arg) -> System.out.println(arg);
		cons.accept("banana");
		
		new MyRunnable().MyRunnable();

	}
}

@FunctionalInterface
interface MyInt{
	public boolean test();
}