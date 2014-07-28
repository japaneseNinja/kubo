package sample.demo;

public class Cleric {
	private String name;
	private int hp=50;
	private int mp=10;
	private final int maxhp =50;
	private final int maxmp =10;
	
	public void selfAid(){
		this.hp = maxhp;
		this.mp -=5;
		System.out.println(this.name+"はセルフエイドを唱えてHP全回復！");
	}
	
	public int pray(int sec){
		int kaifuku= new  java.util.Random().nextInt(3) + sec;
		int jissai = Math.min(kaifuku, maxmp-this.mp);
		
		System.out.println(this.name+"は祈って"+jissai+"ポイントMP回復！");
		return jissai;		
	}
	
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
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	public int getMaxhp() {
		return maxhp;
	}
	public int getMaxmp() {
		return maxmp;
	}
	
	public Cleric(String name){
		this.name = name;
	}
	
	public Cleric(){
		this("名無しCleric");
	}
	

}
