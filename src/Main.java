import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter a double number: " );

        Scanner in = new Scanner(System.in);

        String s = in.nextLine();

        String output = String.valueOf(s); // Converting Double data to String data

        System.out.println("Double to string conversion: " + output);
    }
}