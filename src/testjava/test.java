package testjava;

public class test {

	public static void main(String[] args) {
		System.out.println("メソッドを呼び出します");
		
//		名前を渡してhelloメソッドを呼び出す
		hello("湊");
		hello("朝香");
		hello("菅原");
		System.out.println("メソッドの呼び出しが終りました");
	}
	public static void hello(String name) {
		System.out.println(name + "さん、こんにちは");
	}
}