package _7_OOP_part_2_composition_encapsulation_polymorphism.composition.room_challange;

public class Ceiling {
    private int height;
    private int paintedColor;

    public Ceiling(int height, int paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }

    public void changePaintColor(int newPaintedColour) {

        this.paintedColor = newPaintedColour;
        System.out.println("Ceiling is now  painted in " + newPaintedColour + " color");
    }

    public int getHeight() {
        return height;
    }

    public int getPaintedColor() {
        return paintedColor;
    }
}
