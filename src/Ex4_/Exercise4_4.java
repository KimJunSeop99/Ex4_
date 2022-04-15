package Ex4_;

import java.util.Scanner;

public class Exercise4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1 + (-2) + 3 + (-4) ....
		// 총합을 저장할 변수
		int sum = 0;
		// 값의 부호를 바꿔주는 변수
		int s = 1;
		// 총 몇번 계산했는지 카운트하는 변수
		int num = 0;
		// while문 카운트 변수
		int i = 1;
		
		while(true) {
			// 탈출 조건 : sum >= 100 보다 커지면 탈출
			if(sum >= 100) {
				break;
			}
			// num의 값에 양수
			num = s * i;
			System.out.println("num = "+num);
			// num값이 양수로 바뀌었으니 짝수마다 s 를 음수로 바꿈
			s = -s;
			System.out.println("s = " + s);
			// 누적합 (양수 + 음수) >= 100 탈출
			System.out.println("sum = " + sum);
			sum = sum + num;
			// while문 반복
			i++;
		}
		System.out.println("num = " + num);
		System.out.println("sum = " + sum);
	}
}
