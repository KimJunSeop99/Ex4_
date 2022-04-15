package Ex4_;

public class Ex4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0;
		System.out.printf("x=%d 일 떄, 참 인것은 %n", x);
		
		if (x==0) System.out.println("x==0");
		if (x!=0) System.out.println("x!=0");
		if (!(x==0)) System.out.println("!(x==0)");
		if (!(x!=0)) System.out.println("!(x!=0)");
		
		x=1;
		System.out.printf("x=%d 일때, 참 인것은 %n", x);
		
		if (x==0) System.out.println("x==0");
		if (x!=0) System.out.println("x!=0");
		if(!(x==0)) System.out.println("!(x==0)");
		if(!(x!=0)) System.out.println("!(x!=0)");
	}

}
