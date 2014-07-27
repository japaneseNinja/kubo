package sjava.demo;

public class Main {
	public static void main(String[] arg) {

		SuperHero sh = new SuperHero("クボタ");
		PoisonMatango pm = new PoisonMatango('A');
		pm.attack(sh);
		pm.attack(sh);
	}
}
