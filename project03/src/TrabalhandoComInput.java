import java.util.Random;
import java.util.Scanner;

public class TrabalhandoComInput {

    public static void main(String[] args) {
        String password = "12345";
        System.out.println("Digite sua senha: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(input.equals(password));
    }
}
