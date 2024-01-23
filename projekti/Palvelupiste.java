import java.util.LinkedList;
import java.util.Queue;

public class Palvelupiste {
    private Queue<Asiakas> jono = new LinkedList<>();

    public void lisaaJonoon(Asiakas asiakas) {
        jono.add(asiakas);
    }

    public Asiakas poistaJonosta() {
        return jono.poll();
    }

    public void palvele() {
        while (!jono.isEmpty()) {
            Asiakas asiakas = jono.peek();
            System.out.println("Asiakas " + asiakas.getId() + " aloitti palvelun klo " + asiakas.getSaapumisaika());

            try {
                Thread.sleep(asiakas.getPalveluaika());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Asiakas palvellutAsiakas = poistaJonosta();
            System.out.println("Asiakas " + palvellutAsiakas.getId() + " päätti palvelun klo " + (System.currentTimeMillis()));
        }
    }
}
