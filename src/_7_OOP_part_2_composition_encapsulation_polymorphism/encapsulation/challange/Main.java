package _7_OOP_part_2_composition_encapsulation_polymorphism.encapsulation.challange;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(40, true);
        System.out.println("Initial page count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
        pagesPrinted = printer.printPages(1);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
        printer.addToner(88);

        Printer printer1 = new Printer(70, false);
        int pagesPrinted1 = printer1.printPages(78);
        System.out.println("Pages printed was " + pagesPrinted1 + " new total print count for printer = " + printer1.getPagesPrinted());
    }
}

