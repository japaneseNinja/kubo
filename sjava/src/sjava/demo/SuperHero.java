package sjava.demo;

public class SuperHero extends Hero{
	static int money;

	private boolean flying;

	SuperHero(String name) {
		super(name);
	}

	SuperHero() {
		super();
	}

	void fly(){
		this.flying = true;
		System.out.println("飛んだ！");
	}

	void land(){
		this.flying = false;
		System.out.println("着地した！");
	}
	void run(){
		System.out.println("スーパーヒーロー撤退！");
	}

	void attack(Matango m){
		super.attack(m);
		if(this.flying){
			super.attack(m);
		}
	}

}