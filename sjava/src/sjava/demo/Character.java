package sjava.demo;

public abstract class  Character {
	int hp;
	
	abstract void run();
	
	public int getHp(){
		return hp;
	}
	
	public void setHp(int hp){
		this.hp = hp;
	}
}
