package imran.code.forces;
import java.util.*;
public class BetweeTheOffices {

	public static void main(String[] args) {
          Scanner s = new Scanner(System.in);
          int n = s.nextInt();
          String ara = s.next();
        
          int y = 0;
          int no = 0;
          for(int i = 0; i < n - 1; i++) {
        	int in1 = ara.charAt(i);
        	int in2 = ara.charAt(i + 1);
        	if(in1 == in2) {
        		continue;
        	}else if(in1 < in2){
        		no++;
        	}else if(in1 > in2) {
        		y++;
        	}
          }
          System.out.println((y > no)? "Yes":"NO");
     }
}
