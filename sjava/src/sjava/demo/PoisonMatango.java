package sjava.demo;

public class PoisonMatango extends Matango {
	
	private int poisoncnt = 5;
	public void attack(Hero h){
		super.attack(h);
		if(poisoncnt>0){
			System.out.println("さらに胞子をばらまいた！");
			int dmg = h.getHp()/5;
			h.setHp(h.getHp()-dmg);
			System.out.println(dmg+"のダメージ！");
			poisoncnt--;
		}
	}
	
	public PoisonMatango(char suffix){
		super(suffix);
	}

}
