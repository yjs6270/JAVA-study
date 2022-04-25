import java.util.Scanner;

public class baekjoon1712 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        try {
            int x = a / (c - b) + 1;

            if (x > 0) {
                System.out.println(x);
            } else {
                System.out.println(-1);
            }

        } catch(Exception e) {
            System.out.println(-1);
        }


    }
}
