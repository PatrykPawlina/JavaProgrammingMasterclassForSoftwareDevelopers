package _7_OOP_part_2_composition_encapsulation_polymorphism.encapsulation.challange;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel > 0 && tonerLevel < 100)
            this.tonerLevel = tonerLevel;
        else
            this.tonerLevel = -1;
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public void addToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (this.tonerLevel + tonerAmount <= 100) {
                this.tonerLevel += tonerAmount;
                System.out.println("Now toner level is = " + this.tonerLevel + " %.");
            } else if (this.tonerLevel + tonerAmount > 100) {
                System.out.println("To much toner level.");
            }
        } else
            System.out.println("Error, invalid toner amount.");
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if (this.duplex) {
            pagesToPrint = pagesToPrint / 2 + pagesToPrint % 2;
            System.out.println("Printing in duplex mode");
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
