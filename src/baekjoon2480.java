import java.util.Scanner;

public class baekjoon2480 {
    public static void main(String[] args) {
        int x, y, z;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();

        if (x == y) {
            if (y == z) {
                System.out.println(10000 + x * 1000);
            } else if (y != z) {
                System.out.println(1000 + x * 100);
            }
        } else if (x == z) {
            if (y == z) {
                System.out.println(10000 + x * 1000);
            } else if (y != z) {
                System.out.println(1000 + x * 100);
            }
        } else if (y == z) {
            if (x == y) {
                System.out.println(10000 + y * 1000);
            } else if (x != y) {
                System.out.println(1000 + y * 100);
            }
        } else {
            System.out.println(Math.max(Math.max(x, y), z) * 100);
        }
    }
}
