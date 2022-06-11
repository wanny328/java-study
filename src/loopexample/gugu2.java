package loopexample;

public class gugu2 {
	public static void main(String[] args) {
		System.out.println("짝수단 출력 프로그래밍");
		for(int i = 2; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				if(j <= i) {
				System.out.println(i + " x " + j + " = " + (i * j));
				}
			}
			System.out.println();
		}
	}
}