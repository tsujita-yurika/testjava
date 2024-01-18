package testjava;

public class test {

	public static void main(String[] args) {
//		cntとsumを初期化
		int cnt = 0; //⭐️
		int sum = 0;
//		forループを使って1から10までの数字を順番に取り出し、その数字が偶数かどうかを判定
		for(int i = 1; i<= 10; i++) {
			if(i % 2 == 0) {
//				もし偶数だった場合、sumにその数字を加算し、cntを1増やす
				cnt++; //⭐️
				sum += i;
			}
		}	
//		偶数の合計と偶数の個数を出力
		System.out.println("1～10までの偶数の個数は" + cnt); //⭐️
		System.out.println("1～10までの偶数の合計は" + sum);
		}
	}

		