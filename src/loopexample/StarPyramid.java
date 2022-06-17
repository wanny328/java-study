package loopexample;

import java.util.Scanner;

public class StarPyramid {
//13579
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("input pyramid height");
	    int lineNum = sc.nextInt();
	      
	    for(int i = 1; i <= lineNum; i++) {
	       for(int j = 1; j <= lineNum - i; j++) {
	          System.out.print(" ");
	       }
	       for(int k = 1; k <= (2 * i - 1); k++) {
	          System.out.print("*");
	       }
	       System.out.println();
	    }
	}
}