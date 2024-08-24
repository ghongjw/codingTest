import java.util.Scanner;
public class practice001 {
    //N개의 숫자가 공백없이 써있다. 이숫자를 모두 합해 출력하는 프로그램을 만들어라.
    //1번째 줄에 숫자의 개수 N(1<=N<=100)2번째 줄에 숫자 N개가 공백없이 주어진다.
    //ex 입력 >5 >54321 출력 > 15 
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String snum = scanner.next();
        char[] c = snum.toCharArray();

        int sum = 0;
        for(int i = 0; i<c.length;i++){
            sum += c[i]-'0';
        }
        System.out.println(sum);
    }
}
