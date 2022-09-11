package 백준.단계별._조건문;

import java.io.*;
import java.util.StringTokenizer;

public class _1330 {
    public static void main(String args[]) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        if(a > b){
            bw.write(">");
        }else if(a < b){
            bw.write("<");
        } else{
            bw.write("==");
        }
        bw.flush();
        bw.close();
    }
}
