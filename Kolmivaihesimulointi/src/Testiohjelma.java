import java.util.List;
import java.util.Random;

public class Testiohjelma {
    public static void main(String[] args) {
        Kello kello = Kello.getInstance();
        Random satunnaislukugeneraattori = new Random();

        Saapumisprosessi saapumisprosessi = new Saapumisprosessi(kello, satunnaislukugeneraattori);

        for (int i = 0; i < 10; i++) {
            saapumisprosessi.luoUusiTapahtuma();
        }

        List<Long> tapahtumalista = saapumisprosessi.haeTapahtumalista();
        System.out.println("Tapahtumalista:");
        for (Long tapahtumaAika : tapahtumalista) {
            System.out.println("Tapahtuma aika: " + tapahtumaAika);
        }
    }
}