package sjava.demo;

public class Hero {
	private String name;
	private int hp;
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
	}

	private void die(){
		System.out.println(this.name + "は死んでしまった！");
		System.out.println("GAME OVER");
	}

	public void attack(Matango m){
		System.out.println(this.name + "の攻撃！お化けキノコ" +m.suffix+ "に5のダメージ！");
		System.out.println("お化けキノコ" +m.suffix+ "の反撃で2のダメージ！");
		this.hp -= 2;
		m.hp -= 5;
		if(this.hp<=0){
			this.die();
		}
	}

	public String getName(){
		return this.name;
	}

	Hero(String name){
		this.hp = 100;
		this.name = name;
	}

	Hero(){
		this("名無し");
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public void setName(String name) {

		if(name == null){
			throw new IllegalArgumentException("名前がNULLである。処理を中断！");
		}

		if(name.length() <=1){
			throw new IllegalArgumentException("名前が短かすぎる。処理を中断！");
		}

		if(name.length()>=8){
			throw new IllegalArgumentException("名前が長すぎる。処理を中断！");
		}

		this.name = name;
	}
}

