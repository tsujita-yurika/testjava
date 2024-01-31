package testjava;

public class test {

	public static void main(String[] args) {
			int[] array = {1, 2, 3};
//		変数にnullを代入。どこも参照していない状態になる
			array = null;
			array[0] = 10;
		}
	}