package imran.code.forces;

public class BachgoldProblem {

	public static void main(String[] args) {
		int n = new java.util.Scanner(System.in).nextInt();
		
		System.out.println(n/2);
			
		for(int i = 0; i < n/2-1; i++) {
			System.out.print("2 ");
		
		}
		System.out.println(n%2==0?"2 ":"3 ");
	}

}
