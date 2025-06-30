import java.util.Scanner;

public class gradeanalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("🎓 How many students? ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // flush newline

        String[] names = new String[numStudents];
        double[][] grades = new double[numStudents][3];
        double[] averages = new double[numStudents];

        // 📥 Input student names and grades
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\n👤 Student " + (i + 1));
            System.out.print("Name: ");
            names[i] = scanner.nextLine();

            for (int j = 0; j < 3; j++) {
                System.out.print("📚 Grade for Subject " + (j + 1) + ": ");
                grades[i][j] = scanner.nextDouble();
            }
            scanner.nextLine(); // flush newline
        }

        // 📊 Calculate averages
        double highestAvg = 0;
        double lowestAvg = 100;
        int highestIndex = -1;

        for (int i = 0; i < numStudents; i++) {
            double sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += grades[i][j];
            }
            averages[i] = sum / 3;

            if (averages[i] > highestAvg) {
                highestAvg = averages[i];
                highestIndex = i;
            }

            if (averages[i] < lowestAvg) {
                lowestAvg = averages[i];
            }
        }

        // 📈 Class average

        // 🧾 Report
        System.out.println("\n📄 Student Performance Report");
        System.out.println("===================================");
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("👩‍🎓 %s → Average: %.2f", names[i], averages[i]);
            if (averages[i] < 50) {
                System.out.print(" ⚠️ Needs Help");
            }
            System.out.println();
        }

        System.out.println("\n🏆 Top Performer: " + names[highestIndex] + " (Avg: " + highestAvg + ")");
        System.out.println("Passed to next Level!");  // ✅ All good

    }
}