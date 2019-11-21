import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s =  new Scanner(System.in);
        int arr[][] = new int[5][5];
        
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                arr[i][j] = s.nextInt();
            }
        }
        int n = 0;
        int m = 0;
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if(arr[i][j] == 1){
                    n = i;
                    m = j;
                }else{
                    continue;
                }
            }
        }
        n = Math.abs(2 - n);
        m = Math.abs(2 - m);
        System.out.println(n + m);
    }
}
	

