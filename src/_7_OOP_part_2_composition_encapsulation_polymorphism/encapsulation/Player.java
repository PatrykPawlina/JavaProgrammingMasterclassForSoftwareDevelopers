package _7_OOP_part_2_composition_encapsulation_polymorphism.encapsulation;

public class Player {
//    public String fullName;
//    public int health;
//    public String weapon;

    private String fullName;
    private int health;
    private String weapon;

    public Player(String fullName, int health, String weapon) {
        this.fullName = fullName;
        this.health = health;
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Player{" +
                "fullName='" + fullName + '\'' +
                ", health=" + health +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    public String getFullName() {
        return fullName;
    }

    public int getHealth() {
        return health;
    }

    public String getWeapon() {
        return weapon;
    }

    public void loseHealth(int damage) {
        this.health -= damage;
        if (this.health < 0) {
            System.out.println("Player knocked out");
        }
    }

    public int healthRemaining() {
        return this.health;
    }
}
