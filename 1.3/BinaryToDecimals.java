import java.util.Scanner;
public class BinaryToDecimals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.print("Enter binary: ");
        int binary = Integer.parseInt(scanner.nextLine());
        String binarystr = String.valueOf(binary);
        int len = binarystr.length();
        int x = len - 1;
        for (int i = 0; i < len; i++) {
            int num = Integer.parseInt(Integer.toString(binary).substring(i, i+1));
            sum = sum + num * (int) Math.pow(2, x);
            x -= 1;
        }
        System.out.println(sum);
    }
}
