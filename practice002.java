import java.util.Scanner;

public class practice002 {
    //모든 점수를 입력받아 최대값 점수/최대값*100을 하여 그 점수들의 평균 구하기
    //입력 > 3 , >40, >80, >60 출력 >75.0
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] scores = new long[n];
        for(int i = 0; i<n;i++){
            scores[i] = sc.nextInt();
        }
        long max = 0;
        long sum= 0 ;
        for(int i = 0; i<n;i++){
            if (scores[i]>max){
                max = scores[i];
            }
            sum += scores[i];
        }

        System.out.println(sum*100.0/max/n);
        //여기서 소수점을 하면 알아서 소수점까지 출력해준다.
    }

}
