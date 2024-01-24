public class TapahtumienKasittely {
    public static void main(String[] args) {
        Tapahtumalista tapahtumalista = new Tapahtumalista();

        tapahtumalista.lisaaTapahtuma(new Tapahtuma("Saapuminen 1", System.currentTimeMillis() + 1000, TapahtumanTyyppi.SAAPUMINEN));
        tapahtumalista.lisaaTapahtuma(new Tapahtuma("Poistuminen 1", System.currentTimeMillis() + 2000, TapahtumanTyyppi.POISTUMINEN));
        tapahtumalista.lisaaTapahtuma(new Tapahtuma("Saapuminen 2", System.currentTimeMillis() + 500, TapahtumanTyyppi.SAAPUMINEN));

        System.out.println("\nTulostetaan tapahtumalista:");
        tapahtumalista.tulostaTapahtumat();

        while (!tapahtumalista.onkoTyhja()) {
            Tapahtuma seuraava = tapahtumalista.seuraavaTapahtuma();
            System.out.println("Käsitellään tapahtuma: " + seuraava);
        }
    }
}
