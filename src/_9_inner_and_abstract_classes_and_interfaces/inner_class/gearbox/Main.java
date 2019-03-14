package _9_inner_and_abstract_classes_and_interfaces.inner_class.gearbox;

public class Main {
    public static void main(String[] args) {
        GearBox mcLaren = new GearBox(6);
//        GearBox.Gear first = mcLaren.new Gear(1,12.3);    declaration the instance of the inner class
//        GearBox.Gear second = mcLaren.new Gear(2,12.6);
//        System.out.println(first.driveSpeed(1000)+second.driveSpeed(1550));
        mcLaren.operateClutch(true);
        mcLaren.changeGear(1);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.speedWheel(1000));
        mcLaren.changeGear(2);
        System.out.println(mcLaren.speedWheel(3000));
        mcLaren.operateClutch(true);
        mcLaren.changeGear(3);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.speedWheel(6000));
    }
}

