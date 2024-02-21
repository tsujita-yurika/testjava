package testjava;

public class test {

	public static void main(String[] args) {
		String msg1 = "こんにちは";
		String msg2 = msg1;

		msg2 = "さようなら";
		msg2 = "おはよう";
		
		System.out.println(msg1);
		System.out.println(msg2);
		}
	}