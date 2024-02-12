package testjava;

public class test {

  public static void main(String[] args){
  	test robot = new test();
  	robot.greeting("Hello");
  	robot.greeting("Bye");
  }
  
  void greeting(String msg) {
  	System.out.println(msg);
  }
}