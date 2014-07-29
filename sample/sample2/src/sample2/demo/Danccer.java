package sample2.demo;

public class Danccer extends Character {

	public void dance(){
		System.out.println(getName() + "は踊った");
	}

	public void attack(Monster m){
		System.out.println(getName() + "の攻撃！");
		System.out.println("敵に3ポイントのダメージ！");
		m.setHp(m.getHp()-3);
	}

}
