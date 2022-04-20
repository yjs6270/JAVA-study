import java.util.Scanner;

public class baekjoon2739 {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();

        for(int i=1; i<10; i++) {
            System.out.println(x + " * " + i + " = " + x * i);
        }
    }
}
