package _9_inner_and_abstract_classes_and_interfaces.inner_class.button;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Button button = new Button("Number 1");

    public static void main(String[] args) {
        class ClickListener implements Button.OnClickListener {

            public ClickListener() {
                System.out.println("I've been attached");
            }

            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        }
        button.setOnClickListener(new ClickListener());
        listen();
    }

    private static void listen() {
        boolean quit = false;
        while (!quit) {
            int choice = scanner.nextInt();
            //   scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    button.onClick();
            }
        }
    }
}
