package _7_OOP_part_2_composition_encapsulation_polymorphism.encapsulation;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("James", 60, "Laser");

        System.out.println(player.getFullName());
        System.out.println(player.getHealth());
        System.out.println(player.getWeapon());
        System.out.println(player.toString());
        int damage = 45;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        damage = 50;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Doda", 90, "Tank");
        System.out.println("Initial health is " + enhancedPlayer.getHealth());
        enhancedPlayer.loseHealth(25);
        System.out.println(enhancedPlayer.getHealth());
    }
}
