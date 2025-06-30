import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // create a Scanner object

        System.out.print("👋 Hey! What's your name? ");
        String userName = scanner.nextLine();  // reads a whole line

        System.out.print("🎂 How old are you? ");
        int userAge = scanner.nextInt();  // reads an integer

        System.out.print("📏 What's your height in feet (e.g. 5.6)? ");
        double height = scanner.nextDouble();  // reads a decimal number

        System.out.println("\n✨ Hello " + userName + "!");
        System.out.println("You're " + userAge + " years old and " + height + " ft tall.");
        System.out.printf("Next year, you'll be %d years old!\n", userAge + 1);
    }
}
