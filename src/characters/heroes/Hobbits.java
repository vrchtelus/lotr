package characters.heroes;
import  characters.Characters;
import  characters.beast.Goblins;
import  utils.Utils;

public class Hobbits extends Heroes{
    public Hobbits(int life, int shield, String name) {
        super(life, shield, name);
    }

    @Override
    public int getModAttack(Characters defense) {
        if (defense instanceof Goblins){
            System.out.println("       The hobbits were frightened of the goblins and attacked more softly. -5");
            return -5;
        }
        return 0;
    };


    private static String[] nombres = {"Froddo", "Bilbo","Sam"};
    public static String getRandomName(){
        return Hobbits.nombres[Utils.generateRandomNumber(0, (nombres.length-1))];
    }

}
