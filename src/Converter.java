import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {

        System.out.println("Please enter a double number: " );

        Scanner in = new Scanner(System.in);

        String s = in.nextLine();

        // Converting Double data to String data
        String output = String.valueOf(s);

        System.out.println("Double to string conversion: " + output);

    }
}
