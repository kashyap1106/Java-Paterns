import java.util.Scanner;

class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row number");
        int n = sc.nextInt();
        System.out.print("Enter Coloumn number");
        int k = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print("@");
            }
            System.out.println();
        }

        sc.close();
    }
}