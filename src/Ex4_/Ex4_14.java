package Ex4_;

import java.util.Scanner;

public class Ex4_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0, sum = 0;
		System.out.print("숫자 입력");

		Scanner s = new Scanner(System.in);
		String tmp = s.nextLine();
		num = Integer.parseInt(tmp);

		while (num != 0) {
			sum += num % 10;
			System.out.printf("sum=%3d num=%d%n", sum, num);
			num /= 10;
			
		}
		System.out.println("각 자리수의합:" + sum);
	}

}
