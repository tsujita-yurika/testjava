package testjava;

public class test {

	public static void main(String[] args) {
//	1～10を順番に取り出す
		for(int i =1; i <= 10; i++) {
//		iを出力
			System.out.print(i);
//			10にはカンマを付けない
				if(i != 10) {
//				それ以外はカンマを出力
					System.out.print(",");
			}	
		}
	}
}