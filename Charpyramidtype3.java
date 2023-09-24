import java.util.Scanner;

class CharPyramidType3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }
            char ch = 'A';
            int breakpotint = (2 * i + 1) / 2;
            for (int j = 1; j <= 2 * i + 1; j++) {
                System.out.print(ch);
                if (j <= breakpotint)
                    ch++;
                else
                    ch--;
            }
            for (int j = 0; j <= n - i; j++) {
                System.out.print(" ");

            }
            System.out.println();

            sc.close();
        }
    }
}
