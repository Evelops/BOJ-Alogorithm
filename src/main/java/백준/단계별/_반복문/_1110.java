package 백준.단계별._반복문;

import java.io.*;


public class _1110 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 1의 자리는 10으로 나누었을 때, 나머지 값을 알면 알 수 있고, 10의 자리는 몫을 구하면 추출 할 수 있다.

        int n = Integer.parseInt(br.readLine()); // 입력받은값.
        int k = n;
        int count=0;



//        bw.write("10의 자리:"+a+"\n 1의 자리:"+b+"\n"+"둘의 합:"+k+"\n"+"1의자리를 10으로 나눈값:"+k%10);
        while(true)
        {
            n = ((n%10)*10)+(((n%10)+(n/10))%10);
            count++;

            if(k == n){
                break;
            }
        }
        System.out.println(count);
    }

}
