package testjava;

public class test {

	public static void main(String[] args) {
		introduceOneself();
	}
	
//	自己紹介メソッド
	public static void introduceOneself() {
//		文字列、整数、浮動小数点、1文字
  	String name = "Minato";
  	int age = 22;
  	double height = 169.9;
  	char zodiac = '辰';
  		System.out.println("私の名前は" + name + "です");
  		System.out.println("歳は" + age + "です");
  		System.out.println("身長は" + height + "です");
  		System.out.println("干支は" + zodiac + "です");
  	}
  }