import java.util.Scanner;

public class practice001 {
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
