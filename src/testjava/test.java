package testjava;

public class test {

	public static void main(String[] args) {
//		配列の準備
		int [] numbers = {3, 4, 9};
		
//		メッセージの表示
		System.out.println("１桁の数字を入力してください");
		
//		キーボードからの数字入力
		int input = new java.util.Scanner(System.in).nextInt();
		
//		配列を回しながら判定
		for(int n : numbers) {
			if(n == input) {
				System.out.println("アタリ！");

			}
		}
	}
}