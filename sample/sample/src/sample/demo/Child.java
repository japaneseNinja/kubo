package sample.demo;

public class Child extends Parent{
	static String str = "子供";
	String str2 = "子供２";

	@Override
	void method(){
		System.out.println("子method");
	}

	static void methodS(){
		System.out.println("子sutatic method");
	}

	void methodC(){
		System.out.println("子プライベート method");
	}
}
