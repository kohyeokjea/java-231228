package c_Chapter02;

// 중첩된 반복문(nested loop)

// 중첩 루프
// : 반복문안에 또 다른 반복문이 있는 구조
// : 각 반복마다 내부 루프가 전체를 완전히 반복
public class E_NestedLoop {

	public static void main(String[] args) {

		// 기본 구조
		// for (초기화; 조건; 증감) {
		// for (초기화2; 조건2; 증감2) {
		// 중첩 루프 내부의 명령문
		// }
		// 외부 루프 내부의 명령문
		// }

		// 중첩 루프 예제
		// : 5 * 5 별 찍기

		// 외부 루프: 0부터 4까지 반복(5번)
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("==========\n");
		
		// 중첩 for문을 사용하여 구구단 출력
		// 2단 부터 9단까지 반복
		for(int i = 2; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
			System.out.println();
		}
		
		System.out.println("==========\n");
		
		// 중첩 for문을 사용하여
		// *
		// * *
		// * * *
		// * * * *
		// * * * * *
		
		// 전체 행의 반복 (5번)
		for(int i = 0; i < 5; i++) {
			// 별의 개수가 1 ~ 5까지 증가
			// 첫 번째 줄에 1개
			// 두 번째 줄에 2개
			// ....
			// 다섯 번째 줄에 5개
			for(int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		// 별 찍기 연습 문제
		// 1.
		// * * * * *
		// * * * *
		// * * *
		// * *
		// *
		
		
		
		// 2.
		//   * 
		//  ***
		// *****

	}

}
