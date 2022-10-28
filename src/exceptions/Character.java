package exceptions;

public class Character {
    private int health;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Character() {
        health = 100;
    }

    public void getsBlow(int damageHealth) throws MyCustomException {
        int result = getHealth() - damageHealth;
        if (result < 0) {
            setHealth(result);
            throw new MyCustomException();
        } else {
            setHealth(result);
        }
    }
}
