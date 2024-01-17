import java.util.Scanner;

public class PrimeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter start: ");
        int start = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter end: ");
        int end = Integer.parseInt(scanner.nextLine());
        int prime, j, i;

        for (i = start; i <= end; i++) {
            if (i == 1 || i == 0) continue;

            prime = 1;

            for (j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    prime = 0;
                    break;
                }
            }
            if (prime == 1) System.out.println(i);
        }
    }
}
