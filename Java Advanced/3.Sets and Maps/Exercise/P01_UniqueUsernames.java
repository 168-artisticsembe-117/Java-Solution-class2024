import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashSet<String> usernames = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
            usernames.add(scanner.nextLine());
        }

        usernames.forEach(System.out::println);
    }
}