package sample2.demo;

public abstract class Monster {
	
	private String name;
	private int hp;
	
	public abstract void attack();
	public abstract void run();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	

}
