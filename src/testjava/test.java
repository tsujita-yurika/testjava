package testjava;

public class test {

	public static void main(String[] args) {
		int[] moneyList = {121902, 8302, 55100};
		for (int i = 0; i < moneyList.length; i++) {
			System.out.println(moneyList[i]);
			}
//	拡張forループを使って、moneyList配列の全ての要素を順番に出力
		for (int m:moneyList) {
			System.out.println(m);
			}
		}
	}