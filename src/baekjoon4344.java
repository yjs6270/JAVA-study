import java.util.Scanner;
import java.util.Arrays;

public class baekjoon4344 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        int [] arr;


        for (int k = 0; k < testcase; k++) {
            int n = sc.nextInt();
            arr = new int[n];
            int sum = 0 ;

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                sum += arr[i];
            }

            double avg = sum / (n * 1.0);
            double count = 0;

            for (int i = 0; i < n; i++) {
                if (arr[i] > avg) {
                    count++;
                }
            }

            double rate = count / n * 100;
            System.out.println(String.format("%.3f", rate)+"%");
        }
        sc.close();
    }
}
