package 백준.단계별._문자열;

import java.io.*;

public class _2675 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        // 첫번째 토큰에 입력한 정수의 크기를 가지는 배열을 선언한다.
        for(int i=0;i<n;i++){
            String[] str = br.readLine().split(" ");
            int k = Integer.parseInt(str[0]); // 첫번째 값은 int 값으로 변환해준다.
            String getStr = str[1];  // 두번째 인자의 값은 별도로 String 타입으로 저장한다.

            for(int j=0;j<getStr.length();j++){
                for(int m=0;m<k;m++){
                    System.out.print(getStr.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
