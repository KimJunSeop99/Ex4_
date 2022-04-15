package Ex4_;

public class Exercise4_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		// 문자열 "12345" 이면 1+2+3+4+5 결과 출력
		String str = "12345";
		int sum = 0;
		
		for (int i = 0; i < str.length(); i++) {
			sum += str.charAt(i) - '0' ; // '1' - '0' = 1
			System.out.println("sum = " + sum);
		}System.out.println("sum = " + sum);
	}	

}
