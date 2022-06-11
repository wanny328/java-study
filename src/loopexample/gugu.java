package loopexample;

public class Gugu {
	public static void main(String[] args) {
		System.out.println("짝수단 출력 프로그래밍");
		for(int i = 2; i < 10; i++) {
			if(i % 2 == 1) {
				continue;
			}
			for(int j = 1; j < 10; j++) {
				System.out.println(i + " x " + j + " = " + (i * j));
			}
			System.out.println();
		}
	}
}
