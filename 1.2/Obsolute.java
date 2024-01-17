import java.util.Locale;
import java.util.Scanner;

public class Obsolute {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight in grams: ");
        int firstnum = Integer.parseInt(scanner.nextLine());

        int leiviska = (int) (firstnum / (20*32*13.28F));
        float jaannos = (firstnum % (20*32*13.28F));
        int naula = (int) (jaannos / (32*13.28F));
        float jaannos2 =  jaannos % (32 * 13.28F);
        float luoti = jaannos2 / 13.28F;


        System.out.print(firstnum + " grams is " + leiviska + " leiviskä, " + naula + " naula," + " and " + String.format(Locale.US, "%.2f",luoti) + " luoti.");
    }
}
