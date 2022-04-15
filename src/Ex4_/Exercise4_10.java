package Ex4_;

import java.util.Scanner;

public class Exercise4_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		숫자맞추기 게임 1~100 사이 값을 반복적으로 입력해서
//		컴퓨터가 생각한 것을 맞추면 게임 끝
//		1~100사이의 임의의 값을 얻어서 answer에 저장
		int answer = (int)(Math.random()*100) +1 ;
		
		int input = 0; // 사용자가 입력할 공간
		int count = 0; // 시도횟수를 세기 위한 변수
		
//		화면으로 부터 사용자 입력
		Scanner s = new Scanner(System.in);
			
		do {
			count++;
			System.out.println("1과 100사이의 값을 입력");
			input = s.nextInt();
			
			if(answer > input) {
				System.out.println("더 큰 수를 입력");
			} else if (answer < input) {
				System.out.println("더 작은 수를 입력");
			} else {
				System.out.println("맞췄습니다");
				System.out.println("시도횟수는"+count+"입니다.");
				break;
			}	
		} while(true);
		
		
		
	}

}
