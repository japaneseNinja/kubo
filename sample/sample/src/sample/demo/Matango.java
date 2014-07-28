package sample.demo;

public class Matango {
	
	private int hp;
	private char sufffix;
	private final int LEVEL = 10;
	
	public void run(){
		System.out.println("おばけキノコ"+this.sufffix+"は逃げ出した！");
	}
	
	
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public char getSufffix() {
		return sufffix;
	}
	public void setSufffix(char sufffix) {
		this.sufffix = sufffix;
	}
	public int getLEVEL() {
		return LEVEL;
	}
	
	public Matango(char suffix){
		this.sufffix = suffix;
		hp = 50;
	}
	
	public Matango(){
		this(' ');	
	}

}
