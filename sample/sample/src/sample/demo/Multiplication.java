package sample.demo;

/**
 * 九九を表示するクラス
 * @author I.Kubota
 *
 */
public class Multiplication {
	public static void main(String[] args){
		int a,b;
		for(a=1;a<=9;a++){
			for(b=1;b<=9;b++){
				System.out.print(a*b);
				System.out.print(" ");
			}System.out.println("");
		}
		
	}

}
