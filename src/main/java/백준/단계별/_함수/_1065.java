package 백준.단계별._함수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1065 {
    public static void main(String[] args) throws IOException{

        /**
         * 어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다.
         * 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다.
         * N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오.
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt=0;
        int input = Integer.parseInt(br.readLine());

        // 분기로 100 이상인지 이하인지 케이스를 나눠서 계산한다.
        if(input < 100){
            for(int i=1;i<=input;i++){
                cnt++;
            }
        }
        else{
            // 입력이 100 이상일 경우, cnt 값을 99로 할당하고, 이후에, 등차수열인지 비교하는 함수를 돌려서 값을 더해주는 식으로 전개한다.
            cnt=99;
            for(int i=100;i<=input;i++){
                cnt+=oneNum(i);
            }
        }
        System.out.println(cnt);
    }


    // 각 자리수를 비교해서 등차수열인지 아닌지를 판별하는 함수. 등차수열인 경우 1을 리턴하고, 아닌경우 0을 리턴해주어 cnt 값과 계속 더해준다.
    public static int oneNum(int num){
                int n_100 = num/100;
                int n_10 = (num/10) % 10;
                int n_1 = num%10;
                if((n_100 - n_10) == (n_10 - n_1)){
                    return 1;
                }
                else {
                    return 0;
                }
    }

}
