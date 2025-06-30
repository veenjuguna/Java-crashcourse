import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("🎫 How old are you? ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("✅ You can enter the club 🕺🏽");
        } else {
            System.out.println("❌ Sorry, you’re not allowed in 🚫");
        }
    }
}
