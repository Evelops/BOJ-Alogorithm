package 백준.단계별._조건문;

import java.io.*;
import java.util.StringTokenizer;

public class _9498 {
    public static void main(String arg[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // StringTokenizer -> split 함수와 같은 용도로, 문자열을 특정 라인에 맞춰 나눈다. StringTokenizer 객체는 띄어쓰기 단위로 데이터를 라인을 읽어들인다.
        // Buffered 는 라인단위로 문자열을 읽어들이기 때문에 다음과 같이 진행한다.
        StringTokenizer st = new StringTokenizer(br.readLine());

        // inputNum은 유저가 Buffered로 읽어들인 라인을 StringTokenizer를 통해 분류하고, 분류한 값을 int형으로 형변환 해서 저장한값.
        int inputNum = Integer.parseInt(st.nextToken());

        if(inputNum > 89){
            bw.write("A");
        }else if(inputNum > 79 && inputNum < 90){
            bw.write("B");
        }else if(inputNum > 69 && inputNum < 80){
            bw.write("C");
        }else if(inputNum > 59 && inputNum < 70){
            bw.write("D");
        }else {
            bw.write("F");
        }

        bw.flush();
        bw.close();

    }
}
