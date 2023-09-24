import java.util.Scanner;

public class Invchar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char ch = 'A';
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n - i - 1; j++) {
                System.out.print(ch + " ");
                ch += 1;
            }
            ch = 'A';
            System.out.println();

        }
        sc.close();

    }
}
