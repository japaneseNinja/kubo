package sjava.demo;

public class SuperHero extends Hero {
	private boolean flying;

	public void fly(){
		flying = true;
		System.out.println("飛び上がった！");
	}

	public void land(){
		flying = false;
		System.out.println("着地した！");
	}

	public void run(){
		System.out.println(super.getName()+"は撤退した！");
	}
	
	public void attack(Matango m){
		super.attack(m);
		if(this.flying==true){
			super.attack(m);
		}
	}
//	コンストラクタ
	public SuperHero(String name){
		super(name);
	}

	public SuperHero(){
		super("名無し");
	}

}
