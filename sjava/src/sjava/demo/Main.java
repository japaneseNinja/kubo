package sjava.demo;



public class Main {
	public static void main(String[] arg){

		System.out.println("Hero,World");

	SuperHero sh = new SuperHero("久保田");
	Hero h = new  Hero();
	System.out.println(sh.getName());
	sh.fly();
	sh.land();
	sh.run();
	h.run();

	}
}
