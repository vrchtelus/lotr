package utils;
import java.util.Random;
import java.util.Scanner;
public class Utils {
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static int rollDiceNTimesGreaterNumber(int times, int min, int max, String message) {
        System.out.println("\n     ******* " + message);
        int res = 0;
        int tmp = 0;
        for (int i = 1; i <= times; i++) {
            requestEnter("     Press enter to roll the dice, time: "+i+"\n");
            tmp = generateRandomNumber(min, max);
            System.out.println("          The result is:" + tmp);
            if (tmp > res) {
                res = tmp;
            }
        }
        System.out.println("     The highest number obtained was:" + res);
        requestEnter("     Press enter to continue");

        return res;

    }

    public static int generateRandomNumber(int min, int max) {
        // int tmp = random.nextInt(max-min)+min;
        // System.out.println(tmp);

        // return tmp;
        return random.nextInt(max - (min - 1)) + 1 + (min - 1);
    }
    public static String requestEnter(String mensaje) {
        String respuesta = "";

        System.out.println("\n" + mensaje);
        respuesta = scanner.nextLine();
        // scanner.nextLine();//probar

        return respuesta;
    }
}
