import java.util.Scanner;

public class ReverseTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int N = sc.nextInt();
        int rem;
        int rev = 0;
        while (N != 0) {
            rem = N % 10;
            rev = rev * 10 + rem;
            N=N/10;
        }
        System.out.println("Reversed Number" + rev);
    }
}