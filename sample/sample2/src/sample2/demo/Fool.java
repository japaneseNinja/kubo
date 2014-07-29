package sample2.demo;

public class Fool extends Character implements Human{

	public void attack (Monster m){
		System.out.println(getName()+"は戦わず遊んだ！");
	}

	public void talk(){
		System.out.println("しゃべった！");
	}

	public void kokyu(){
		System.out.println("腹式呼吸！");
	}

}
