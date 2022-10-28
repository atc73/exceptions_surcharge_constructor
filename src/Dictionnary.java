import java.util.HashMap;
import java.util.Scanner;

public class Dictionnary {

    private static int getIntInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static String getStringInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        HashMap<String, String> myDictionnary = new HashMap<>();

        myDictionnary.put("hiver", "Il fait froid, il y a de la neige et tu peux faire du ski...enfin si t'as des sous");
        myDictionnary.put("été", "Il fait chaud, il y a du soleil et t'es content");
        myDictionnary.put("automne", "Il fait ni chaud ni froid et la rentrée ça te fait chier");
        myDictionnary.put("printemps", "Il fait ni chaud ni froid et c'est déjà pas mal");

        int choice;
        do {
            System.out.println("1 : chercher un mot");
            System.out.println("2 : j'ai fini");
            choice = getIntInput();
            if (choice == 1) {
                System.out.println("Entrez votre mot");
                String word = getStringInput();
                System.out.println(myDictionnary.getOrDefault(word, "Désolé, ce mot n'existe pas."));
            }
        } while (choice == 1);

        System.out.println("Goodbye!");
    }
}
