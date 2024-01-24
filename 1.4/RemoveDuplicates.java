import java.util.Scanner;

public class RemoveDuplicates {
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

        int resultSize = removeDuplicates(arr);

        System.out.println("\nThe array without duplicates:");
        for (int i = 0; i < resultSize; i++) {
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }

    public static int removeDuplicates(int[] arr) {
        int newSize = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < newSize; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                arr[newSize++] = arr[i];
            }
        }

        return newSize;
    }
}
