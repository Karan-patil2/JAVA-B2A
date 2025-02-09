//In this challenge, we'll be using the NATO alphabet to replace a character or letter, with NATO's standardized word for that letter.
//In radio transmissions, the word car, "C", "A", "R", would be read, "Charlie Able Roger", for clarity.
//We'll take a single character, and return the matching word from the NATO phonetic alphabet, shown on this slide.
//We'll just do this for the letters A, through E.




public class challenge6 {
    public static void main(String[] args) {
        char day = 'D';

        switch (day){
            case 'A' :
                System.out.println("A is Able ");
                break;
            case 'B':
                System.out.println("B is Baker");
                break;
            case 'C':
                System.out.println("C is Charlie");
                break;
            case 'D':
                System.out.println("D is Dog");
                break;
            case 'E':
                System.out.println("E is Easy");
                break;
            default:
                System.out.println(day + " Not found ");
                break;

        }
    }
}
