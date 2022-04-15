package Ex4_;

public class Exercise4_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수 12345 를 1+2+3+4+5 출력 하기
		int num = 12345;
		int sum = 0;
		
		// 나머지 연산자를 이용해서 계산
		// num     num/10   num%10
		// 12345   1234     5
		// 1234    123      4
		// 123     12       3
		// 12      1        2
		// 1       0        1
		while(num > 0) {
			// 최초 sum 0 값에 나머지 연산 자리수 5를 넣어줌
			sum = sum + (num%10);
			// num / 10 값을 반복
			num = num / 10;
			System.out.println("num = " + num);
			
		}
		
		System.out.println("sum = " + sum);
	}

}
