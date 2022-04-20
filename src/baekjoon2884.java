import java.util.Scanner;

public class baekjoon2884 {
    public static void main(String[] args) {
        int h, m;
        Scanner sc = new Scanner(System.in);
        h = sc.nextInt();
        m = sc.nextInt();

        if (m - 45 >= 0) {
            System.out.printf("%d %d", h, m - 45);
        } else if (m - 45 < 0) {
            h = h - 1;
            m = 60 + m - 45 ;

            if (h < 0) {
                h = 23;
            }
            System.out.printf("%d %d", h, m);
        }
    }
}
