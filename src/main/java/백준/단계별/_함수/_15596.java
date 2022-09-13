package 백준.단계별._함수;

public class _15596 {
    long sum(int[] a){
        long arrSum = 0;
        for(int i = 0; i<a.length;i++){
            arrSum+=a[i];
        }
        return arrSum;
    }
}

