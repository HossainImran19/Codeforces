package imran.code.forces;
import java.util.*;

public class Gennady {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str1 = s.nextLine();
		String test = "No";
		int val1 = str1.charAt(0);
		int val2 = str1.charAt(1);
		for(int i = 0; i < 5; i++) {
			String str2 = s.next();
			int val3 = str2.charAt(0);
			int val4 = str2.charAt(1);
			if(val1 == val3 || val2 == val4) {
				test = "Yes";
			}else {
				continue;
			}
		}
		int val5 = test.charAt(0);
		if(val5 == 89) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
