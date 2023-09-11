import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final int CREATE_HERO= 1;
        final int EXIT_PROGRAM= 9;

        System.out.println("Welcome to superhero universe");

        Database database = new Database();

        Scanner keyboard = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Create Hero");
            System.out.println("9. Exit program");
            choice = keyboard.nextInt();


            if (choice == CREATE_HERO) {

                System.out.println("Create your hero:\n");
                System.out.println("Your Superhero name?");
                String name = keyboard.next();
                System.out.println("Your real name?");
                String realName = keyboard.next();
                System.out.println("Your superpower?");
                String superPower = keyboard.next();
                System.out.println("What year did you get created?");
                int yearCreated = keyboard.nextInt();
                System.out.println("Is your superhero human?");
                String isHuman = keyboard.next();
                System.out.println("What is your superhero strenght?");
                String strenght = keyboard.next();

                Superhero hero = new Superhero(name, realName, superPower, yearCreated, isHuman, strenght);
                database.addSuperhero(hero);

                System.out.println("new hero created: " + hero);


            }
        } while(choice != EXIT_PROGRAM);
        System.out.println("See you next time");
    }


}
