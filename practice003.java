import java.io.*;
import java.util.*;

public class practice003 {
    //0.5초안에 나와야 한다.
//1번째줄에 수의 개수 N(1<=N<=100000)합을 구해야 하는 횟수M(1<=M<=100000)2번째 줄에 N개의 수가 주어진다. 각 수는 1000보다 작거나 같은 자연수다.
//3번째 줄부터는 M개의 줄에 합을 구해야하는 구간i와j가 주어진다
//총 M개의 줄에 입력으로 주어진 i번째 수에서j번째 수 까지의 합을 출력한다.
//이렇게 숫자가 많을때는 합배열을 이용하는것이 좋다
public static void main(String[] args) throws IOException{
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    String line1 = bufferedReader.readLine();
    StringTokenizer stringTokenizer = new StringTokenizer(line1," ");
    
    int suNo = Integer.parseInt(stringTokenizer.nextToken());
    int quizNo = Integer.parseInt(stringTokenizer.nextToken());
    long S[] = new long[suNo+1];

    String line2 = bufferedReader.readLine();
    stringTokenizer = new StringTokenizer(line2," ");
    
    for(int i = 1; i<=suNo; i++){
        S[i] = S[i-1] + Integer.parseInt(stringTokenizer.nextToken());
    }
    for(int q=0;q<quizNo;q++){
        String line3 = bufferedReader.readLine();
        StringTokenizer stringTokenizer3 = new StringTokenizer(line3," ");
        
    int i = Integer.parseInt(stringTokenizer3.nextToken());
    int j = Integer.parseInt(stringTokenizer3.nextToken());
        
    System.out.println(S[j]-S[i-1]);
        
    }
    
}

}
