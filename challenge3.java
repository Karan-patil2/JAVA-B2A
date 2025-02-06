//challenge 3 -
// The first method should be named displayHighScorePosition.
//This method should have two parameters, one for a player's name, and one for a player's position in a high score list.
//This method should print a message like "Tim managed to get into position 2 on the high score list".

//The second method should be named calculateHighScorePosition.
//This method should have only one parameter, the player's score.
//This method should return a number between 1 and 4, based on the score values shown in this table.

//Score greater than or equal to 1000 - 1
//Score greater than or equal to 500 but less than 1000 - 2
//Score greater than or equal to 100 but less than 500 - 3
//All other scores - 4



public class challenge3 {
    public static void main(String[] args) {
       int position = calculateHighScorePosition(1000);
      displayHighScorePosition("Karan" , position);

        position = calculateHighScorePosition(800);
        displayHighScorePosition("Goro" , position);

        position = calculateHighScorePosition(999);
        displayHighScorePosition("Nandu" , position);

        position = calculateHighScorePosition(69);
        displayHighScorePosition("Sum-Sum" , position);

    }
    public static void displayHighScorePosition(String Name , int position){
        System.out.println(Name+ " managed to get the Position " +position);
    }

    public static int calculateHighScorePosition(int Score) {

        if (Score >= 1000) {
            return 1;
        } else if (Score >= 500) {
            return 2;
        } else if (Score >= 100) {
            return 3;
        }
        return 4;
    }

}
