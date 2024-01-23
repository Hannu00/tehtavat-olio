import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AsiakasHallintaOhjelma {
    public static void main(String[] args) {
        Queue<Asiakas> asiakasJono = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Valitse toimenpide: ");
            System.out.println("1. Lisää asiakas");
            System.out.println("2. Poista asiakas");
            System.out.println("3. Lopeta");

            int valinta = scanner.nextInt();

            switch (valinta) {
                case 1:
                    Asiakas uusiAsiakas = new Asiakas();
                    uusiAsiakas.aloitaAsiointi();
                    asiakasJono.add(uusiAsiakas);
                    System.out.println("Uusi asiakas lisätty jonoon.");
                    break;

                case 2:
                    if (!asiakasJono.isEmpty()) {
                        Asiakas poistettuAsiakas = asiakasJono.remove();
                        poistettuAsiakas.lopetaAsiointi();
                        System.out.println("Asiakas " + poistettuAsiakas.getId() + " poistettu jonosta. Kulutettu aika: " + poistettuAsiakas.kulutettuAika() + " ms");
                    } else {
                        System.out.println("Jono on tyhjä.");
                    }
                    break;

                case 3:
                    System.out.println("Ohjelma lopetetaan.");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Virheellinen valinta. Yritä uudelleen.");
            }
        }
    }
}
