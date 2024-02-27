// Write a Calculator class that has the ability to sum positive integers. A negative integer should throw an exception.
//
//The class acts as the model in the MVC pattern. It should have the following methods:
//
//A method that resets the calculator to zero.
//A method that adds an integer to the calculator.
//A method that returns the current value of the calculator.
//In addition, write a temporary main method that creates an instance of the Calculator class and uses it to calculate the sum of a few integers.

// Used comment in start to write this calculator with copilot
// GitHub Copilot voi nopeuttaa koodausta, mutta sen rajoitettu kontekstituntemus ja
// tuottama koodi ei välttämättä vastaa koodia jota halutaan joten tulee olla tarkkana sen kanssa.

// The Calculator class has a single instance variable, value, which is used to store the current value of the calculator.
// The class has a constructor that initializes the value to 0. The class has a reset method that sets the value to 0.
// The class has an add method that adds a given integer to the value. If the given integer is negative, the method throws an IllegalArgumentException.
// The class has a getValue method that returns the current value of the calculator.
public class Calculator {
    private int value;

    public Calculator() {
        this.value = 0;
    }

    public void reset() {
        this.value = 0;
    }

    public void add(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Only positive numbers are allowed");
        }
        this.value += value;
    }

    public int getValue() {
        return this.value;
    }

    // The Calculator class has a single instance variable, value, which is used to store the current value of the calculator.
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(5);
        calculator.add(7);
        System.out.println(calculator.getValue());
    }
}