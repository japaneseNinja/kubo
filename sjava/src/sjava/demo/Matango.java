package sjava.demo;

public class Matango{
	int hp = 100;
	char suffix ;
	
	public Matango(char suffix){
		this.suffix = suffix;
	}
	
	public void attack(Hero h){
		System.out.println("キノコ"+this.suffix+"の攻撃！");
		System.out.println("10のダメージ！");
		h.setHp(h.getHp() -10);
	}
}
