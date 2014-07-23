package sjava.demo;

public class Main {

	public static void main(String[] args) {
		// 1.勇者を生成
				Hero h ;
				h = new Hero("久保田");
				h.hp = 100;
				System.out.println("名前 " + h.name);
				System.out.println("HP "+ h.hp);
				System.out.println("所持金 " + Hero.money);
	}
}
