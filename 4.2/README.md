The program is a simple calculator implemented in Java. It follows the Model-View-Controller (MVC) pattern, featuring a
Calculator class as the model. The calculator has methods to reset its value, add positive integers (throwing an
exception for negative inputs), and retrieve the current value. The main method demonstrates the calculator's
functionality by creating an instance, adding positive integers, and displaying the result. The code incorporates
exception handling and showcases the basic usage of GitHub Copilot for code generation.

´´´

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

´´´

explanation of the code:
The Calculator class has a single instance variable, value, which is used to store the current value of the calculator.
The reset method sets the value to 0, the add method adds a positive integer to the value, and the getValue method
returns the current value. The main method demonstrates the functionality of the calculator by creating an instance,
adding positive integers, and displaying the result. The code incorporates exception handling to ensure that only
positive numbers are allowed as input to the add method. This example showcases the basic usage of GitHub Copilot for
code generation.

 
