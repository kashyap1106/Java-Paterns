import java.util.*;

class Hollowcrown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int start = (2 * i);
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= start; j++) {
                System.out.print(" ");
            }
            for (int j = n - i; j >= 1; j--) {
                System.out.print("*");

            }
            start -= 2;
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            int start = 2 * (n - i);
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= start; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            start -= 2;
            System.out.println();
        }
        sc.close();

    }
}
