package _7_OOP_part_2_composition_encapsulation_polymorphism.composition.room_challange;

public class Main {
    public static void main(String[] args) {
        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");
        Ceiling ceiling = new Ceiling(12, 55);
        Bed bed = new Bed("Modern", 4, 40, 2, 2);
        Lamp lamp = new Lamp("Retro", false, 8);
        Bedroom bedroom = new Bedroom("Lovely", wall1, wall2, wall3, wall4, ceiling, bed, lamp);

        System.out.println("-----------Wall-----------");
        System.out.println(wall1.getDirection());
        wall1.changeDirection(wall1, "New Direction");
        System.out.println("------------Bedroom - wall-------------");
        System.out.println(bedroom.getWall1().getDirection());
        bedroom.getWall2().changeDirection(wall3, "Wall3 new Direction");
        System.out.println(bedroom.getWall3().getDirection());
        System.out.println("------------Ceiling-------------");
        System.out.println(ceiling.getHeight());
        System.out.println(ceiling.getPaintedColor());
        ceiling.changePaintColor(78);
        System.out.println("------------Bedroom - ceiling-------------");
        System.out.println(bedroom.getCeiling().getHeight());
        System.out.println(bedroom.getCeiling().getPaintedColor());
        bedroom.getCeiling().changePaintColor(66);
        System.out.println("------------Bed-------------");
        System.out.println(bed.getHeight());
        System.out.println(bed.getPillows());
        System.out.println(bed.getQuilt());
        System.out.println(bed.getSheets());
        System.out.println(bed.getStyle());
        bed.make();
        System.out.println("------------Bedroom - bed-------------");
        System.out.println(bedroom.getBed().getHeight());
        System.out.println(bedroom.getBed().getStyle());
        System.out.println(bedroom.getBed().getSheets());
        System.out.println(bedroom.getBed().getQuilt());
        System.out.println(bedroom.getBed().getPillows());
        bedroom.getBed().make();
        System.out.println("------------Lamp-------------");
        System.out.println(lamp.isBattery());
        System.out.println(lamp.getStyle());
        System.out.println(lamp.getGlobRating());
        lamp.turnOn();
        System.out.println("------------Bedroom - lamp-------------");
        System.out.println(bedroom.getLamp().getStyle());
        System.out.println(bedroom.getLamp().getGlobRating());
        System.out.println(bedroom.getLamp().isBattery());
        System.out.println("------------Bedroom-------------");
        bedroom.getLamp().turnOn();
        System.out.println(bedroom.getName());
        bedroom.makeBed();
    }
}
