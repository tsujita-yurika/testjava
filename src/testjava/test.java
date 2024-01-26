package testjava;

public class test {

	public static void main(String[] args) {
//	 int 型の配列を宣言し、 3 つの要素を持つ配列を作成
	   int[] neko = new int[5];

//	  配列のそれぞれの要素に対して数値を代入
	    neko[0] = 10;
	    neko[1] = 12;
	    neko[2] = 20;
	    neko[3] = 10;
	    neko[4] = 15;

//	  for 文を使って順に取り出して表示
	    for (int i = 0 ; i < 3 ; i++){
	      System.out.println(neko[i]);
	  }
	}	
}
