package Ex4_;

import java.util.Scanner;

public class Ex4_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int menu = 0;
		int num = 0;
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.printf("원하는메뉴(1~3)을 선택하세요(종료:0)");
			
			String tmp = s.nextLine();
			menu = Integer.parseInt(tmp);
			
			if (menu == 0) {
				System.out.println("프로그램 종료");
				break;
			} else if (!(1<=menu && menu <=3)) {
				System.out.println("메뉴를 잘못 선택하셨습니다(종료는0)");
				continue;
			}
			System.out.println("선택하신 메뉴는" +menu+"번 입니다.");
		}
	}

}
