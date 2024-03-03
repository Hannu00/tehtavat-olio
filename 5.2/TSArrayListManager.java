import java.util.ArrayList;
import java.util.List;

public class TSArrayListManager<T> {
    private final List<T> list = new ArrayList<>();
    private final Object lock = new Object();

    public void addElement(T element) {
        synchronized (lock) {
            list.add(element);
        }
    }

    public int getSize() {
        synchronized (lock) {
            return list.size();
        }
    }

    public void removeElement(T element) {
        synchronized (lock) {
            list.remove(element);
        }
    }
}
