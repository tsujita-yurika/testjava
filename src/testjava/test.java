package testjava;

public class test {

//DNAの記号をランダムに表示する
	public static void main(String[] args) {
		int[] seq = new int[10];

//	塩基配列をランダムに育成
		for(int i = 0; i < seq.length; i++) {
			seq[i] = new java.util.Random().nextInt(4);
		}
		
//	育成した塩基配列の記号を表示
		for(int i = 0; i < seq.length; i++) {
			char[] base = {'A', 'T', 'G', 'C'};
			System.out.print(base[seq[i]] + " ");
//		★17行目の内容
//		int baseType = seq[i];	i番目の数字を取得
//		char baseChar = base[baseType];　数値に対応する記号を取得
//		System.out.print(baseChar + " ");　記号を画面に表示
		}
	}
}