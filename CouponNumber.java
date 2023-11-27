import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class CouponNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();

        Set<Integer> distinctCoupon = new HashSet<>();
        Random random = new Random();
        int totalRandomNumber=0;
        while (distinctCoupon.size() < n) {
            int randomNumber = random.nextInt(n) + 1;
            totalRandomNumber++;

            if(!distinctCoupon.contains(randomNumber)){
                distinctCoupon.add(randomNumber);
            }
        }
        System.out.println(totalRandomNumber);
    }
}