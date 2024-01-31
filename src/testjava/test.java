package testjava;

public class test {

//	配列を複数の変数で参照する
//	arrayBはarrayAと同じ配列を参照する
	public static void main(String[] args) {
		int[] arrayA = {1, 2, 3};
		int[] arrayB;
		arrayB = arrayA;
		arrayB[0] = 100;
		System.out.println(arrayA[0]);
	}
}