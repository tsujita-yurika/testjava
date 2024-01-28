package testjava;

public class test {

	public static void main(String[] args) {
//	配列arrを宣言し、初期化
    int arr[] = new int[] {12, 34, 45, 21, 33, 4};

//  変数sumを宣言し、0で初期化
    int sum = 0;

//  配列arrの要素を合計
//  iはループ変数で、arr.lengthは配列arrの要素数
//  i=0のとき、sumに12を加算～i=5のとき、sumに4を加算
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
//  合計値を出力
    System.out.println("Array Sum = " + sum);
	  }
	}