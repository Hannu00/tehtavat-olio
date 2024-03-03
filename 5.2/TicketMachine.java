public class TicketMachine {
    public static void main(String[] args) {
        int totalSeats = 250;
        Theater theater = new Theater(totalSeats);

        for (int i = 1; i <= 250; i++) {
            int numSeats = (i % 5) + 1; // Vaihteleva määrä varattavia paikkoja kullakin asiakkaalla
            Thread customerThread = new Customer(i, numSeats, theater);
            customerThread.start();
        }
    }
}
