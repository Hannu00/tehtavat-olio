import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Ikasimulointi {

    private static final Map<String, Integer> ikaJakauma = new HashMap<>();

    static {
        ikaJakauma.put("18-20", 14);
        ikaJakauma.put("21-23", 24);
        ikaJakauma.put("24-26", 30);
        ikaJakauma.put("27-29", 18);
        ikaJakauma.put("30-32", 9);
        ikaJakauma.put("33-35", 4);
        ikaJakauma.put("36-38", 1);
    }

    public static int generoiIka() {
        int satunnaisluku = new Random().nextInt(100);

        int ikaryhmaRaja = 0;
        for (Map.Entry<String, Integer> entry : ikaJakauma.entrySet()) {
            ikaryhmaRaja += entry.getValue();
            if (satunnaisluku < ikaryhmaRaja) {
                String tarkkaIkaryhma = entry.getKey();
                int[] ikaryhmaVali = muunnaIkaryhma(tarkkaIkaryhma);

                // Arvo tarkka ikä kyseisessä ikäryhmässä
                return arvoTarkkaIka(ikaryhmaVali[0], ikaryhmaVali[1]);
            }
        }
        return -1;
    }

    private static int[] muunnaIkaryhma(String ikaryhma) {
        String[] osat = ikaryhma.split("-");

        int[] vali = new int[2];

        vali[0] = Integer.parseInt(osat[0].trim());

        vali[1] = Integer.parseInt(osat[1].trim());

        return vali;
    }

    private static int arvoTarkkaIka(int alaraja, int ylaraja) {
        return alaraja + new Random().nextInt(ylaraja - alaraja + 1);
    }

    public static void tulostaIkaTesti(int testienMaara) {
        for (int i = 0; i < testienMaara; i++) {
            int uusiIka = generoiIka();
            System.out.println("Testi " + (i + 1) + ": Uusi opiskelija iällä " + uusiIka + " vuotta");
        }
    }

    public static void main(String[] args) {
        int testienMaara = 35; // Testattavien määrä
        tulostaIkaTesti(testienMaara);
    }
}
