package sjava.demo;

public class Hero {
	String name;
	int hp;
	Sword sword;
	static int money;
	
	static void randommoneyset(){
		Hero.money = (int)(Math.random() * 1000);
	}
	
	public void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は眠って回復した！");
	}

	public void sit(int sec){
		this.hp += sec;
		System.out.println(this.name +"は"+ sec + "秒すわった！" );
		System.out.println("HPが" +sec+ "ポイント回復した！");
	}

	public void run(){
		System.out.println(this.name+"は逃げ出した！");
		System.out.println("GAME OVER");
		System.out.println("最終HPは" +this.hp+ "でした！");
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
	
	Hero(String name){
		this.hp = 100;
		this.name = name;
	}
	
	Hero(){
		this("名無し");
	}
}

