import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final int CREATE_HERO = 1;
        final int EXIT_PROGRAM = 9;
        final int SUPERHERO_LIST = 4;
        final int SEARCH_SUPERHERO = 7;
        int choice;

        System.out.println("Welcome to superhero universe");

        Database database = new Database();
        Scanner keyboard = new Scanner(System.in);

        do {
            System.out.println("\nMake your choice sir");
            System.out.println("1. Create a Superhero");
            System.out.println("4. Print superhero list");
            System.out.println("7. Search for a superhero");
            System.out.println("9. Exit program");
            choice = keyboard.nextInt();

            keyboard.nextLine(); //clearer scanneren

            if (choice == CREATE_HERO) {

                System.out.println("Create your hero:\n");
                System.out.println("Your Superhero name?");
                String name = keyboard.nextLine();
                System.out.println("Your real name?");
                String realName = keyboard.nextLine();
                System.out.println("Your superpower?");
                String superPower = keyboard.nextLine();
                System.out.println("What year did you get created?");
                int yearCreated = keyboard.nextInt();
                keyboard.nextLine();
                System.out.println("Is your superhero human?");
                String isHuman = keyboard.nextLine();
                System.out.println("What is your superhero strenght?");
                String strenght = keyboard.nextLine();

                Superhero hero = new Superhero(name, realName, superPower, yearCreated, isHuman, strenght);
                database.addSuperhero(hero);

                System.out.println("New hero created:\n " + hero);

            }
            else if (choice == SUPERHERO_LIST) {
                System.out.println(database.getSuperherolist());
            }

            else if (choice == SEARCH_SUPERHERO){
                System.out.println("What superhero do you wanna search for?");
                System.out.println(database.findSuperhero(keyboard.nextLine()));
            }

        } while (choice != EXIT_PROGRAM);
        System.out.println("See you next time");
    }

}
