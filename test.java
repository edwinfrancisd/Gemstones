import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String[] R = new String[N];
        for (int lv1=0; lv1<N; lv1++) {
        	R[lv1] = scan.next();
        }
        
        int repeat = 0, gem = 0;

        while(R[0].length() > 0) {
        	char[] R1 = R[0].toCharArray();
        	String temp = Character.toString(R1[0]);
        	for (int lv2=1; lv2<N; lv2++) {
        		if(R[lv2].contains(temp)) {
        			repeat++;
        			R[lv2] = R[lv2].replaceAll(temp,"");
        		}
        	}
        	R[0] = R[0].replaceAll(temp,"");
        	if(repeat == (N-1))
        		gem++;
        	repeat = 0;
        }

        System.out.println(gem);
    }
}