import java.util.*;

public class cosolesuite {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true;
        String password = "badgirl2024";

        // 🧱 Password Gate
        System.out.println("🔐 Welcome! Enter password to unlock the console:");
        String input = scanner.nextLine();
        while (!input.equals(password)) {
            System.out.println("❌ Wrong password. Try again:");
            input = scanner.nextLine();
        }
        System.out.println("✅ Access Granted. Welcome, Ivy 💅\n");
        System.out.println("👩‍💻  Console Suite v1.0 by Ivy Njuguna");
        System.out.println("⚙️ Loading modules...");
        Thread.sleep(1000);
        System.out.println("✅ Ready.\n");


        while (keepRunning) {
            // 🧭 Main Menu
            System.out.println("\n📋 Choose an option:");
            System.out.println("1️⃣ Triangle Analyzer");
            System.out.println("2️⃣ Even/Odd Checker");
            System.out.println("3️⃣ Sum Until 0");
            System.out.println("4️⃣ Countdown Timer");
            System.out.println("5️⃣ Math Mini Game");
            System.out.println("6️⃣ Live Poll");
            System.out.println("7️⃣ Exit");

            System.out.print("🔎 Enter choice: ");
            int choice;
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine(); // clean newline
            } else {
                System.out.println("❌ Invalid input. Enter a number.");
                scanner.nextLine(); // flush bad input
                continue;
            }

            switch (choice) {
                case 1:
                    // 📐 Triangle Analyzer
                    int count;
                    while (true) {
                        System.out.print("📐 How many triangles to analyze? ");
                        if (scanner.hasNextInt()) {
                            count = scanner.nextInt();
                            scanner.nextLine();
                            break;
                        } else {
                            System.out.println("❌ Invalid input. Please enter a number.");
                            scanner.nextLine();
                        }
                    }

                    int[][] triangles = new int[count][2];

                    for (int i = 0; i < count; i++) {
                        System.out.println("▶ Triangle " + (i + 1));
                        for (int j = 0; j < 2; j++) {
                            while (true) {
                                System.out.print("Angle " + (j + 1) + ": ");
                                if (scanner.hasNextInt()) {
                                    triangles[i][j] = scanner.nextInt();
                                    scanner.nextLine();
                                    break;
                                } else {
                                    System.out.println("❌ Please enter a valid angle.");
                                    scanner.nextLine();
                                }
                            }
                        }
                    }

                    System.out.println("📊 Triangle Summary:");
                    for (int i = 0; i < count; i++) {
                        int a1 = triangles[i][0], a2 = triangles[i][1];
                        int a3 = 180 - (a1 + a2);

                        System.out.print("🔺 Triangle " + (i + 1) + ": ");
                        if (a1 + a2 >= 180 || a1 <= 0 || a2 <= 0 || a3 <= 0) {
                            System.out.println("❌ Invalid");
                        } else if (a1 == 60 && a2 == 60) {
                            System.out.println("🟨 Equilateral");
                        } else if (a1 == a2 || a2 == a3 || a1 == a3) {
                            System.out.println("🟰 Isosceles");
                        } else {
                            System.out.println("📐 Scalene");
                        }

                        if (a1 == 90 || a2 == 90 || a3 == 90) {
                            System.out.println("🟦 It's a right-angled triangle!");
                        }
                    }
                    break;

                case 2:
                    // 🔢 Even/Odd Checker
                    System.out.print("🔢 Enter a number: ");
                    if (scanner.hasNextInt()) {
                        int num = scanner.nextInt();
                        scanner.nextLine();
                        if (num % 2 == 0) System.out.println("✅ It's even!");
                        else System.out.println("⚠️ It's odd!");
                    } else {
                        System.out.println("❌ That's not a number!");
                        scanner.nextLine();
                    }
                    break;

                case 3:
                    // ➕ Sum Until 0
                    int sum = 0;
                    int number;
                    System.out.println("🧮 Enter numbers to add (0 to stop):");
                    while (true) {
                        System.out.print("➕ ");
                        if (scanner.hasNextInt()) {
                            number = scanner.nextInt();
                            if (number == 0) break;
                            sum += number;
                        } else {
                            System.out.println("❌ Invalid number.");
                            scanner.nextLine();
                            continue;
                        }
                    }
                    scanner.nextLine();
                    System.out.println("🔚 Total sum: " + sum);
                    break;

                case 4:
                    // 🕰 Countdown
                    System.out.print("⏱ Enter number to count down from: ");
                    if (scanner.hasNextInt()) {
                        int start = scanner.nextInt();
                        scanner.nextLine();
                        for (int i = start; i >= 0; i--) {
                            System.out.println(i);
                            Thread.sleep(500); // half a second
                        }
                        System.out.println("🚀 Liftoff!");
                    } else {
                        System.out.println("❌ Not a valid number.");
                        scanner.nextLine();
                    }
                    break;

                case 5:
                    // 🎮 Math Mini Game
                    System.out.println("🎯 Solve: What is 7 x 8?");
                    if (scanner.hasNextInt()) {
                        int answer = scanner.nextInt();
                        scanner.nextLine();
                        if (answer == 56) {
                            System.out.println("🎉 Correct!");
                        } else {
                            System.out.println("💔 Nope. The answer is 56.");
                        }
                    } else {
                        System.out.println("❌ Come on now. That's not math.");
                        scanner.nextLine();
                    }
                    break;

                case 6:
                    // 📊 Poll
                    int yes = 0, no = 0;
                    for (int i = 0; i < 3; i++) {
                        System.out.print("🗳️ Voter " + (i + 1) + " – Do you love Java? (yes/no): ");
                        String vote = scanner.nextLine().trim().toLowerCase();
                        if (vote.equals("yes")) yes++;
                        else if (vote.equals("no")) no++;
                        else System.out.println("🤨 Invalid vote.");
                    }
                    System.out.println("✅ YES: " + yes);
                    System.out.println("❌ NO: " + no);
                    break;

                case 7:
                    // 🛑 Exit
                    keepRunning = false;
                    System.out.println("👋 Goodbye, Ivy. See you soon!");
                    break;

                default:
                    System.out.println("❓ Invalid choice");
            }
        }

        scanner.close();
    }
}
