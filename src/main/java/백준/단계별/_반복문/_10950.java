package 백준.단계별._반복문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10950 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int i = 0;
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        while(i < a){
            st = new StringTokenizer(br.readLine()," ");
            sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
            sb.append('\n');
            i++;
        }
        System.out.println(sb);
    }
}
