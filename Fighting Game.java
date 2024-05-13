public class Fighter {
    private String name;
    private int health;
    private int attackPower;

    public Fighter(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public void attack(Fighter opponent) {
        opponent.health -= this.attackPower;
        System.out.println(this.name + " attacks " + opponent.name + " for " + this.attackPower + " damage!");
    }

    public boolean isAlive() {
        return health > 0;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getAttackPower() {
        return attackPower;
    }
}

public class Main {
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("Ali", 100, 20);
        Fighter fighter2 = new Fighter("Aisha", 120, 15);

        while (fighter1.isAlive() && fighter2.isAlive()) {
            fighter1.attack(fighter2);
            fighter2.attack(fighter1);
            System.out.println(fighter1.getName() + " remaining HP: " + fighter1.getHealth());
            System.out.println(fighter2.getName() + " remaining HP: " + fighter2.getHealth());
        }

        if (fighter1.isAlive()) {
            System.out.println(fighter1.getName() + " wins the fight!");
        } else {
            System.out.println(fighter2.getName() + " wins the fight!");
        }
    }
}