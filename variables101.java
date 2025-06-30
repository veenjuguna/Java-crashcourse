public class variables101 {
    public static void main(String[] args) {
        int age = 19;
        double height = 5.6;
        char grade = 'A';
        String name = "Ivy";
        boolean isJavaFun = true;

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " ft");
        System.out.println("Grade: " + grade);
        System.out.println("Java is fun: " + isJavaFun);

        System.out.printf("Hello %s! You are %d years old and %.1f ft tall.\n", name, age, height);
    }
}
