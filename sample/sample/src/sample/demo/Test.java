package sample.demo;

public class Test {
	public static void main(String[] args){

		Parent p = new Child();
		System.out.println(p.str);
		System.out.println(p.str2);
		p.method();
		Child c = (Child)p;
		System.out.println(c.str);
		System.out.println(c.str2);
		c.method();
	}
}
