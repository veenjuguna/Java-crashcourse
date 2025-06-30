import java.util.Scanner;

public class logicgates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("🎂 How old are you? ");
        int age = scanner.nextInt();

        System.out.print("🪪 Do you have an ID? (true/false): ");
        boolean hasID = scanner.nextBoolean();

        if (age >= 18 && hasID) {
            System.out.println("✅ You may enter.");
        } else {
            System.out.println("❌ Denied.");
        }
    }
}
