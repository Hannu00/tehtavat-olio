
public class Tapahtuma implements Comparable<Tapahtuma> {
    private String nimi;
    private long aika;
    private TapahtumanTyyppi tyyppi;

    public Tapahtuma(String nimi, long aika, TapahtumanTyyppi tyyppi) {
        this.nimi = nimi;
        this.aika = aika;
        this.tyyppi = tyyppi;
    }

    public long getAika() {
        return aika;
    }

    public TapahtumanTyyppi getTyyppi() {
        return tyyppi;
    }

    @Override
    public int compareTo(Tapahtuma toinen) {
        return Long.compare(this.aika, toinen.aika);
    }

    @Override
    public String toString() {
        return "Tapahtuma{" +
                "nimi='" + nimi + '\'' +
                ", aika=" + aika +
                ", tyyppi=" + tyyppi +
                '}';
    }
}
