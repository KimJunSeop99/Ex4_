package Ex4_;

public class Exercise4_5 {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		for (int i = 0; i <= 10; i++) {
//			for (int j = 0; j <= i; j++)
//				System.out.print("*");
//			System.out.println();
//		}
		String s = "*";
		int i = 0;
		while (i++ != 10) {
			System.out.println(s);
			s += "*";
		}
	}
}
