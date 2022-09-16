package 백준.단계별._함수;
public class _4673 {
    public static void main(String args[]){
        // 1~10001 까지의 데이터 중에서, 셀프넘버이면 true, 아니면 false를 리턴하는 bool 타입의 객체 선언.
        boolean[] arr = new boolean[10001];

        // 배열의 크기만큼 셀프넘버를 비교하는 함수를 동작시키고, 셀프넘버인 값을 true로 변환해주는 작업을 한다.
        for(int i=1;i<10001;i++){
            int n=selfNum(i);
            if(n<10001) arr[n] = true;
        }

        //최종 값 리턴.
        for(int i=1;i<10001;i++){
            if(!arr[i]){
                System.out.println(i);
            }
        }

    }
    // 셀프넘버인지 확인후 반환하는 함수.
    public static int selfNum(int num){
        int sum=num;
        while(num !=0){
            sum=sum+num%10;
            num=num/10;
        }
        return sum;
    }
}

