package 백준.단계별._배열;

import java.io.*;

public class _3052 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // boolean 배열의 default 값 -> false
        boolean[] numList = new boolean[42];
        int count=0;

        for(int i = 0; i<10;i++){
            // 입력한 값을 42로 나눈 값을 true 값으로 변환해준다. 이렇게 되면 중복된 값을 입력했을 때, 이미 값이 true이기 때문에, 중복값을 배제하고
            // 카운트하면 된다.
            numList[Integer.parseInt(br.readLine()) % 42] = true;
        }

        for(boolean check : numList){
            if(check) count++;
        }

        System.out.println(count);


//        int[] numList = new int[10]; // 초기에 크기가 10인 배열을 정의한다.
//        int count=0;
//
//
//        // 나머지 값을 배열에 저장하고, 이후의 반복문에서 배열값에 중복된 값이 있는지 체크한다.
//        for(int i =0; i<numList.length; i++){
//            numList[i] = Integer.parseInt(br.readLine()) % 42 ; // 값을 하나씩 입력받는다.
//        }
//
//        // 위에서 나머지를 저장한 배열에서 중복값이 있는지 비교한다. 첫번재 인자값과 그 다음 배열의 인자값 순으로 데이터를 비교한다.
//        for(int k=0; k<numList.length;k++){
//
//            for(int m=k+1;m<numList.length;m++){
//                if(numList[k] == numList[m]){
//                    System.out.println(numList[k] + " 이후 의 값:"+ numList[m]);
//                    count++;
//                    System.out.println(count);
//                }
//            }
//        }
//        System.out.println(numList.length-count);
    }
}
