import java.util.Scanner;

public class ColorMeaningChecker {

    // ANSI escape codes for color output (optional)
    public static final String RED = "\u001B[31m";
    public static final String BLUE = "\u001B[34m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLACK = "\u001B[30m";
    public static final String WHITE = "\u001B[37m";
    public static final String RESET = "\u001B[0m";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Color Meaning Checker!");

        while (true) {
            System.out.print("\nEnter a color name (red, blue, yellow, green, black, white): ");
            String color = scanner.nextLine().trim().toLowerCase();

            switch (color) {
                case "red":
                    System.out.println(RED + "Red → Passion, Energy, Confidence" + RESET);
                    break;
                case "blue":
                    System.out.println(BLUE + "Blue → Calmness, Trust, Intelligence" + RESET);
                    break;
                case "green":
                    System.out.println(GREEN + "Green → Growth, Balance, Harmony" + RESET);
                    break;
                case "yellow":
                    System.out.println(YELLOW + "Yellow → Happiness, Optimism, Creativity" + RESET);
                    break;
                case "black":
                    System.out.println(BLACK + "Black → Power, Mystery, Elegance" + RESET);
                    break;
                case "white":
                    System.out.println(WHITE + "White → Purity, Simplicity, Peace" + RESET);
                    break;
                default:
                    System.out.println("Sorry! The color '" + color + "' is not in our list.");
                    break;
            }

            System.out.print("Do you want to check another color? (yes/no): ");
            String choice = scanner.nextLine().trim().toLowerCase();
            if (!choice.equals("yes")) {
                System.out.println("Thank you for using Color Meaning Checker. Goodbye!");
                break;
            }
        }

        scanner.close();
    }
}
