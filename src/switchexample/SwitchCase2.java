package switchexample;

import java.util.Scanner;

public class SwitchCase2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String place = null;
		System.out.println("층수를 누르세요.");
		int floor = sc.nextInt();
		switch(floor) {
		case 1 : place = "약국";
			break;
		case 2 : place = "정형외과";
			break;
		case 3 : place = "피부과";
			break;
		case 4 : place = "치과";
			break;
		case 5 : place = "헬스";
			break;
		default:
			System.out.println("잘못눌렀습니다.");
		}
		if(place != null) { 
		System.out.println(floor + "층에는 " + place + "가 있습니다.");
		}
	}
}
