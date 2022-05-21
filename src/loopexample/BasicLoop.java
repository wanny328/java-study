package loopexample;

import java.util.Scanner;

public class BasicLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int firstNum = 0;
		int secondNum = 0;
		int firstSum = 0;
		int secondSum = 0;
		
		System.out.println("두 자연수 사이의 수의 합 구하기.");
		while(firstNum == secondNum) {
		System.out.println("첫번째 숫자를 입력하세요.");
		firstNum = sc.nextInt();
		System.out.println("두번째 숫자를 입력하세요.");
		secondNum = sc.nextInt();
		if(firstNum == secondNum) {
			System.out.println("두 숫자가 같습니다. 다른 숫자를 다시 입력해주세요.");
		}
		}
		for(int i = 1; i < firstNum; i++) {
			firstSum += i;
		}
		for(int i = 1; i < secondNum; i++) {
			secondSum += i;
		}
		if(firstSum < secondSum) {
			System.out.println("두 숫자 사이의 수의 합은 " + (secondSum - (firstSum + firstNum)) + "입니다.");
		}
		else {
			System.out.println("두 숫자 사이의 수의 합은 " + (firstSum - (secondSum + secondNum)) + "입니다.");
		}
	}
}
