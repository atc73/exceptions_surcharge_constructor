import java.util.LinkedList;
import java.util.Scanner;

public class Collec {

    public static Scanner scanner = new Scanner(System.in);

    private static int getIntInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static String getStringInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        LinkedList chores = new LinkedList<>();


        int choice;
        do {
            System.out.println("1 : entrer une tâche");
            System.out.println("2 : j'ai fini");
            choice = getIntInput();
            if (choice == 1) {
                System.out.println("Entrez votre tâche");
                String chore = getStringInput();
                chores.add(chore);
            }
        } while (choice == 1);


        System.out.println("Vos tâches ont été créées");
        System.out.println(chores);

        int choice2;

        do {
            System.out.println("Voulez-vous effectuer une tâche");
            System.out.println("1 : oui / 2 : non");
            choice2 = getIntInput();
            if (choice2 == 1){
                chores.pop();
            }
            System.out.println(chores);
        } while (choice2 == 1);

        System.out.println("Il vous reste ces tâches à effectuer : " + chores);
    }
}
