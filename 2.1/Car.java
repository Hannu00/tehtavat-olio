public class Car {
    private float speed;
    private float gasolineLevel;
    private String typeName;
    private float targetSpeed;
    private boolean cruiseControlOn;
    private final float MIN_SPEED = 0;
    private final float MAX_SPEED = 200;

    public Car(String typeName) {
        this.speed = 0;
        this.gasolineLevel = 0;
        this.typeName = typeName;
        this.cruiseControlOn = false;
    }

    public Car(String typeName, float tankCapacity, float topSpeed) {
        this(typeName);
        fillTank(tankCapacity);
        setTopSpeed(topSpeed);
    }

    public void accelerate() {
        if (gasolineLevel > 0 && cruiseControlOn) {
            speed += 10;
            speed = Math.min(speed, targetSpeed);
        } else if (gasolineLevel > 0) {
            speed += 10;
            speed = Math.min(speed, MAX_SPEED);
        } else {
            speed = 0;
        }
    }

    void decelerate(int amount) {
        if (gasolineLevel > 0 && cruiseControlOn) {
            if (amount > 0)
                speed = Math.max(MIN_SPEED, speed - amount);
        } else if (gasolineLevel > 0) {
            if (amount > 0)
                speed = Math.max(MIN_SPEED, speed - amount);
        } else {
            speed = 0;
        }
    }

    float getSpeed() {
        return speed;
    }

    String getTypeName() {
        return typeName;
    }

    void fillTank(float tankCapacity) {
        gasolineLevel = Math.min(tankCapacity, 100);
    }

    float getGasolineLevel() {
        return gasolineLevel;
    }

    void setTopSpeed(float topSpeed) {
        this.speed = Math.max(MIN_SPEED, Math.min(topSpeed, MAX_SPEED));
    }

    boolean turnOnCruiseControl(float targetSpeed) {
        if (targetSpeed >= MIN_SPEED && targetSpeed <= MAX_SPEED) {
            this.targetSpeed = targetSpeed;
            cruiseControlOn = true;
            return true;
        } else {
            cruiseControlOn = false;
            System.out.println("Invalid target speed for cruise control");
            return false;
        }
    }

    void turnOffCruiseControl() {
        cruiseControlOn = false;
    }

    float getTargetSpeed() {
        return targetSpeed;
    }
}
