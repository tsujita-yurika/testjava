package testjava;

public class test {

	public static void main(String[] args) {
//	int 型のデータを格納する配列を格納する 2 次元配列を作成
    int[][] num = new int[2][];

//  要素に対してそれぞれ値を格納
    num[0] = new int[3];
    num[0][0] = 78;
    num[0][1] = 64;
    num[0][2] = 59;

    num[1] = new int[3];
    num[1][0] = 58;
    num[1][1] = 92;
    num[1][2] = 82;
    
//  すべての要素の値を順番に参照して出力
    for (int i = 0; i < 2; i++){
      for (int j = 0; j < 3; j++){
        System.out.println("num[" + i + "][" + j + "] = " + num[i][j]);
			}
		}
	}
}