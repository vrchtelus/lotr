package characters;
import characters.beast.Beasts;
import characters.heroes.Heroes;
import utils.Utils;

public class Characters extends Object {
    private int life;
    private int shield;
    private String name;
    private int attack;
    private int defaultShield;

    public Characters(int life, int shield, String name) {
        super();
        this.life = life;
        this.shield = shield;
        this.name = name;
        this.attack = 0;
        this.defaultShield = shield;
    }
    abstract public int getNumberDice();

    abstract public int getModAttack(Characters defense);

    abstract public int getModDefense(Characters attack);

    public boolean isAlive() {
        return life > 0;
    }

    public int getAttack() {
        return this.attack;
    }
    public void setAttack(int attack){
        this.attack = attack;
    }

    public void restoreShieldAttack(){
        this.attack = 0;
        this.shield = this.defaultShield;
    }

    public String getClassName(){
        return this.getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return "- " + getName() + ": life: " +
                getLife() + ", shield: " + getShield() + ((this.isAlive()) ? ", is alive." : ", is dead.");
    }


    public void preparAttack(Characters p2) {
        int amount = Utils.rollDiceNTimesGreaterNumber(this.getNumberDice(), 50, 100, "Preparing the attack of " + this.getName()) + this.getModAttack(p2);
        this.setAttack(amount);
    }

    // this=nicolas p1=oliver
    public void defend(Characters p1) {
        this.setShield(this.getModDefense(p1) + this.getShield());
        if (p1.getAttack() > this.getShield()) {
            int damage = p1.getAttack() - this.getShield();
            this.life -= damage;
            if (this.life < 0) {
                this.life = 0;
            }
            System.out.println("     " + p1.getName() + "'s attack was successful. " + this.getName()
                    + " recieve "+ damage +" damage, and ended up with " + this.getLife() + " life.");
        } else {
            System.out.println("     " + p1.getName()+"'s attack was completely block by "+this.getName());
        }
    }
    public int getLife() {
        return this.life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getShield() {
        return this.shield;
    }

    public void setShield(int shield) {
        this.shield = shield;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
