package loopexample;

import java.util.Scanner;

public class StarDiamond {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("input diamond height(only odd number)");
	    int lineNum = sc.nextInt();
	    lineNum = lineNum / 2 + 1;
	    
	    for(int i = 1; i <= lineNum; i++) {
	       for(int j = 1; j <= lineNum - i; j++) {
	          System.out.print(" ");
	       }
	       for(int k = 1; k <= (2 * i - 1); k++) {
	          System.out.print("*");
	       }
	       System.out.println();
	    }
	    
	    for(int i = lineNum - 1; i >= 1; i--) {
		       for(int j = lineNum - i; j >= 1; j--) {
		          System.out.print(" ");
		       }
		       for(int k = (2 * i - 1); k >= 1; k--) {
		          System.out.print("*");
		       }
		       System.out.println();
		    }
	}
}
