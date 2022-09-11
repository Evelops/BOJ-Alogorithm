package 백준.단계별._조건문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2480 {

    static int compare(int a,int b,int c){
        int max = a;
        if(b > max) max = b;
        if(c > max) max = c;

        return max;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num_1 = Integer.parseInt(st.nextToken());
        int num_2 = Integer.parseInt(st.nextToken());
        int num_3 = Integer.parseInt(st.nextToken());


        if ((num_1 == num_2) && (num_2 == num_3)) {
            System.out.println(10000 + num_1 * 1000);
        }
        // 1-2 같은 경우, 1-3 같은 경우, 2-3 같은경우
        else if ((num_1 == num_2) && (num_1 != num_3)) {
            System.out.println(1000 + num_1 * 3);
        } else if ((num_1 == num_3) && (num_1 != num_2)) {
            System.out.println(1000 + num_1 * 3);
        } else if ((num_2 == num_3) && (num_1 != num_2)) {
            System.out.println(1000 + num_2 * 3);
        } else {
            System.out.println(compare(num_1, num_2, num_3));
        }
    }
}