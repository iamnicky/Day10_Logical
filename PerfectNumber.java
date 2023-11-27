import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int N = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < N; i++) {
            if (N % i == 0) {
                sum += i;
            }
        }
        if (N == sum) {
            System.out.println(N + " " + "is a Perfect Number");
        } else {
            System.out.println(N + " " + "is not a perfect Number");
        }
    }
}
