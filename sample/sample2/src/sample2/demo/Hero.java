package sample2.demo;

public class Hero extends Character {

	public void attack(Monster m){
		System.out.println(super.getName()+"の攻撃！敵に5のダメージ！");
		m.setHp(m.getHp()-5);
	}

	public Hero(String name){
		super(name);
	}

	public Hero(){
		super();
	}

}
