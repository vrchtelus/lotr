package characters.heroes;
import  characters.Characters;
import  utils.Utils;

public class Humans extends Heroes{
    public Humans(int life, int shield, String name) {
        super(life, shield, name);
    }

    @Override
    public int getModAttack(Characters defense){
        return 0;
    };


    private static String[] nombres = {"Aragon", "Baramir"};
    public static String getRandomName(){
        return Humans.nombres[Utils.generateRandomNumber(0, (nombres.length-1))];
    }
}
