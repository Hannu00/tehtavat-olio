public class CoffeeMaker {
    private boolean powerOn;
    private String coffeeType;
    private int coffeeAmount;

    public CoffeeMaker() {
        this.powerOn = false;
        this.coffeeType = "Normal";
        this.coffeeAmount = 10;
    }

    public void powerOnOff() {
        if (powerOn) {
            System.out.println("Coffee maker turned off");
        } else {
            System.out.println("Coffee maker turned on");
        }
        powerOn = !powerOn;
    }

    public void selectCoffeeType(String type) {
        if (powerOn) {
            coffeeType = type;
            System.out.println("Selected coffee type: " + coffeeType);
        } else {
            System.out.println("Turn on the coffee maker to change coffee type");
        }
    }

    public void selectCoffeeAmount(int amount) {
        if (powerOn) {
            if (amount >= 10 && amount <= 80) {
                coffeeAmount = amount;
                System.out.println("Selected coffee amount: " + coffeeAmount + " ml");
            } else {
                System.out.println("Invalid coffee amount. Please choose between 10 and 80 ml");
            }
        } else {
            System.out.println("Turn on the coffee maker to change coffee amount");
        }
    }

    public void makeCoffee() {
        if (powerOn) {
            System.out.println("Making " + coffeeAmount + " ml of " + coffeeType + " coffee");
        } else {
            System.out.println("Turn on the coffee maker to make coffee");
        }
    }

    public static void main(String[] args) {
        CoffeeMaker myCoffeeMaker = new CoffeeMaker();

        myCoffeeMaker.powerOnOff();
        myCoffeeMaker.selectCoffeeType("Espresso");
        myCoffeeMaker.selectCoffeeAmount(50);
        myCoffeeMaker.makeCoffee();

        myCoffeeMaker.powerOnOff();
        myCoffeeMaker.makeCoffee();
    }
}
