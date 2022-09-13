package 백준.단계별._반복문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _8393 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int i = 1;
        int sum = 0;

        while(i <= a){
            sum+=i;
            i++;
        }
        System.out.println(sum);



    }
}
