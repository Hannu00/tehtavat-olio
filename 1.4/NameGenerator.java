import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class NameGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random randomGenerator = new Random();
        List<String> namesList = new ArrayList<>();

        String[] LastNames = {"Smith", "Johnson", "Williams", "Brown", "Jones", "Miller", "Davis", "Garcia", "Rodriguez", "Wilson", "Martinez", "Anderson", "Taylor", "Thomas", "Hernandez", "Moore", "Martin", "Jackson"};
        String[] FirstNames = {"Adrienne", "Aeriel", "Aeriela", "Aeriell", "Afton", "Ag", "Agace", "Agata", "Agatha", "Agathe", "Aggi", "Aggie", "Aggy", "Agna", "Agnella", "Agnes"};

        System.out.println("How many names do you want?");
        int numofnames = Integer.parseInt(scanner.nextLine());

        while (namesList.size() < numofnames) {
            String randomnlast = LastNames[randomGenerator.nextInt(18)];
            String randomfirst = FirstNames[randomGenerator.nextInt(16)];
            String randomfull = randomfirst + " " + randomnlast;

            if (!namesList.contains(randomfull)) {
                namesList.add(randomfull);
            }
        }

        System.out.println(namesList);
    }
}
