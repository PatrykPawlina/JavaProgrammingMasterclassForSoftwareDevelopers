package _9_inner_and_abstract_classes_and_interfaces.interfaces.saveable_challange;

import java.util.ArrayList;
import java.util.List;

public class Player implements Saveable {

    private String name;
    private int hitPoints;
    private int strenght;
    private String weapon;

    public Player(String name, int hitPoints, int strenght) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strenght = strenght;
        this.weapon = "Sword";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrenght() {
        return strenght;
    }

    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public List<String> write() {
        List<String> value = new ArrayList<>();
        value.add(0, this.name);
        value.add(1, "" + this.hitPoints);
        value.add(2, "" + this.strenght);
        value.add(3, "" + this.weapon);
        return value;
    }

    @Override
    public void read(List<String> savedValue) {
        if (savedValue != null && savedValue.size() > 0) {
            this.name = savedValue.get(0);
            this.hitPoints = Integer.parseInt(savedValue.get(1));
            this.strenght = Integer.parseInt(savedValue.get(2));
            this.weapon = savedValue.get(3);

        }
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strenght=" + strenght +
                ", weapon='" + weapon + '\'' +
                '}';
    }
}
