import java.util.ArrayList;

public class GroceryListManager {
    private ShoppingList defaultShoppingList;
    private ArrayList<ShoppingList> shoppingLists;

    public GroceryListManager() {
        this.defaultShoppingList = new ShoppingList("Default");
        this.shoppingLists = new ArrayList<>();
        this.shoppingLists.add(defaultShoppingList);
    }

    public void addItemToDefaultList(String item) {
        defaultShoppingList.addItem(item);
    }

    public void addItemToShoppingList(String item, String purpose) {
        for (ShoppingList shoppingList : shoppingLists) {
            if (shoppingList.getPurpose().equals(purpose)) {
                shoppingList.addItem(item);
                return;
            }
        }
        System.out.println("Shopping list for " + purpose + " not found.");
    }

    public void removeItemFromShoppingList(String item, String purpose) {
        for (ShoppingList shoppingList : shoppingLists) {
            if (shoppingList.getPurpose().equals(purpose)) {
                shoppingList.removeItem(item);
                return;
            }
        }
        System.out.println("Shopping list for " + purpose + " not found.");
    }

    public void displayShoppingList(String purpose) {
        for (ShoppingList shoppingList : shoppingLists) {
            if (shoppingList.getPurpose().equals(purpose)) {
                shoppingList.displayList();
                return;
            }
        }
        System.out.println("Shopping list for " + purpose + " not found.");
    }

    public static void main(String[] args) {
        GroceryListManager groceryListManager = new GroceryListManager();

        groceryListManager.addItemToDefaultList("Apples");
        groceryListManager.addItemToDefaultList("Milk");
        groceryListManager.addItemToDefaultList("Bread");

        groceryListManager.displayShoppingList("Default");
    }
}
