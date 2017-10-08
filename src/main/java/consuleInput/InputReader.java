package consuleInput;

import java.util.Scanner;

/**
 * Created by tiffany on 10/5/17.
 */
public class InputReader {

    Scanner scan = new Scanner(System.in);
    String input;

    public String reader(String prompt) {
        System.out.println(prompt);
        input = scan.nextLine();
        return input;
    }

    public int toIntegerReader(String prompt) {
        System.out.println(prompt);
        input = scan.nextLine();
        return Integer.parseInt(input);
    }

    public void close() {
        scan.close();
    }

}
