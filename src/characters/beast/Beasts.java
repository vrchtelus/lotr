package characters.beast;

import characters.Characters;
import utils.Utils;

public class Beasts extends Characters {
    public Beasts(int life, int shield, String name) {
        super(life, shield, name);
    }

    @Override
    public int getNumberDice(){
        return 1;
    }

    public static Characters newInstanceRandom(int life, int shield, int number){
        Characters res = null;
        int tipoHeroe = Utils.generateRandomNumber(1, 2);
        // System.out.println(" vamos a una instancia de "+tipoHeroe);

        switch (tipoHeroe) {
            case 1:
                //Orco
                return (Characters) (new Orcs(life, shield, "Orc "+number ));
            case 2:
                //hobbit
                return (Characters) (new Goblins(life, shield, "Goblin "+number ));
        }
        return res;
    }
}

