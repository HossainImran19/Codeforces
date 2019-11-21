package imran.code.forces;
import java.util.*;
public class Card {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int one = 0,zero = 0;
		String str = s.next();
		for(int i = 0; i < n; i++) {
			int v = str.charAt(i);
			if(v == 110) {
				one++;
			}if(v == 122) {
				zero++;
			}else {
				continue;
			}
		}
		for(int i = 0; i < one; i++) {
			System.out.print("1 ");
		}
		for(int i = 0; i < zero; i++) {
			System.out.print("0 ");
		}
	}
}
