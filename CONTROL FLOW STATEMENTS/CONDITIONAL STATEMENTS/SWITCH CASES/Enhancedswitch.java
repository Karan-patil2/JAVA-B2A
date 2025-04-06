public class Enhancedswitch {
    public static void main(String[] args) {
        String month = "MARCH" ;
        System.out.println(month + " is in the " +Quater(month) + " quater ");
    }

    public static String Quater(String month){
        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> "1ST";
            case "APRIL", "MAY", "JUNE" -> "2ND";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3RD";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4TH";
            default -> "bad";
        };
    }
}
// this is enhanced switch case in this there is no need of the : and break statement.

//output :
//MARCH is in the 1ST quater.