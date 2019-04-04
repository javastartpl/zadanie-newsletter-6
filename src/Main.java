import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.append("Oto rozwiazanie\n");

        System.out.append("Wprowadz teskt: ");
        String txt = scan.nextLine();

        System.out.append("Wprowadzony teskt to: \"" + txt+"\"");

        scan.close();
    }
}
