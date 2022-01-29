import java.util.Scanner;

public class PooJava {

    public static void main(String[] args) {
        VideoGame game1 = new VideoGame();
        game1.name = "Xbox one S";
        game1.color = "White";
        game1.batery = true;

        VideoGame game2 = new VideoGame();
        game2.name = "PS4";
        game2.color = "Black";
        game2.batery = false;

        System.out.println("Whats is your name ?");
        Scanner day = new Scanner(System.in);
        String name = day.nextLine();

        System.out.println("Hello " + name);

        System.out.println(game1.getName() + " is " + game1.getColor() + " has batery ? " + game1.getBatery());
        System.out.println(game2.getName() + " is " + game2.getColor() + " has batery ? " + game2.getBatery());
    }
}
