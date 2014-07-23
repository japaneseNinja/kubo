package sjava.demo;

public class Hero {
	private String name; // 名前の宣言
	private int hp; // HPの宣言
	static int money;

	Hero(String name) {
		this.name = name;
		this.hp = 100;
		Hero.money = 50;
	}

	Hero() {
		this("名無し");
	}

	void attack(Matango m){
		System.out.println(this.name + "の攻撃！");
		m.hp -=5;

	}

	void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は、眠って回復した！");
	}

	void sit(int sec) {
		this.hp += sec;
		System.out.println(this.name + "は" + sec + "秒すわった！");
		System.out.println("HPが" + sec + "ポイント回復した！");
	}

	void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は、転んだ！");
		System.out.println("5のダメージ");
	}

	void run() {
		System.out.println(this.name + "は逃げ出した！");
		System.out.println("GAME OVER");
		System.out.println("最終HPは" + this.hp + "でした");

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {

		if(name.length() >6){
			throw new IllegalArgumentException("名前は５文字以内で。処理を中断");
		}
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

}
