public class TSArrayListTest {

    public static void main(String[] args) {
        TSArrayListManager<String> manager = new TSArrayListManager<>();

        Thread addThread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                manager.addElement("Thread1-Element" + i);
            }
        });

        Thread addThread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                manager.addElement("Thread2-Element" + i);
            }
        });

        Thread removeThread = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                manager.removeElement("Thread1-Element" + i);
            }
        });

        addThread1.start();
        addThread2.start();
        removeThread.start();

        try {
            addThread1.join();
            addThread2.join();
            removeThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final ArrayList Size: " + manager.getSize());
    }
}
