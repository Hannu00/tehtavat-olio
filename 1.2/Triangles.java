import java.util.Scanner;
public class Triangles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        float firstnum = Float.parseFloat(scanner.nextLine());

        System.out.print("Enter second number: ");
        float secondnum = Float.parseFloat(scanner.nextLine());

        System.out.print("Enter third number: ");
        float thirdnum = Float.parseFloat(scanner.nextLine());

        float temp = Math.max(firstnum, secondnum);
        float hypo = Math.max(thirdnum, temp);
        System.out.println("The hypotenuse is: " + hypo);


    }
}
