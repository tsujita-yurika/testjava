package testjava;

public class test {

	public static void main(String[] args) {
//		初期化、繰り返し条件、処理
		for(int i=10; i >= 1; i--){
//			iが偶数である場合
			if(i % 2 == 0){
//				10 8 6 4 2と繰り返し出力されるiにスペースを入れる
//				printlnにすると出力が縦書きになる
				System.out.println(i+" ");
				}
			}
//		空の行を出力する。無くてもここでは結果は同じ
		System.out.println();
		}
	}
