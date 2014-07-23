package sample.demo;

import java.util.Random;

public class SwitchDemo {

	public static void main(String[] args) {
		System.out.println("おみくじ");
		int i = new Random().nextInt(4) + 1;
		System.out.println(i);
		switch (i) {
		case 1:
			System.out.println("大吉");
			break;
		case 2:
			System.out.println("吉");
			break;
		case 3:
			System.out.println("凶");
			break;
		default:
			System.out.println("大凶");
		}
	}
}
