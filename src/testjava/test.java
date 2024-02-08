package testjava;

public class test {

//	1つ目のaddメソッド
	public static int add(int x, int y) {
		return x + y;
	}
//　２つ目のaddメソッド
	public static int add(int x, int y, int z) {
		return x + y + z;
	}
//　３つ目のaddメソッド
	public static void main(String[] args) {
		System.out.println("10 + 20 = " + add(10, 20));
		System.out.println("10 + 20 + 30 = " + add(10, 20, 30));
	}
}
	