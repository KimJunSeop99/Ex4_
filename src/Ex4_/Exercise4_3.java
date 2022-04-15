package Ex4_;

public class Exercise4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 부분합
		// 총합 계산
		int num = 0;
		int total = 0;
		for (int i= 1; i<=10; i++) {
			num = num + i;
			total = total + num;
			System.out.println("i = " + i);
			System.out.println("num = " + num);
			System.out.println("total = " + total);
			
		}
		
		System.out.println("total = " + total);
	}
}
