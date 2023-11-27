import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int N = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.println(a + " " + b);
        int c;
        for (int i = 1; i <= N; i++) {
            c = a + b;
            System.out.println(" " + c);

            a = b;
            b = c;
        }
    }
}