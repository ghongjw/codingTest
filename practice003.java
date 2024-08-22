import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;

public class practice003 {
    //0.5초안에 나와야 한다.
//1번째줄에 수의 개수 N(1<=N<=100000)합을 구해야 하는 횟수M(1<=M<=100000)2번째 줄에 N개의 수가 주어진다. 각 수는 1000보다 작거나 같은 자연수다.
//3번째 줄부터는 M개의 줄에 합을 구해야하는 구간i와j가 주어진다
//총 M개의 줄에 입력으로 주어진 i번째 수에서j번째 수 까지의 합을 출력한다.
//이렇게 숫자가 많을때는 합배열을 이용하는것이 좋다
    public static void main(String[] args) throws IOException {
        //입력 받는 숫자가 많을 때에는 버퍼드리더가 유리하다.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
    }

}
