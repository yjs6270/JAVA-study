import java.util.Scanner;

public class baekjoon1110 {
    public static void main(String[] args) {
        int a, b, c, i;
        i = 1;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        sc.close();

        b = a/10 + a%10;
        b = (a%10)*10 + b%10;

        while(true){
            if (a == b){
                System.out.println(i);
                break;
            }

            i = i+1;
            c = b;
            b = b/10 + b%10;
            b = (c%10)*10 + b%10;

        }
    }
}
