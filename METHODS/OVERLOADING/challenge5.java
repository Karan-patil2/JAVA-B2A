//In this challenge, we're going to create a method, that takes time, represented in seconds, as the parameter.
//We'll then want to transform the seconds into hours.
//Next, you'll display the time in hours with the remaining minutes and seconds in a String.
//We'll do this transformation in two steps, which allows us to use overloaded methods.


//We want to create two methods with the same name:  getDurationString
//The first method has one parameter of type int, named seconds.
//The second method has two parameters, named minutes and seconds, both ints.
//Both methods return a String in the format shown:‘XXh YYm ZZs’where XX represents the number of hours, YY the number of minutes, and ZZ the number of seconds.
//The first method should in turn call the second method to return its results.

//Make both methods public and static as we've been doing so far in this course.
//Remember that one minute is 60 seconds, and one hour equals 60 minutes, or 3600 seconds.
//Start by creating a new project, and call it SecondsAndMinutesChallenge.

//Add validation to the methods as a bonus:
//For the first method, the seconds parameter should be  >= 0.
//For the second method, the minutes parameter should be >= 0, and the seconds parameter should be >= 0, and <= 59.
//If either method is passed an invalid value, print out some type of meaningful message to the user.



public class challenge5 {
    public static void main(String[] args) {
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(65  , 45));
    }

    public static String getDurationString(int seconds){// both gives same output but looks duplicates of each other so for that we have a different approach.
        if(seconds < 0){
            return "Invalid data for seconds (" + seconds + ") , must be positive value.";
        }

        int minutes = seconds / 60;
        return getDurationString( seconds /60  , seconds % 60 );
       // int hours = minutes / 60;
       // int remainingminutes = minutes % 60;
        // int remainingsecconds = seconds % 60;


    }

    public static String getDurationString(int minutes , int seconds){
        if(minutes < 0){
            return "Invalid data for seconds (" + minutes + ") , must be positive value.";
        }
        if(seconds < 0 || seconds > 59 ){
            return "Invalid data for seconds (" + seconds + ") , must be between 0 to 59.";
        }
        int hours = minutes / 60;
        int remainingminutes = minutes % 60;
        int remainingsecconds = seconds % 60;

        return   hours + " h "  + remainingminutes + " M "  + seconds + " S ";

    }
}
