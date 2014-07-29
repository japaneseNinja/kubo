package sample2.demo;

public  abstract class Character {
	
	private String name;
	private int hp;
	
	public void run(){
		System.out.println(this.name + "は逃げ出した！");
	}
	
	public abstract void attack (Monster m);
	
	public Character(String name){
		this.name = name;
		this.hp =100;
	}
	
	public Character(){
		this("名無し");
	}

	public String getName() {return name;}

	public void setName(String name) {this.name = name;}

	public int getHp() {return hp;}

	public void setHp(int hp) {this.hp = hp;}

}
