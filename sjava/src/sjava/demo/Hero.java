package sjava.demo;

public class Hero {
	String name; //名前の宣言
	int hp; //HPの宣言
	static int money;
	
	Hero(String name){
		this.name = name;
		this.hp = 100;
		Hero.money = 50;
	}
	
	Hero(){
		this("名無し");
	}
	
	void sleep(){
		this.hp =100;
		System.out.println(this.name  + "は、眠って回復した！");
	}
	
	void sit(int sec){
		this.hp += sec;
		System.out.println(this.name + "は" + sec + "秒すわった！");
		System.out.println("HPが" + sec + "ポイント回復した！");
	}
	
	void slip(){
		this.hp -=5;
		System.out.println(this.name + "は、転んだ！");
		System.out.println("5のダメージ");
	}
	
	void run(){
		System.out.println(this.name + "は逃げ出した！");
		System.out.println("GAME OVER");
		System.out.println("最終HPは" + this.hp + "でした");
		
	}


}
