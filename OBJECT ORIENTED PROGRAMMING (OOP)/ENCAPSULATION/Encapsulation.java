public class Encapsulation {
    public static void main(String[] args) {

 //       Player player = new Player();
 //       player.Name = "Karan";
 //       player.health = 200;
 //       player.weapon = "Sword";
//
 //        int damage = 10;
 //       player.losehealth(damage);
//
 //        System.out.println("Remaining Health is " +player.healthRemaining());
//
   //      player.health = 300;
     //   player.losehealth(10);
//
   //      System.out.println("Remaining Health "+player.healthRemaining());


        EnhancedPlayer Karan = new EnhancedPlayer("Karan" , 200,"Sword");
        System.out.println("Initial Health is " +Karan.healthRemaining());


    }
}
