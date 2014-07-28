package sample.demo;

public class Hero {
	private String name;
	private int hp;
	
	public void sleep(){
		setHp(100);
		System.out.println(this.name+"は眠って回復した！");
	}
	
	public void sit(int sec){
		hp += sec;
		System.out.println(this.name+"は座って"+sec+"ポイント回復した！");
	}
	
	public void slip(){
		hp -= 5;
		System.out.println(getName()+"は転んだ！");
		System.out.println("5ポイントのダメージ！");
	}
	
	public void run(){
		System.out.println(getName()+"は逃げ出した！");
		System.out.println("GAME OVER");
		System.out.println("最終HPは"+getHp()+"でした！");
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public int getHp(){
		return hp;
	}
	
	public void setHp(int hp){
		this.hp = hp;
	}
	
	public Hero(String name){
		this.name = name;
		hp = 100;
	}
	
	public Hero(){
		this("名無し");
	}

}
