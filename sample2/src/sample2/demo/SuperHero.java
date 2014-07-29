package sample2.demo;

public class SuperHero extends Hero {
	
	boolean flying;
	
	public void fly(){
		flying = true;
		System.out.println(getName()+"は飛び上がった");
	}
	
	public void land(){
		flying = false;
		System.out.println(getName()+"は着地した！");
	}
	
	public void run(){
		System.out.println("スーパー"+getName()+"は撤退した！");
	}
	
	public SuperHero(String name){
		super(name);
	}
	
	public SuperHero(){
		super();
	}

}
