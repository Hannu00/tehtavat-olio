class Theater {
    private int totalSeats;
    private int availableSeats;

    public Theater(int totalSeats) {
        this.totalSeats = totalSeats;
        this.availableSeats = totalSeats;
    }

    public synchronized boolean reserveSeats(int customerID, int numSeats) {
        if (availableSeats >= numSeats) {
            availableSeats -= numSeats;
            System.out.println("Asiakas " + customerID + " varasi " + numSeats + " lippua.");
            return true;
        } else {
            System.out.println("Asiakas " + customerID + " ei voinut varata " + numSeats + " lippua.");
            return false;
        }
    }
}
