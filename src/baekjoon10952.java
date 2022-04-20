import java.util.Scanner;

public class baekjoon10952 {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);

        while(true) {
            a = sc.nextInt();
            b = sc.nextInt();

            if (a==0 && b==0) {
                sc.close();
                break;
            }

            System.out.println(a + b);
        }
    }
}
