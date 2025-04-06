public class Player {

    public String Name;
    public int health;
    public String weapon;

    public void losehealth(int Damage){
            health = health - Damage;

            if(health <= 0){
                System.out.println("Player is knocked Out");
            }
    }

    public int healthRemaining(){
        return health;
    }

    public void restorehealth(int extrahealth){
        health = health + extrahealth;

        if (health >= 100){
            System.out.println("Health is restored to 100%");
            health = 100;
        }
    }
}


// this code is not using encapsulation thats why we can change the value anywhere as we want , and there are also following problems :

// 1 .Allowing direct access to data on an object can potentially bypass checks and additional processing your class has in place to manage the data.
// 2 .Allowing direct access to fields means calling code would need to change when you edit any of the fields.
// 3 .Omitting a constructor that would accept initialization data means the calling code is responsible for setting up this data on the new object.


