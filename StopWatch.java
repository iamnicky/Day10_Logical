import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter to start the stopwatch");
        sc.nextLine();
        long startTime=System.currentTimeMillis();
        System.out.println("enter to stop the stopwatch");
        sc.nextLine();
        long elapsedTime=System.currentTimeMillis()-startTime;
        System.out.printf("Elapsed Time: %02d:%02d:%02d%n",
                elapsedTime / (3600 * 1000),
                (elapsedTime % (3600 * 1000)) / (60 * 1000),
                (elapsedTime % (60 * 1000)) / 1000);
    }
}
