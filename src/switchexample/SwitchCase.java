package switchexample;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("등수를 입력하세요.");
		int ranking = sc.nextInt();		
		String medalColor = null;
		
		switch(ranking) {
			case 1 : medalColor = "Gold";
					break;
			case 2 : medalColor = "Silver";
					break;
			case 3 : medalColor = "Bronze";
					break;
			default:
					medalColor = "No medal";
		}
		if(medalColor.equals("No medal")) {
			System.out.println(ranking + "등은 메달이 없습니다.");
		}
		else {
			System.out.println(ranking + "등 메달의 색깔은 " + medalColor + "입니다.");
		}
	}

}
