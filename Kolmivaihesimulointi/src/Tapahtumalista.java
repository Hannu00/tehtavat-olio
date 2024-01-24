import java.util.*;

public class Tapahtumalista {
    private PriorityQueue<Tapahtuma> tapahtumat;

    public Tapahtumalista() {
        this.tapahtumat = new PriorityQueue<>();
    }

    public void lisaaTapahtuma(Tapahtuma tapahtuma) {
        tapahtumat.add(tapahtuma);
    }

    public Tapahtuma seuraavaTapahtuma() {
        return tapahtumat.poll();
    }

    public boolean onkoTyhja() {
        return tapahtumat.isEmpty();
    }

    public void tulostaTapahtumat() {
        PriorityQueue<Tapahtuma> kopio = new PriorityQueue<>(tapahtumat);
        while (!kopio.isEmpty()) {
            Tapahtuma tapahtuma = kopio.poll();
            System.out.println("Tapahtuma: " + tapahtuma + ", Tyyppi: " + tapahtuma.getTyyppi());
        }
    }


}
