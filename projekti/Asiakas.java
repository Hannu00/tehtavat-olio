public class Asiakas {
    private static int viimeisinId = 0;

    private int id;
    private long aloitusaika;
    private long lopetusaika;

    public Asiakas() {
        this.id = ++viimeisinId;
    }

    public int getId() {
        return id;
    }

    public void aloitaAsiointi() {
        aloitusaika = System.currentTimeMillis();
    }

    public void lopetaAsiointi() {
        lopetusaika = System.currentTimeMillis();
    }

    public long kulutettuAika() {
        return lopetusaika - aloitusaika;
    }

    public static void main(String[] args) {
        Asiakas asiakas1 = new Asiakas();
        asiakas1.aloitaAsiointi();
        // Simuloidaan asiointia odottamalla satunnainen aika
        try {
            Thread.sleep((long) (Math.random() * 5000) + 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        asiakas1.lopetaAsiointi();

        System.out.println("Asiakas " + asiakas1.getId() + " kulutettu aika: " + asiakas1.kulutettuAika() + " ms");
    }
}


