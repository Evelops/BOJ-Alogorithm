package 백준.단계별._배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _8958 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        int n =Integer.parseInt(br.readLine());

        String[] caseList = new String[n];

        for(int i=0;i<n;i++){
            caseList[i]=br.readLine(); // 라인 별로 데이터를 입력받는다.
        }
        // caseList 에 유저가 입력한 데이터 셋이 저장되어 있음, ooxxoxoxo..

        for(int k=0; k<n;k++){
            int count = 0;
            int sum =0;
            //k에 들어가 있는 배열의 크기 만큼 값을 돌려서, 각 배열의 위치에 들어가 있는 값을 판별한 후, 출력한다.
            for(int m=0;m<caseList[k].length();m++){
                if(caseList[k].charAt(m) == 'O'){
                    count++; // charAt 메서드로 k 번째 배열의 들어있는 String 값을 추출하여, 각 String의 인자값을 비교하고, O인 경우에 ++ 해준다.
                }else{
                    count=0; // O 가 아닌 다른 값이 나올경우, count를 초기화 시킨다.
                }
                sum+=count;
            }
            System.out.println(sum);
        }

    }
}
