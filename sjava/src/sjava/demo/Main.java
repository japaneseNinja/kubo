package sjava.demo;

public class Main {
	public static void main(String[] args) {
		SuperHero sh = new SuperHero("久保田");
		SuperHero sh2 = new SuperHero();
		System.out.println(sh.getName());
		System.out.println(sh2.getName());
	}
}
