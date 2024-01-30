import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Saapumisprosessi {
    private List<Long> tapahtumalista;
    private Random satunnaislukugeneraattori;
    private Kello kello;

    public Saapumisprosessi(Kello kello, Random satunnaislukugeneraattori) {
        this.tapahtumalista = new ArrayList<>();
        this.satunnaislukugeneraattori = satunnaislukugeneraattori;
        this.kello = kello;
    }

    public void luoUusiTapahtuma() {
        long saapumisväli = satunnaislukugeneraattori.nextLong();
        long tapahtumanAika = kello.haeAika() + saapumisväli;
        tapahtumalista.add(tapahtumanAika);
        kello.asetaAika(tapahtumanAika);
    }

    public List<Long> haeTapahtumalista() {
        return tapahtumalista;
    }
}