import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class MultiplicationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RandomGenerator randomGenerator = new Random();
        int points = 0;
        int count = 0;
        int x, y, ans;

        while (points < 10) {
            x = randomGenerator.nextInt(1, 11);
            y = randomGenerator.nextInt(1, 11);
            ans = x * y;
            System.out.println(count);
            System.out.println(points);
            System.out.println("What is: " + x + "*" + y + "?");
            int scan_ans = Integer.parseInt(scanner.nextLine());
            if (count == 10) {
                System.out.println("Reset after not receiving enough points in 15 questions");
                points = 0;
                count = 0;
            } else if (scan_ans == ans) {
                System.out.println("Right ans");
                points++;
            } else {
                System.out.println("Wrong ans");
            }
            count++;

        }
        System.out.println("You got 10 points great job!");
    }
}
