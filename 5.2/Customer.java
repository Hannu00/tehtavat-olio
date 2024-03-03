public class Customer extends Thread {
    private int customerID;
    private int numSeats;
    private Theater theater;

    public Customer(int customerID, int numSeats, Theater theater) {
        this.customerID = customerID;
        this.numSeats = numSeats;
        this.theater = theater;
    }

    @Override
    public void run() {
        theater.reserveSeats(customerID, numSeats);
    }
}
