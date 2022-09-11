package 백준.단계별._조건문;

import java.io.*;
import java.util.StringTokenizer;

public class _2525 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int num_1 = Integer.parseInt(st.nextToken());
        int num_2 = Integer.parseInt(st.nextToken());

        int countMin = Integer.parseInt(br.readLine());


        int min = 60 * num_1 + num_2;
        min += countMin;

        int hour = (min / 60) % 24;
        int minute = min % 60;

        System.out.println(hour+" "+ minute);

    }
}
