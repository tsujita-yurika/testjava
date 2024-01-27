package testjava;

import java.util.Arrays;

public class test {

	public static void main(String[] args) {
//	配列のすべての要素に同じ値をセット
    int[] foo = new int[3];

    Arrays.fill(foo, 5);

    System.out.println(foo[0]);
    System.out.println(foo[1]);
    System.out.println(foo[2]);
	  }
	}	
