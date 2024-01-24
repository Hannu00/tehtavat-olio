import java.util.Scanner;

public class MaxArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Syötä taulukon koko: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("Syötä taulukon arvot:");

        for (int i = 0; i < size; i++) {
            System.out.print("Syötä kokonaisluku " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int start = 0;
        int end = 0;
        int tempStart = 0;

        for (int i = 0; i < size; i++) {
            currentSum += arr[i];

            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }

            if (currentSum < 0) {
                currentSum = 0;
                tempStart = i + 1;
            }
        }

        System.out.println("Maksimisumma: " + maxSum);
        System.out.print("Kokonaisluvut: ");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }
}
