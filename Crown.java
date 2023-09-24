import java.util.*;

class Crown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int num = 2 * (n - i);
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = 0; j < num; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            num -= 2;
            System.out.println();
        }

        sc.close();
    }
}
