import java.util.Random;

public class MegaSena {

    public static void main(String[] args) {
        Random increment = new Random();
/*          int x = 0;
        //While
      while(x < 6){
            int number = increment.nextInt(60);
            System.out.println(number);
            x ++;
*/
        //for
        for (int x = 0; x < 6; x++) {
            int number = increment.nextInt(60);
            System.out.print(number + ".");
        }
    }
}
