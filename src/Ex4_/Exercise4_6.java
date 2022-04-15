package Ex4_;

public class Exercise4_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 두개의 주사위의 합이 6이 될때의 경우의 수 출력
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				// i+j = 6 이 될때 출력
				if (i + j == 6) {
					System.out.println(i + "+" + j + "=" + (i + j));
				}
			}
		}
	}
}
