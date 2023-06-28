
// import java.util.Scanner;
// import javax.swing.JOptionPane;
// import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello");

        // This is a comment
        /*
         * This
         * is
         * a
         * comment
         */

        /* 1. VARIABLES */
        // int x = 21;
        // long x = 10212121212121L; // initialization
        // double y = 3.13;
        // float z = 3.14f;
        // boolean z = false;
        // boolean a = true;
        // char symbol = '@';
        // String name = "Daniil";

        // System.out.println("My number is: " + x);
        // System.out.println("My number is: " + y);
        // System.out.println("Hello " + name);

        // String x = "Water";
        // String y = "Kool-Aid";
        // String temp;

        // temp = x;
        // x = y;
        // y = temp;

        // System.out.println("x: " + x);
        // System.out.println("y: " + y);
        // System.out.println(temp);

        /* 2. USER INPUT */

        // Scanner scanner = new Scanner(System.in);

        // System.out.println("What is your name? ");
        // String name = scanner.nextLine();
        // System.out.println("How old are you? ");
        // int age = scanner.nextInt();
        // scanner.nextLine();
        // System.out.println("What is your favorite food?");
        // String food = scanner.nextLine();
        // System.out.println("Hello " + name);
        // System.out.println("You are " + age + " years old");
        // System.out.println("Your like " + food);

        /* 3. Expressions */

        // double friends = 10;

        // friends = friends / 3;

        // System.out.println(friends);

        /* 4. GUI intro */
        // String name = JOptionPane.showInputDialog("Enter your name: ");

        // JOptionPane.showMessageDialog(null, "Hello " + name);

        // int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));

        // JOptionPane.showMessageDialog(null, "You are " + age + " years old!");

        // double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your
        // height: "));

        // JOptionPane.showMessageDialog(null, "Your height is " + height + "cm");

        /* 5. Math class */

        // double x = 3.14;
        // double y = -10;

        // double z = Math.min(x, y);
        // double g = Math.max(x, y);
        // double h = Math.abs(y);
        // h = Math.ceil(x)
        // double x;
        // double y;
        // double z;
        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Enter side x: ");
        // x = scanner.nextDouble();
        // System.out.println("Enter side y: ");
        // y = scanner.nextDouble();
        // System.out.println("Enter side z: ");
        // z = Math.sqrt((x * x) + (y * y));
        // System.out.println(z);

        // scanner.close();

        /* 6. Random numbers */

        // Random random = new Random();

        // // int x = random.nextInt(6) + 1;
        // // double y = random.nextDouble();
        // boolean z = random.nextBoolean();

        // System.out.println(z);

        /* 7. IF statements */

        int age = 15;

        if (age >= 18) {
            System.out.println("You are an adult!");
        } else {
            System.out.println("You are a child!");
        }
    }
}