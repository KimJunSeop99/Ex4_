package Ex4_;

import java.util.Scanner;

public class Ex4_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 0, answer = 0;
		
		answer = (int)(Math.random()*100) +1;
		Scanner s = new Scanner(System.in);
		
		do {
			System.out.printf("1과 100사이의 정수입력");
			input = s.nextInt();
			
			if (input > answer) {
				System.out.println("더 작은 수로 다시 시도");
			} else if (input < answer) {
				System.out.println("더 큰수로 다시 시도");
			}
		} while (input != answer);
		System.out.println("정답");
	}
	

}
