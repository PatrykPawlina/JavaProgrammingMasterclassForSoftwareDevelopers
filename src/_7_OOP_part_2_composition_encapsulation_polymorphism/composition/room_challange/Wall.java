package _7_OOP_part_2_composition_encapsulation_polymorphism.composition.room_challange;

public class Wall {
    private String direction;

    public Wall(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }

    public void changeDirection(Wall wall, String newDirection) {
        wall.direction = newDirection;
        System.out.println(newDirection);
    }
}
