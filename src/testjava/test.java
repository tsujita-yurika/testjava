package testjava;

public class test {

	public static void main(String[] args) {
//		String[] names = {"佐藤","鈴木","高橋"};
//	  for (int x = 0;x < 3;x++){
//	  System.out.println("名前は"+names[x]+"です");
		
		String[] names = {"佐藤","鈴木","高橋"};
	  System.out.println("名前は"+names[0]+"です");
	  names[0] = "木村";
	  System.out.println("名前は"+names[0]+"です");
	  System.out.println("名前は"+names[1]+"です");
	  names[1] = "田中";
	  System.out.println("名前は"+names[1]+"です");
		}
	}
//}