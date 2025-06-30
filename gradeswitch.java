import java.util.Scanner;

public class gradeswitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your grade (A/B/C/D/F): ");
        char grade = scanner.next().charAt(0);

        switch (grade) {
            case 'A':
                System.out.println("🔥 You're a genius!");
                break;
            case 'B':
                System.out.println("🧠 Solid work.");
                break;
            case 'C':
                System.out.println("🙂 Not bad.");
                break;
            case 'D':
                System.out.println("📚 Keep pushing!");
                break;
            case 'F':
                System.out.println("💀 We need to talk.");
                break;
            default:
                System.out.println("🤷 Unknown grade.");
        }
    }
}
