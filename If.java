public class If {
    public static void main(String[] args) {

        boolean Alien = true;

        //If-then statement is used to print a output if it is equal to true or false.
        if (Alien == true){ //by using curly brackets we can print more than one line , without it we can only print one line.

            System.out.println("Alieas are real");
            System.out.println("Area 51");
        }

        int Topscore = 100;

        if(Topscore <= 100){
            System.out.println("Your the topscorer");
        }

        int Sscore = 80;

        if(Topscore == 100 && Sscore <= 100){//(&& - logical And operator)for the logical And operator both the conditions need to be true for the code to execute.
            System.out.println("Both the conditions needed to be True  orelse it will not be true");
        }
// for the if statement we should use the double == operator , orelse it will show error, because we are testing in the if statement if the value assign is true or not.
        if(Topscore >= 100 || Sscore >= 100){//(|| is called the logical or operator) and for this either of the condition need to be true.
            System.out.println("Either of the statement should be true");
        }

        Boolean car = false;
        if (car == false){
            System.out.println("this is a car");
        }//Note: while using boolean you need to be careful , beacause in boolean if we don't use the double assignment operator it will still give the output , here it is not testing if the value is true or not , it will directly give the output if "==" this is not present.

        if (!car){ // ! not operator , it is used to check for the opposite value , it will return true because car is set to false , which is true.
            System.out.println("Yeah it is tue ");
        }
    }


}
