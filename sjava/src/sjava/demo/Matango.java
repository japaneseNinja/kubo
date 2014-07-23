package sjava.demo;

public class Matango {
	int hp; //HPの宣言
	final int LEVEL = 10; //レベルの初期値を設定
	char suffix;
	
	void run(){
		System.out.println("お化けキノコ" + this.suffix + "は、逃げ出した！");
	}
}
