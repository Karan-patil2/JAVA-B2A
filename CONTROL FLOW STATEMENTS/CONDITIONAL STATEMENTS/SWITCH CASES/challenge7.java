public class challenge7 {
    public static void main(String[] args) {
        printDayOfWeek(1);
        printweekday(1);
    }
    public static void printDayOfWeek(int day){
        String dayofweek = switch (day){
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Day not found";
        };
        System.out.println(day + " Stands for " + dayofweek);
    }

    public static void printweekday(int day){
        if (day == 0){
            System.out.println("Day is Sunday");
        }else if(day == 1){
            System.out.println("Day is Monday");
        }else if(day == 2){
            System.out.println("Day is tuesday");
        }else if(day == 3){
            System.out.println("Day is Wednesday ");
        }else if(day == 4){
            System.out.println("Day is Thursday ");
        } else if (day == 5) {
            System.out.println("Day is Friday ");
        } else if (day == 6) {
            System.out.println(" Day is Saturday");
        }else{
            System.out.println(" Invaild Day ");
        }

    }



}
