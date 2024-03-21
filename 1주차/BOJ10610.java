package BOJ_Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ10610 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String N = br.readLine();

        char[] charArr = N.toCharArray();
        Arrays.sort(charArr);

        int len = charArr.length;
        int sum = 0;

        if(charArr[0] != '0' ) { System.out.println(-1); return; }

        for(int i = len - 1; i >= 0; i--){
            int num = charArr[i] - '0';
            sum += num;
            sb.append(num);
        }
        if(sum % 3 == 0){
            System.out.println(sb);
        }
        else System.out.println(-1);
    }
}
