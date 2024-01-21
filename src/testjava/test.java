package testjava;

public class test {

	public static void main(String[] args) {
		int cnt = 0;
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				cnt++;
				sum += i;
			}
		}
		    System.out.println("1～10までの偶数の数は" + cnt + "個");
				System.out.println("1～10までの偶数の合計は" + sum + "個");
	}
}
	