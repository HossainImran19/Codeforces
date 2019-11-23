package imran.code.forces;
import java.util.*;
public class Drinks {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int b = n;
		int sum = 0;
		while(n-->0) {
			sum += s.nextInt();
		}

        System.out.printf("%f",sum/(b+.0));
	}

}
