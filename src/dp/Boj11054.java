package dp;

import java.util.Arrays;
import java.util.Scanner;

public class Boj11054 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] increasing = new int[N];
        int[] decreasing = new int[N];
        int[] val = new int[N];

        for(int n=0;n<N;n++) {
            val[n] = in.nextInt();
        }

        Arrays.fill(increasing,1);
        Arrays.fill(decreasing,1);

        for(int i=0;i<N;i++) {
            for(int j=i+1;j<N;j++) {
                if(val[i]<val[j]) {
                    if(increasing[j]<increasing[i]+1) increasing[j] = increasing[i]+1;
                }
            }
        }

        int max=0;
        for(int i=N-1;i>=0;i--) {
            for(int j=i-1;j>=0;j--) {
                if(val[i]<val[j]) {
                    if(decreasing[j]<decreasing[i]+1) decreasing[j] = decreasing[i]+1;
                }
            }
            if(max<increasing[i]+decreasing[i]-1) max=increasing[i]+decreasing[i]-1;
        }

        System.out.println(max);
        in.close();
    }
}
