package characters.beast;
import  characters.Characters;

public class Goblins extends Beasts {
    public Goblins(int life, int shield, String name) {
        super(life, shield, name);
    }

    @Override
    public int getModAttack(Characters defense){
        return 0;
    };

    @Override
    public int getModDefense(Characters attack){
        return 0;
    };
}
