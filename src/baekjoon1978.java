import java.util.Scanner;

public class baekjoon1978 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int count = 0;

        for (int i = 0; i < N; i++) {

            boolean isPrime = true;

            int num = in.nextInt();

            if (num == 1) {
                continue;
            }
            for (int j = 2; j <= Math.sqrt(num); j++) {
                if (num % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
            }
        }
        System.out.println(count);
    }
}

//import java.util.Scanner;
//
//public class baekjoon1978 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int count = 0;
//
//        for (int i = 0; i < n; i++) {
//            int a = sc.nextInt();
//            if (a == 1) {
//                count++;
//            } else if (a == 2) {
//
//            } else {
//                int j = 2;
//                int acount = 0;
//
//                while (j < a) {
//                    if (a % j == 0) {
//                        break;
//                    } else {
//                        j++;
//                        acount++;
//                    }
//                }
//                if (acount == a-2) {
//                    count++;
//                }
//            }
//        }
//        System.out.println(count);
//    }
//}
