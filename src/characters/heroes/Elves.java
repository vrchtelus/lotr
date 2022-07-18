package characters.heroes;
import  characters.Characters;
import  characters.beast.Orcs;
import  utils.Utils;

public class Elves extends Heroes{
    public Elves(int life, int shield, String name) {
        super(life, shield, name);
    }

    @Override
    public int getModAttack(Characters defense) {
        if (defense instanceof Orcs) {
            System.out.println("      Elves hate orcs so their attack power increases. +10");
            return 10;
        }
        return 0;
    };

    private static String[] nombres = { "Legolas", "Bladimir" };

    public static String getRandomName() {
        return Elves.nombres[Utils.generateRandomNumber(0, (nombres.length - 1))];
    }

}
