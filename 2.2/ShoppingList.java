import java.util.ArrayList;

public class ShoppingList {
    private String purpose;
    private ArrayList<String> items;

    public ShoppingList(String purpose) {
        this.purpose = purpose;
        this.items = new ArrayList<>();
    }

    public void addItem(String item) {
        items.add(item);
        System.out.println(item + " added to the shopping list for " + purpose);
    }

    public void removeItem(String item) {
        if (items.contains(item)) {
            items.remove(item);
            System.out.println("Removed \"" + item + "\" from the shopping list for " + purpose);
        } else {
            System.out.println("\"" + item + "\" is not in the shopping list for " + purpose);
        }
    }

    public void displayList() {
        System.out.println("Shopping List for " + purpose + ":");
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i + 1) + ". " + items.get(i));
        }
    }

    public String getPurpose() {
        return purpose;
    }
}
