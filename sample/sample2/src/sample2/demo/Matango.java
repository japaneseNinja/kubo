package sample2.demo;

public class Matango extends Monster {

	 char suffix;

	 public void attack(){
		 System.out.println("キノコ胞子！");
	 }

	 public void run(){
		 System.out.println("キノコ的な逃げ方をした！");
	 }
	public char getSuffix() {
		return suffix;
	}
	public void setSuffix(char suffix) {
		this.suffix = suffix;
	}



}
