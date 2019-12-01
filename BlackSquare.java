package imran.code.forces;
import java.util.*;
public class BlackSquare {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a1 = s.nextInt();
		int a2 = s.nextInt();
		int a3 = s.nextInt();
		int a4 = s.nextInt();
		
		String st = s.next();
		int sum=0;
		
		for(int i = 0; i < st.length();i++) {
			char c = st.charAt(i);
			if(c=='1') {
				sum+=a1;
			}else if(c=='2') {
				sum+=a2;
			}else if(c=='3') {
				sum+=a3;
			}else {
				sum+=a4;
			}
		}
        System.out.println(sum);
        
	}

}
