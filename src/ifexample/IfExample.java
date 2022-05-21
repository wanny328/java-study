package ifexample;

import java.util.Scanner;

public class IfExample {

	public static void main(String[] args) {
		int age;
		String stop = "go";
		int check = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(stop.equals("go")) {
			System.out.println("나이를 입력하세요.");
			age = sc.nextInt();
			
			if(age >= 30) {
				System.out.println("아저씨 입니다.");
			}
			else {
				System.out.println("청춘 입니다.");
			}
			while(check == 1);
				System.out.println("계속하려면 'go'를 입력하세요.");
				stop = sc.next();
				if(stop.equals("go")) {
					check = 0;
				}
				else if(stop.equals("stop")) {
					check = 0;
				}
				else {
					System.out.println("다시 입력하세요.");
					stop = sc.next();
				}
		}
	}
}
