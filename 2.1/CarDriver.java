public class CarDriver {
    public static void main(String[] args) {
        testCar();
        testCruiseControl();
    }

    public static void testCar() {
        System.out.println("Testing Original Car Class:");

        Car myCar = new Car("Sedan");
        myCar.accelerate();
        System.out.println("Current speed: " + myCar.getSpeed());
        System.out.println("Gasoline level: " + myCar.getGasolineLevel());
    }

    public static void testCruiseControl() {
        System.out.println("\nTesting Cruise Control Feature:");

        Car myCar = new Car("SUV");
        myCar.fillTank(50);

        testCruiseControlSetting(myCar, 60);
        testCruiseControlSetting(myCar, 120);

        myCar.turnOnCruiseControl(70);
        testAccelerateAndDecelerate(myCar);

        myCar.turnOffCruiseControl();
        System.out.println("Cruise Control turned off");
        printCurrentStatus(myCar);
    }

    private static void testCruiseControlSetting(Car car, float targetSpeed) {
        boolean success = car.turnOnCruiseControl(targetSpeed);
        System.out.println("Cruise Control turned on with target speed " + targetSpeed + ": " + success);
        printCurrentStatus(car);
    }

    private static void testAccelerateAndDecelerate(Car car) {
        car.accelerate();
        System.out.println("Accelerating... Current speed: " + car.getSpeed());
        car.decelerate(20);
        System.out.println("Decelerating... Current speed: " + car.getSpeed());
        printCurrentStatus(car);
    }

    private static void printCurrentStatus(Car car) {
        System.out.println("Current speed: " + car.getSpeed());
        System.out.println("Current target speed: " + car.getTargetSpeed());
    }
}
