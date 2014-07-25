package sample.demo;

public class Parent {
	static String str = "親";
	String str2 = "親２";


	void method(){
		System.out.println("親method");
	}
	static void methodS(){
		System.out.println("親sutatic method");
	}

	void methodP(){
		System.out.println("親プライベート method");
	}
}
