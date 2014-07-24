package sjava.demo;

import java.util.Random;

public class Cleric {
	String name;
	int hp ;
	static final int maxhp = 50;
	int mp ;
	static final int maxmp = 10;
	
	public Cleric(String name,int hp,int mp){
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}
	public Cleric(String name,int hp){
		this(name,hp,Cleric.maxmp);
	}
	public Cleric(String name){
		this(name,Cleric.maxhp);
	}
	
	public void selfAid() {
		this.mp -= 5;
		this.hp = maxhp;
		System.out.println(this.name + "はセルフエイドを唱えた！");
		System.out.println("HPが最大まで回復した！");

	}

	public int pray(int sec) {
		System.out.println(this.name + "は" + sec + "秒祈った！");
		int r = new Random().nextInt(3) + sec;
		int r2 = Math.min(r, Cleric.maxmp - this.mp);
		this.mp += r2;
		System.out.println("MPが" + r2 + "回復した！");
		return r2;
	}
}
