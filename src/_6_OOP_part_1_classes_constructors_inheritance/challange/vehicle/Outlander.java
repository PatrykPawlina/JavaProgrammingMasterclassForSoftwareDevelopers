package _6_OOP_part_1_classes_constructors_inheritance.challange.vehicle;

public class Outlander extends Car {
    private int roadServicesMonth;

    public Outlander(int roadServicesMonth) {
        super("Outlander", "4WD", 5, 5, 6, false);
        this.roadServicesMonth = roadServicesMonth;
    }

    public void accelerate(int rate) {
        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity == 0) {
            stop();
            changeCurrentGear(1);
        } else if (newVelocity > 0 && newVelocity <= 10) {
            changeCurrentGear(1);
        } else if (newVelocity > 10 && newVelocity <= 20) {
            changeCurrentGear(2);
        } else if (newVelocity > 20 && newVelocity <= 30) {
            changeCurrentGear(3);
        } else {
            changeCurrentGear(4);
        }

        if (newVelocity > 0)
            changeVelocity(newVelocity, getCurrentDirection());
    }
}


