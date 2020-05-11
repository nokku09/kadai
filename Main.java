import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		System.out.println("<<回文判定プログラム>>");
		System.out.println("半角のアルファベットを入力してください");
		
		String a = scanner.next();
		int n= a.length();
		int tf = 0;
		
		char[] c = a.toCharArray();
		
		for(int i = 0 ;i<n;i++) {
			if (!(c[i]==c[n-1-i])) {
				tf= tf +1;		
			}
		}
		if(tf == 0) {
		System.out.println("回文です");
		}else
		System.out.println("回文ではありません");

	}

}