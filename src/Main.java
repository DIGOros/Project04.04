import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.println("Welcome to the Book Recommender System!");
            System.out.print("May I know your name? ");
            String name = scanner.nextLine();

            System.out.print("Hello, " + name + "! How old are you? ");
            int age = scanner.nextInt();

            scanner.nextLine(); // Consume the newline character left by nextInt()

            System.out.print("What is your favorite book genre? ");
            String genre = scanner.nextLine().toLowerCase();

            String recommendation = "";

            if (age >= 13 && age <= 16) {
                if (genre.equals("detective")) {
                    recommendation = "I recommend you read 'Nancy Drew' series by Carolyn Keene.";
                } else {
                    recommendation = "I recommend you read 'Percy Jackson' series by Rick Riordan.";
                }
            } else if (age >= 17 && age <= 25) {
                if (genre.equals("non-fiction")) {
                    recommendation = "I recommend you read 'Sapiens: A Brief History of Humankind' by Yuval Noah Harari.";
                } else {
                    recommendation = "I recommend you read 'The Hunger Games' series by Suzanne Collins.";
                }
            } else {
                recommendation = "I recommend you read 'To Kill a Mockingbird' by Harper Lee.";
            }

            System.out.println(recommendation);
            System.out.print("Do you want to continue (Y/N)? ");
            choice = scanner.next().trim();

            scanner.nextLine(); // Consume the newline character left by next()

        } while (choice.equalsIgnoreCase("Y"));

        System.out.println("Thank you for using the Book Recommender System!");
        scanner.close();
    }
}
