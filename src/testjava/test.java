package testjava;

public class test {

	public static void main(String[] args) {
//		配列には要素を追加する方法がないので、
//		要素数を大きくした配列を用意し、Systemクラスのarraycopyメソッドを使って値をコピーする
		
		int[] foo = { 5, 3, 6, 8, 2, 5, 9, 2, 4, 1 }; // 元の配列
		int[] bar = new int[15]; // データを5個追加したい場合に用意する配列

		// foo配列の最初の10個の値をbar配列にコピー
//		foo, 0の0は、配列の最初の要素
		System.arraycopy(foo, 0, bar, 0, 10);

		// 配列barを表示
		for (int i = 0; i < bar.length; i++) {
			System.out.print(bar[i] + ", ");
			}
	  }
	}	