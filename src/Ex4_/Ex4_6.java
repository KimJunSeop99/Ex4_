package Ex4_;

import java.util.Scanner;

public class Ex4_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("현재 달(월)입력>");
		Scanner s = new Scanner(System.in);
		int month = s.nextInt();
		
		switch(month) {
		case 3:
		case 4:
		case 5:
			System.out.println("현재의 계절은 봄입니다.");
			break;
		case 6: case 7: case 8:
			System.out.println("현재의 계절은 여름입니다.");
			break;
		case 9: case 10: case 11:
			System.out.println("현재의 계절은 가을입니다.");
			break;
			default:
				System.out.println("현재의 계절은 겨울입니다.");
		
		}
		
	}

}
