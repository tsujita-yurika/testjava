package testjava;

public class test {

	public static void main(String[] args) {
//	拡張for文
		int[]scores = {20, 30, 40, 50, 80};
		for (int value : scores) {
			System.out.println(value);
		}
	}
}
		
	//従来のfor文
//		int[] scores = {20, 30, 40, 50, 80};
//		for (int i = 0; i < scores.length; i++) {
//			System.out.println(scores[i]);
//		}
//	}
//}