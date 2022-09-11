package 백준.단계별._조건문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2480 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num_1 = Integer.parseInt(st.nextToken());
        int num_2 = Integer.parseInt(st.nextToken());
        int num_3 = Integer.parseInt(st.nextToken());


        // 입력 받은 3가지 값이 모두 같은 경우.
        if (num_1 == num_2 && num_2 == num_3) {
            System.out.println(10000 + num_1 * 1000);
        }
        // 입력 받은 3가지 값이 모두 다른 경우.
        else if(num_1 != num_2 && num_2 != num_3 && num_1 != num_3) {
            int max = num_1;
            if (max < num_2) max = num_2;
            if (max < num_3) max = num_3;
            System.out.println(max * 100);
        }else if(num_1 == num_2 || num_1 == num_3){
            System.out.println(1000+num_1*100);
        }else{
            System.out.println(1000+num_2*100);
        }

    }
}