
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int N = sc.nextInt();
        int temp = 0;
        for (int i = 2; i < N; i++) {
            if (N % i == 0) {
                temp += 1;
            }
        }
        if (temp > 0) {
            System.out.println(N + " " + "is not a prime Number");
        } else {
            System.out.println(N + " " + "is a prime Number");
        }
    }
}
