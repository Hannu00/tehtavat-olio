public class PalvelupisteSovellus {
    public static void main(String[] args) {
        Palvelupiste palvelupiste = new Palvelupiste();
        int asiakasMaara = 5;

        // Luodaan haluttu määrä asiakkaita ja lisätään ne jonoon
        for (int i = 0; i < asiakasMaara; i++) {
            Asiakas asiakas = new Asiakas();
            palvelupiste.lisaaJonoon(asiakas);
        }

        // Palvele asiakkaat ja laske keskimääräinen palveluaika
        long ennen = System.currentTimeMillis();
        palvelupiste.palvele();
        long jalki = System.currentTimeMillis();
        double keskiarvo = (jalki - ennen) / (double) asiakasMaara;
        System.out.println("Keskimääräinen palveluaika: " + keskiarvo + " ms");
    }
}
