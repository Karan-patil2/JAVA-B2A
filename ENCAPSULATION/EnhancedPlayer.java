public class EnhancedPlayer {

    private String FullName;
    private int healthPercentage;
    private String Weapon;

    public EnhancedPlayer(String FullName) {
        this(FullName, 100, "Sword");
    }

    public EnhancedPlayer(String fullName, int health, String weapon) {
        this.FullName = fullName;

        if (health <= 0) {
            this.healthPercentage = 1;
        } else if (health >= 100) {
            this.healthPercentage = 100;
        } else {
            this.healthPercentage = health;
        }

        this.Weapon = weapon;
    }

    public void losehealth(int Damage) {
        healthPercentage = healthPercentage - Damage;

        if (healthPercentage <= 0) {
            System.out.println("Player is knocked Out");
        }
    }

    public int healthRemaining() {
        return healthPercentage;
    }

    public void restorehealth(int extrahealth) {
        healthPercentage = healthPercentage + extrahealth;

        if (healthPercentage >= 100) {
            System.out.println("Health is restored to 100%");
            healthPercentage = 100;
        }

    }

}

// BeneFits of Encapsulation :
//That's really one of the huge benefits of encapsulation. Changes made do not affect any other code.
//It's like a black box in many ways.
//But the enhanced player class has full control over its data.

//This is why you want to use encapsulation.
//We protect the members of the class and some methods from external access.
//This prevents calling code from bypassing the rules and constraints we've built into the class.
//When I create a new instance, it's initialized with valid data.
//But likewise, I'm also making sure that there's no direct access to the fields.
//That's why you want to always use encapsulation.
//It's something that you should really get used to and use.

//Encapsulation Principles:

//To create an encapsulated class, you want to:
//Create constructors for object initialization, which enforces that only objects with valid data will get created.
//Use the private access modifier for your fields.
//Use setter methods sparingly and only as needed.
//Use access modifiers that aren't private, only for the methods that the calling code needs to use.
