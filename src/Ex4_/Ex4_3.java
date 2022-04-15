package Ex4_;

import java.util.Scanner;

public class Ex4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("숫자 하나를 입력");
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		
		if (input==0) {
			System.out.println("입력하신 숫자는 0 입니다");
		}
		else {
			System.out.println("입력하신 숫자는 0이 아닙니다.");
		}
	}

}
