package exceptions;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Character player = new Character();

        do {
            System.out.println("Vie du joueur : " + player.getHealth());
            System.out.println("Combien de PV à enlever ?");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            try {
                player.getsBlow(choice);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (player.getHealth() > 0);
    }
}
