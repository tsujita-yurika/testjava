package testjava;

public class test {

	public static void main(String[] args) {
		int[] arr = new int[20];
    for (int i = 0; i < arr.length; i++) {
        arr[i] = i * 5;
    }
    String odd = "";
    String even = "";
    for (int i = 0; i < arr.length; i++) {
        if (i <= 10 && arr[i] % 2 != 0) {
            odd += arr[i] + ",";
        } else if (i > 10 && arr[i] % 2 == 0) {
            even += arr[i] + ",";
        }
    }
    System.out.println("奇数 : " + odd.substring(0, odd.length() - 1));
    System.out.println("偶数 : " + even.substring(0, even.length() - 1));
	}	
}
//1～10までの偶数の数は5
//1～10までの偶数の合計は30
