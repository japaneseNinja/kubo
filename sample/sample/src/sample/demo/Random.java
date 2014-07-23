package sample.demo;

public class Random {
	public static void main(String[] args){
		int [] arr = new int[10];
		int a, b;
		int c;
		int f = 0;
		int cnt = 0;

		arr[0] = new java.util.Random().nextInt(10)+1;
		cnt++;

		for (a = 1; a < 10; a++) {
			do {
				f = 0;
				cnt++;
				arr[a] = new java.util.Random().nextInt(10)+1;
				for (b = 0; b < a; b++) {
					if (arr[a] == arr[b]) {
						f = 1;
						break;
					}
				}
			} while (f == 1);
		}

		for (c = 0; c < 10; c++) {
			System.out.println(arr[c]);
			;
		}
		System.out.println("実行回数" + cnt);
	}
}
