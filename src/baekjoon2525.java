import java.util.Scanner;

public class baekjoon2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int dur = sc.nextInt();
        int addH, divM;

        if (m + dur < 60) {
            System.out.println(h + " " + (m + dur));
        } else if (m + dur >= 60) {
            addH = (m + dur) / 60;
            int lastH = (h + addH) % 24;
            divM = (m + dur) % 60;

            System.out.println(lastH + " " + divM);
        }

    }
}
